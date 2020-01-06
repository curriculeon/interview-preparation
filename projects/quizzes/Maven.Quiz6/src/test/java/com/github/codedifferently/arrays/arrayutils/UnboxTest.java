package com.github.codedifferently.arrays.arrayutils;

import com.github.codedifferently.arrays.ArrayUtils;
import org.junit.Assert;
import org.junit.Test;

public class UnboxTest {
    @Test
    public void test1() {
        Character[] input = {'a','b','c','d','e','f','g'};
        char[] expected = {'a','b','c','d','e','f','g'};
        test(input, expected);
    }

    @Test
    public void test2() {
        Character[] input = {'z','x','y','w','v','u','s'};
        char[] expected = {'z','x','y','w','v','u','s'};
        test(input, expected);
    }

    @Test
    public void test3() {
        Character[] input = {'_', '0', ',', '1'};
        char[] expected= {'_', '0', ',', '1'};
        test(input, expected);
    }

    private void test(Character[] input, char[] expected) {
        // when
        char[] actual = ArrayUtils.unbox(input);

        // then
        Assert.assertArrayEquals(expected, actual);
    }
}
