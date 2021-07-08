package com.platzi.functional._04_functional;

import com.sun.org.apache.xpath.internal.objects.XNumber;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class StrinfFunctions {
    public static void main(String[] args) {
        UnaryOperator<String> quote = text -> "\"" + text + "\"";

        System.out.println(quote.apply("hello world from platzi"));

        BiFunction<Integer, Integer, Integer> multiplication =
                (x, y) -> x*y;
        System.out.println(multiplication.apply(5,4));

        BinaryOperator<Integer> mutliplic =
                (x,y) -> x*y;
        System.out.println(mutliplic.apply(5,4));

        BiFunction<String, Integer, String> leftpad =
                (text, number) -> String.format("%" + number + "s", text);
        System.out.println(leftpad.apply("java",10));
    }

}
