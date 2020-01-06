package com.github.curriculeon.fundamentals.vowelutils;

import org.junit.Assert;
import org.junit.Test;
import com.github.curriculeon.fundamentals.VowelUtils;

/**
 * @author leon on 09/12/2018.
 */
public class GetIndexOfFirstVowel {
    @Test
    public void test1() {
        // given
        String input = "Psychological Warfare";
        Integer expected = 5;

        // when
        Integer actual = VowelUtils.getIndexOfFirstVowel(input);

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        // given
        String input = "Psych!";
        Integer expected = -1;

        // when
        Integer actual = VowelUtils.getIndexOfFirstVowel(input);

        // then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void test3() {
        // given
        String input = "Pterodactyl";
        Integer expected = 2;

        // when
        Integer actual = VowelUtils.getIndexOfFirstVowel(input);

        // then
        Assert.assertEquals(expected, actual);
    }
}
