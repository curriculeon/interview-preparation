package com.github.curriculeon.question7;

/**
 * Created by leon on 1/14/2020.
 */
public class B {
    int x = 5;

    public static void main(String[] args) {
        // public int x = 6; // compile time error
        B b = new B();
        System.out.println(b.x);
    }
}
