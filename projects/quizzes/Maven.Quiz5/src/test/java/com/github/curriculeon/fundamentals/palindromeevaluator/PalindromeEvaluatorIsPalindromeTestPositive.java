package com.github.curriculeon.fundamentals.palindromeevaluator;

import org.junit.Assert;
import org.junit.Test;
import com.github.curriculeon.fundamentals.PalindromeEvaluator;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeEvaluatorIsPalindromeTestPositive {
    @Test
    public void test1() {
        test("racecar");
    }

    @Test
    public void test2() {
        test("racEcar");
    }
    
    @Test
    public void test3() {
        test("redder");
    }
    
    @Test
    public void test4() {
        test("redrum murder");
    }
    
    public void test(String input) {
        Assert.assertTrue(PalindromeEvaluator.isPalindrome(input));
    }
}
