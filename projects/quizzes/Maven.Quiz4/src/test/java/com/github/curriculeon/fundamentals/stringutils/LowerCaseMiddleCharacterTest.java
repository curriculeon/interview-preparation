package com.github.curriculeon.fundamentals.stringutils;

import org.junit.Assert;
import org.junit.Test;
import com.github.curriculeon.fundamentals.StringUtils;

public class LowerCaseMiddleCharacterTest {
    @Test
    public void test1() {
        // given
        String input = "O";
        String expected = "o";
        test(expected, input);
    }

    @Test
    public void test2() {
        // given
        String input = "OOO";
        String expected = "OoO";
        test(expected, input);
    }

    @Test
    public void test3() {
        // given
        String input = "APPLE";
        String expected = "APpLE";
        test(expected, input);
    }

    @Test
    public void test4() {
        // given
        String input = "Waffle Sauces";
        String expected = "Waffle Sauces";
        test(expected, input);
    }

    public void test(String expected, String input) {
        // when
        String actual = StringUtils.lowerCaseMiddleCharacter(input);

        // then
        Assert.assertEquals(expected, actual);
    }

}
