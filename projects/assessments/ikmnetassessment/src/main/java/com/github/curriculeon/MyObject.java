package com.github.curriculeon;

import com.github.curriculeon.question3.Child;
import com.github.curriculeon.question7.B;

import java.util.Comparator;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * Created by leon on 1/14/2020.
 */
public class MyObject {
    public void run() {
        question9();
    }

    public void monolithQuestion1() {
        System.out.println(Stream.of("green", "yellow", "blue")
                .max((s1, s2) -> s1.compareTo(s2))
                .filter(s -> s.endsWith("n"))
                .orElse("yellow"));
    }

    public void polylithQuestion1() {
        String[] arrayToStream = {"green", "yellow", "blue"};
        Stream<String> stringStream = Stream.of(arrayToStream);
        Comparator<String> stringComparison = (s1, s2) -> s1.compareTo(s2);
        Optional<String> maxValue = stringStream.min(stringComparison);
        System.out.println("MaxValue = " + maxValue);
        Optional<String> matchedValue = maxValue.filter(s -> s.endsWith("n"));
        String result = matchedValue.orElse("yellow");
        System.out.println("Result = " + result);
    }

    public void question2() {
        Runnable runnable = () -> {
            try {
                System.out.println("Hello");
            } catch(NullPointerException e) {
                System.out.println("An exception occurred!");
            } catch(IndexOutOfBoundsException ioobe) {
                System.out.println("Something else");
            } finally {
                System.out.println("I print this every time no matter what");
            }
        };
    }

    public void question3() {
        Child child = new Child();
    }

    public void question4() {
        Supplier<String> i = () -> "Car";
        Consumer<String> c = someString -> System.out.print(someString.toLowerCase());
        Consumer<String> d = someString -> System.out.print(someString.toUpperCase());
        c
                .andThen(d)
                .accept(i.get());
        System.out.println();
    }

    public void question7() {
        B.main(null);
    }

    public void question8() {
        String str1 = "My String";
        String str2 = new String("My String");

        //System.out.println("String.parse(str1)==str2: " + String.parse(str1)==str2);
        System.out.println("str1 == str2:" + str1 == str2);
        System.out.println("str1.equals(str2):" + str1.equals(str2));
        System.out.println("str1.matches(str2):" + str1.matches(str2));
        int hc1 = str1.hashCode();
        int hc2 = str2.hashCode();
        boolean b = hc1 == hc2;
        System.out.println("str1.hashCode() == str2.hashCode():" + (str1.hashCode() == str2.hashCode()));
    }

    public void question9() {
        question9a();
        question9b();
        question9c();
        question9d();
        question9e();
    }

    public void question9a() {
        System.out.println("----------------- 9A-----------------");
        int a = 0;
        System.out.println((a != 0) ? "true" : "false");
    }

    public void question9b() {
        System.out.println("----------------- 9B-----------------");
        Double d = null;
        System.out.println((d instanceof Double) ? "true" : "false");
    }

    public void question9c() {
        System.out.println("----------------- 9C-----------------");
        int c = 0;
        System.out.println((0 == c++) ? "true" : "false");
    }

    public void question9d() {
        System.out.println("----------------- 9D-----------------");
        String e = "1";
        System.out.println(("1" != e)? "true" : "false");
    }

    public void question9e() {
        System.out.println("----------------- 9E-----------------");
        boolean b = false;
        System.out.println((b = true) ? "true" : "false");
    }


}
