package com.github.curriculeon.fundamentals.stringutils;

import org.junit.Assert;
import org.junit.Test;
import com.github.curriculeon.fundamentals.StringUtils;

public class GetMiddleCharacterTest {
    @Test
    public void test1() {
        // given
        String input = "joint";
        Character expected = 'i';
        test(expected, input);
    }


    @Test
    public void test2() {
        // given
        String input = "burnt";
        Character expected = 'r';
        test(expected, input);
    }


    @Test
    public void test3() {
        // given
        String input = "bang!";
        Character expected = 'n';
        test(expected, input);
    }

    @Test
    public void test4() {
        // given
        String input = "bang!";
        Character expected = 'n';
        test(expected, input);
    }

    private void test(Character expected, String input) {
        // when
        Character actual = StringUtils.getMiddleCharacter(input);

        // then
        Assert.assertEquals(expected, actual);
    }

}
