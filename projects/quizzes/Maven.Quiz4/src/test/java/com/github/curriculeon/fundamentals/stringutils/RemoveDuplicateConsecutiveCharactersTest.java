package com.github.curriculeon.fundamentals.stringutils;

import org.junit.Assert;
import org.junit.Test;
import com.github.curriculeon.fundamentals.StringUtils;

public class RemoveDuplicateConsecutiveCharactersTest {
    @Test
    public void test1() {
        // given
        String input = "Fool";
        String expected = "Fl";
        test(expected, input);
    }

    @Test
    public void test2() {
        // given
        String input = "Mississippi";
        String expected = "Miiii";
        test(expected, input);
    }

    @Test
    public void test3() {
        // given
        String input = "Fleet";
        String expected = "Flt";
        test(expected, input);
    }

    @Test
    public void test4() {
        // given
        String input = "Independence";
        String expected = input;
        test(expected, input);
    }
    @Test
    public void test5() {
        // given
        String input = "Integer";
        String expected = input;
        test(expected, input);
    }

    public void test(String expected, String input) {
        // when
        String actual = StringUtils.removeConsecutiveDuplicateCharacters(input);

        // then
        Assert.assertEquals(expected, actual);
    }
}
