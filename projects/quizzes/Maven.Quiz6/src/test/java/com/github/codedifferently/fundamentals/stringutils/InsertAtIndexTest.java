package com.github.codedifferently.fundamentals.stringutils;

import com.github.codedifferently.fundamentals.StringUtils;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author leon on 10/01/2019.
 */
public class InsertAtIndexTest {
    @Test
    public void test1() {
        String input = "reptilian";
        String expected = "r_eptilian";
        String insertValue = "_";
        Integer indexToReplaceAt = 1;
        test(expected, input, insertValue, indexToReplaceAt);
    }
    @Test
    public void test7() {
        String input = "reptilian";
        String expected = "r__eptilian";
        String insertValue = "__";
        Integer indexToReplaceAt = 1;
        test(expected, input, insertValue, indexToReplaceAt);
    }

    @Test
    public void test8() {
        String input = "airl";
        String expected = "aiXXrl";
        String insertValue = "XX";
        Integer indexToReplaceAt = 2;
        test(expected, input, insertValue, indexToReplaceAt);
    }

    private void test(String expected, String stringToBeManipulated, String valueToBeInserted, Integer index){
        String actual = StringUtils.insertAtIndex(stringToBeManipulated, valueToBeInserted, index);
        Assert.assertEquals(expected, actual);
    }
}
