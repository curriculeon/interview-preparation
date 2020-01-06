package com.github.codedifferently.arrays.arrayutils;

import com.github.codedifferently.arrays.ArrayUtils;
import org.junit.Assert;
import org.junit.Test;

public class BoxTest {
    @Test
    public void test1() {
        char[] input = {'a','b','c','d','e','f','g'};
        Character[] expected = {'a','b','c','d','e','f','g'};
        test(input, expected);
    }

    @Test
    public void test2() {
        char[] input= {'z','x','y','w','v','u','s'};
        Character[] expected = {'z','x','y','w','v','u','s'};
        test(input, expected);
    }

    @Test
    public void test3() {
        char[] input= {'_', '0', ',', '1'};
        Character[] expected = {'_', '0', ',', '1'};
        test(input, expected);
    }

    private void test(char[] input, Character[] expected) {
        // when
        Character[] actual = ArrayUtils.box(input);

        // then
        Assert.assertArrayEquals(expected, actual);
    }
}
