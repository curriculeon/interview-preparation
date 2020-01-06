package com.github.curriculeon.fundamentals.vowelutils;

import org.junit.Assert;
import org.junit.Test;
import com.github.curriculeon.fundamentals.VowelUtils;

/**
 * @author leon on 09/12/2018.
 */
public class HasVowels {
    @Test
    public void test() {
        test1();
        test2();
        test3();
    }
    public void test1() {
        String input = "qwrtypsdfghjklzxcvbnm";
        Assert.assertFalse(VowelUtils.hasVowels(input));
    }

    public void test2() {
        String input = "qwrtypsdfghjklzxcvbnma";
        Assert.assertTrue(VowelUtils.hasVowels(input));
    }

    public void test3() {
        String input = "qwrtypsdfghjklzxcvbnm_";
        Assert.assertFalse(VowelUtils.hasVowels(input));
    }
}
