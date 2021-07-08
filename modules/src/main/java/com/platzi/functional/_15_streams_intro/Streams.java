package com.platzi.functional._15_streams_intro;

import com.platzi.functional._06_reference_operator.NamesUtils;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        List<String> courseList = NamesUtils.getList("java", "frontEnd", "backend", "fullstack");

        Stream<String> coursesStream = Stream.of("Java" ,"FrontEnd", "BackEnd", "FullStack");

        //Stream<Integer> courseLenghtStream = coursesStream.map(course -> course.length());
       // Optional<Integer> longest = courseLenghtStream.max((x , y) -> y -x);

        Stream<String> emphasisCourses = coursesStream.map(course -> course + "!");
        emphasisCourses.forEach(System.out::println);

        Stream<String> coursesStream2 = courseList.stream();
        coursesStream2.map(course -> course + "!!")
                .filter(course -> course.contains("Java"))
                .forEach(System.out::println);
    }
}
