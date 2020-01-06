package com.github.codedifferently;

import org.junit.Assert;

import java.util.Arrays;

public class TestUtilities {
    public static void assertArrayEquals(Object[] expected, Object[] actual) {
        String expectedAsString = Arrays.toString(expected);
        String actualAsString = Arrays.toString(actual);
        Assert.assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }
}
