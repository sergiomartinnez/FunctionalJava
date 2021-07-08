package com.platzi.functional._06_reference_operator;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


public class NamesUtils {

    public static void main(String[] args) {
        List<String> teachers = getList("Nicolas", "Juan", "Zulema");


        Consumer<String> printer = text -> System.out.println(text);
        teachers.forEach(printer);
        System.out.println("-------or--------");
        teachers.forEach(System.out::println);
    }

    public static <T> List<T> getList(T... elements){
        return Arrays.asList(elements);
    }
}
