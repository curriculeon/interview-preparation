package com.github.codedifferently.fundamentals.stringutils;

import com.github.codedifferently.fundamentals.StringUtils;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author leon on 24/01/2019.
 */
public class UpperCaseIndicesTest {
    @Test
    public void test1() {
        String expected = "Ptolemy";
        String actual = StringUtils.upperCaseIndices("ptolemy", 0);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        String expected = "PTolemy";
        String actual = StringUtils.upperCaseIndices("ptolemy", 0,1);
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void test3() {
        String expected = "PTOlemy";
        String actual = StringUtils.upperCaseIndices("ptolemy", 0,1,2);
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void test4() {
        String expected = "PTOLemy";
        String actual = StringUtils.upperCaseIndices("ptolemy", 0,1,2,3);
        Assert.assertEquals(expected, actual);
    }



    @Test
    public void test5() {
        String expected = "PTOLEmy";
        String actual = StringUtils.upperCaseIndices("ptolemy", 0,1,2,3,4);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test6() {
        String expected = "pToLeMy";
        String actual = StringUtils.upperCaseIndices("ptolemy", 1,3,5);
        Assert.assertEquals(expected, actual);
    }
}
