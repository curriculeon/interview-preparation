package com.github.curriculeon.objectorientation.palindromeobject;

import org.junit.Assert;
import org.junit.Test;
import com.github.curriculeon.objectorientation.PalindromeObject;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeObjectIsPalindromeTestNegative {
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
        Assert.assertFalse(new PalindromeObject(input).isPalindrome());
    }
}
