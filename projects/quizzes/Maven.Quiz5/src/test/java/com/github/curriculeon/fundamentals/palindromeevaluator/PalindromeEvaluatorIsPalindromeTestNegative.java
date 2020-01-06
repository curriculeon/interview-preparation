package com.github.curriculeon.fundamentals.palindromeevaluator;

import org.junit.Assert;
import org.junit.Test;
import com.github.curriculeon.fundamentals.PalindromeEvaluator;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeEvaluatorIsPalindromeTestNegative {
    @Test
    public void test1() {
        test("Racecar");
    }

    @Test
    public void test2() {
        test("Redder");
    }

    @Test
    public void test3() {
        test("Redrum murder");
    }

    public void test(String input) {
        Assert.assertFalse(PalindromeEvaluator.isPalindrome(input));
    }
}
