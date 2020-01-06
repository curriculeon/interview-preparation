package com.github.curriculeon.generics.genericarrayutils.powerset;

import org.junit.Test;

/**
 * @author leon on 15/12/2018.
 */
public class PowerSetOfTwoElements {
    @Test
    public void test1() {
        // given
        String[] input = {"1", "2"};
        String expectedString = "[[1, 2], [1], [2], []]";
        PowerSetTest.test(input, expectedString);
    }

    @Test
    public void test2() {
        // given
        String[] input = {"1", "0"};
        String expectedString = "[[0, 1], [0], [1], []]";
        PowerSetTest.test(input, expectedString);
    }

    @Test
    public void test3() {
        // given
        String[] input = {"a", "b"};
        String expectedString = "[[a, b], [a], [b], []]";
        PowerSetTest.test(input, expectedString);
    }

    @Test
    public void test4() {
        // given
        String[] input = {"x", "y"};
        String expectedString = "[[x, y], [x], [y], []]";
        PowerSetTest.test(input, expectedString);
    }


    @Test
    public void test5() {
        // given
        String[] input = {"red", "blue"};
        String expectedString = "[[blue, red], [blue], [red], []]";
        PowerSetTest.test(input, expectedString);
    }
}
