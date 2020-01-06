package com.github.curriculeon.fundamentals.palindromeevaluator;

import org.junit.Assert;
import org.junit.Test;
import com.github.curriculeon.fundamentals.PalindromeEvaluator;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeEvaluatorReverseTest {
    @Test
    public void test1() {
        test("leon", "noel");
    }

    @Test
    public void test2() {
        test("Jerry", "yrreJ");
    }

    @Test
    public void test3() {
        test("KJack", "kcaJK");
    }

    @Test
    public void test4() {
        test("redrum murder", "redrum murder");
    }

    public void test(String input, String expected) {
        String actual = PalindromeEvaluator.reverseString(input);
        Assert.assertEquals(expected, actual);
    }
}
