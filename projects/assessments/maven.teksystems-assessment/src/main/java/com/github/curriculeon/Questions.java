package com.github.curriculeon;

import java.util.stream.Stream;

/**
 * Created by leon on 1/13/2020.
 */
public class Questions {
    public static void main(String[] args) {
        question1();
    }
    public static void question1() {
        System.out.println(Stream.of("green", "yellow", "blue")
                .max(String::compareTo)
                .filter(s -> s.endsWith("n"))
                .orElse("yellow"));
    }
}
