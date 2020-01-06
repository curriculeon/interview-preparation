package com.github.curriculeon.fundamentals.vowelutils;

import org.junit.Assert;
import org.junit.Test;
import com.github.curriculeon.fundamentals.VowelUtils;

/**
 * @author leon on 09/12/2018.
 */
public class StartsWithVowel {
    @Test
    public void test() {
        test1();
        test2();
        test3();
        test4();
    }

    public void test1() {
        String input = "Jumping Jacks";
        Assert.assertFalse(VowelUtils.startsWithVowel(input));
    }


    public void test2() {
        String input = "Hey there world";
        Assert.assertFalse(VowelUtils.startsWithVowel(input));
    }

    public void test3() {
        String input = "Eggnog";
        Assert.assertTrue(VowelUtils.startsWithVowel(input));
    }

    public void test4() {
        String input = "Optical";
        Assert.assertTrue(VowelUtils.startsWithVowel(input));
    }

}
