package com.github.curriculeon.fundamentals.stringutils;

import org.junit.Assert;
import org.junit.Test;
import com.github.curriculeon.fundamentals.StringUtils;

public class CapitalizeMiddleCharacterTest {
    @Test
    public void test1() {
        // given
        String input = "o";
        String expected = "O";
        test(expected, input);
    }

    @Test
    public void test2() {
        // given
        String input = "ooo";
        String expected = "oOo";
        test(expected, input);
    }

    private void test(String expected, String input) {
        // when
        String actual = StringUtils.capitalizeMiddleCharacter(input);

        // then
        Assert.assertEquals(expected, actual);
    }
}
