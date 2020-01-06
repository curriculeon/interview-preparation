package com.github.curriculeon.fundamentals.stringutils;

import org.junit.Assert;
import org.junit.Test;

import static com.github.curriculeon.fundamentals.StringUtils.invertCasing;

public class InvertCasingTest {
    @Test
    public void test0() {
        String input = "a";
        String expected = "A";
        Assert.assertEquals(expected, invertCasing(input));
    }

    @Test
    public void test1() {
        String input = "Z";
        String expected = "z";
        Assert.assertEquals(expected, invertCasing(input));
    }

    @Test
    public void test2() {
        String expected = "This one is kind of tricky!";
        Assert.assertEquals(expected, invertCasing(invertCasing(expected)));

    }

    @Test
    public void test3() {
        String input = "iNcReAsInG";
        String expected = "InCrEaSiNg";
        Assert.assertEquals(expected, invertCasing(input));
    }

    @Test
    public void test4() {
        String input = "No Big Deal!";
        String expected = "nO bIG dEAL!";
        Assert.assertEquals(expected, invertCasing(input));
    }

    @Test
    public void test5() {
        String expected = "#^@!&*$(%$";
        Assert.assertEquals(expected, invertCasing(expected));
    }
}
