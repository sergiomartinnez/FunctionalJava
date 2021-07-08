package com.platzi.functional._10_chaining;

import com.sun.tools.javac.jvm.Code;

public class ChainingTest {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("hi")
                .append("student")
                .append("from")
                .append("platzi");

        Chainer chainer = new Chainer();
        chainer.sayHi().sayBye();
    }

    static class Chainer {
        public Chainer sayHi(){
            System.out.println("hi");
            return this;
        }
        public Chainer sayBye(){
            System.out.println("bye");
            return this;
        }
    }
}
