package com.platzi.functional._14_optionals;

import java.util.*;

public class OptionalTest {
    public static void main(String[] args) {
        List<String> names = getNames();
        if(names != null){

        }
        Optional<List<String>> optionalNames = getOptionalNames();
        if (optionalNames.isPresent()){

        }

        optionalNames.ifPresent(namesValue -> namesValue.forEach(System.out::println));

    }





    static List<String> getNames(){
        List<String> names = new LinkedList<>();

        return Collections.emptyList();

    }

    static String mostValuablePlyaer(){
        return null;

    }

    static int mostExpensiveItem(){
        return -1;
    }

    static Optional<List<String>> getOptionalNames(){
        List<String> namesList = new LinkedList<>();
        return Optional.of(namesList);
    }

    //static Optional<String> optionalValuablePlayer()
        //return Optional.ofNullable();

}
