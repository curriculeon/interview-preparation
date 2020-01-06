package com.github.curriculeon.fundamentals.stringutils;

import org.junit.Assert;
import org.junit.Test;
import com.github.curriculeon.fundamentals.StringUtils;

/**
 * @author leon on 02/01/2019.
 */
public class IsogramNegativeTest {
    @Test
    public void test1() {
        String input = "XX";
        Assert.assertFalse(StringUtils.isIsogram(input));
    }

    @Test
    public void test2() {
        String input = "XXX";
        Assert.assertFalse(StringUtils.isIsogram(input));
    }

    @Test
    public void test3() {
        String input = "AA";
        Assert.assertFalse(StringUtils.isIsogram(input));
    }

    @Test
    public void test4() {
        String input = "AAA";
        Assert.assertFalse(StringUtils.isIsogram(input));
    }


    @Test
    public void test5() {
        String input = "Here";
        Assert.assertFalse(StringUtils.isIsogram(input));
    }

    @Test
    public void test6() {
        String input = "Teared";
        Assert.assertFalse(StringUtils.isIsogram(input));
    }

    @Test
    public void test7() {
        String input = "Brown Fox";
        Assert.assertFalse(StringUtils.isIsogram(input));
    }
}
