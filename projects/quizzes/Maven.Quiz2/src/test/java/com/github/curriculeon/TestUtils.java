package com.github.curriculeon;

import org.junit.Assert;

import java.util.Arrays;

public class TestUtils {
    public static void assertArrayEquals(Object[] expected, Object[] actual) {
        Arrays.sort(actual);
        Arrays.sort(expected);

        // then
        Assert.assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }
}
