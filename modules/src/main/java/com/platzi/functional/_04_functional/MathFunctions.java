package com.platzi.functional._04_functional;

import java.util.function.Function;
import java.util.function.Predicate;

public class MathFunctions {
    public static void main(String[] args) {
        Function<Integer, Integer> square = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer x) {
                return x * x;
            }
        };
        System.out.println(square.apply(5));

        Function<Integer, Boolean> isOdd = x -> x % 2 == 1;

        Predicate<Integer> isEven = x -> x % 2 == 0;

        isEven.test(4);

        Predicate<Student> isApproved = student -> student.getCalification() > 6.0;

        Student sergio = new Student(5.9);
        System.out.println(isApproved.test(sergio));


    }

    static class Student {
        private double calification;

        public Student(double calification){
            this.calification = calification;
        }

        public double getCalification() {
            return calification;
        }
    }
}
