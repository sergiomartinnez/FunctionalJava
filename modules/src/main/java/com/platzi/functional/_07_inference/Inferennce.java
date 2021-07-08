package com.platzi.functional._07_inference;


import com.platzi.functional._06_reference_operator.NamesUtils;

import java.util.List;
import java.util.function.Function;

public class Inferennce {
    public static void main(String[] args) {
        Function<Integer, String> FunctionConverter =
                Integer -> "Double: " + (Integer * 2) ;

        List<String> alumn = NamesUtils.getList("hugo","paco","Luis");
        alumn.forEach((String name) -> System.out.println(name));
        alumn.forEach(name -> System.out.println(name));
        alumn.forEach(System.out::println);
    }
}
