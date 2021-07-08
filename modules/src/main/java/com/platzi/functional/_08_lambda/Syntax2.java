package com.platzi.functional._08_lambda;

import com.platzi.functional._06_reference_operator.NamesUtils;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class Syntax2 {
    public static void main(String[] args) {
        List<String> courses = NamesUtils.getList("java", "Functional");

        courses.forEach(course -> System.out.println(course));

        useZero(() -> 2);

        usePredicate(text -> text.isEmpty());

        useBiFunction((x, y) -> x*y);
    }

    static void useZero(ZeroArguments zeroArguments){

    }

    static void usePredicate(Predicate<String> predicate){

    }

    static void useBiFunction(BiFunction<Integer, Integer, Integer> operation){

    }

    @FunctionalInterface
    interface ZeroArguments{
        int get();
    }

}
