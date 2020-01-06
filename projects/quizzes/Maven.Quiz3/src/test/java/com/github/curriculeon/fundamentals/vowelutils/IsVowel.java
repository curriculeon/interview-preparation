package com.github.curriculeon.fundamentals.vowelutils;

import org.junit.Assert;
import org.junit.Test;
import com.github.curriculeon.fundamentals.VowelUtils;

/**
 * @author leon on 09/12/2018.
 */
public class IsVowel {
    @Test
    public void test() {
        test1();
        test2();
        test3();
        test4();
        test5();
        test6();
    }

    public void test1() {
        Assert.assertTrue(VowelUtils.isVowel('a'));
    }

    public void test2() {
        Assert.assertTrue(VowelUtils.isVowel('A'));
    }

    public void test3() {
        Assert.assertTrue(VowelUtils.isVowel('E'));
    }

    public void test4() {
        Assert.assertTrue(VowelUtils.isVowel('e'));
    }

    public void test5() {
        Assert.assertTrue(VowelUtils.isVowel('I'));
    }

    public void test6() {
        Assert.assertTrue(VowelUtils.isVowel('i'));
    }
}
