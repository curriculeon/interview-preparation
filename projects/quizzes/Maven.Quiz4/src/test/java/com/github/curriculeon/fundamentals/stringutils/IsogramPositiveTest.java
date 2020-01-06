package com.github.curriculeon.fundamentals.stringutils;

import org.junit.Assert;
import org.junit.Test;
import com.github.curriculeon.fundamentals.StringUtils;

public class IsogramPositiveTest {
    @Test
    public void test1() {
        String input = "Jump";
        Assert.assertTrue(StringUtils.isIsogram(input));
    }

    @Test
    public void test2() {
        String input = "Jj";
        Assert.assertTrue(StringUtils.isIsogram(input));
    }

    @Test
    public void test3() {
        String input = "Jj0Oo";
        Assert.assertTrue(StringUtils.isIsogram(input));
    }


    @Test
    public void test4() {
        String input = "The Quick";
        Assert.assertTrue(StringUtils.isIsogram(input));
    }

    @Test
    public void test5() {
        String input = "Brown";
        Assert.assertTrue(StringUtils.isIsogram(input));
    }




}
