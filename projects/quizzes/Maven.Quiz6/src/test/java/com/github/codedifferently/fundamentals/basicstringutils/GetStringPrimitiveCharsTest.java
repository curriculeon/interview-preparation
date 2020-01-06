package com.github.codedifferently.fundamentals.basicstringutils;

import com.github.codedifferently.fundamentals.BasicStringUtils;
import org.junit.Assert;
import org.junit.Test;

public class GetStringPrimitiveCharsTest {
    @Test
    public void test1() {
        // given
        String expected = "The quick brown fox";
        test(expected);
    }

    @Test
    public void test2() {
        // given
        String expected = "jumps over the lazy dog";
        test(expected);
    }

    @Test
    public void test3() {
        // given
        String expected = "Single responsibility principle";
        test(expected);
    }

    @Test
    public void test4() {
        // given
        String expected = "Abstraction is the process of removing (superfluous) details from client-view.";
        test(expected);
    }

    private void test(String expected) {
        char[] input = expected.toCharArray();

        // when
        String actual = BasicStringUtils.getString(input);

        // then
        Assert.assertEquals(expected, actual);
    }
}
