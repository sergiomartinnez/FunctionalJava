package com.platzi.functional._11_composition;

import java.util.function.Function;

public class MathOperations2 {
    public static void main(String[] args) {
        Function<Integer, Integer> multiplyby3 = x -> {
            System.out.println("Multiply x: " + x + " by 3");
            return x * 3;
        };

        Function<Integer, Integer> add1multiplyby3 = multiplyby3.compose(y -> {
            System.out.println("Add 1 to: " + y);
            return y + 1;
        });

        Function<Integer, Integer> andSquare = add1multiplyby3.andThen(x -> {
            System.out.println("Im elevating " + x + " by square");
            return x * x;
        });

        System.out.println(add1multiplyby3.apply(5));
        System.out.println(andSquare.apply(3));
    }
}
