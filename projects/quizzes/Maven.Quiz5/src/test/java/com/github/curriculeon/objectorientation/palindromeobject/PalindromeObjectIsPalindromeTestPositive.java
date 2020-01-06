package com.github.curriculeon.objectorientation.palindromeobject;

import org.junit.Assert;
import org.junit.Test;
import com.github.curriculeon.objectorientation.PalindromeObject;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeObjectIsPalindromeTestPositive {
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
        Assert.assertTrue(new PalindromeObject(input).isPalindrome());
    }
}
