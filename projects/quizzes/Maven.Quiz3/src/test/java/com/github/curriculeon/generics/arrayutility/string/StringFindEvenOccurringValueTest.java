package com.github.curriculeon.generics.arrayutility.string;

import com.github.curriculeon.generics.ArrayUtility;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author leon on 09/12/2018.
 */
public class StringFindEvenOccurringValueTest {
    @Test
    public void test1() {
        // given
        String expected = "Zip";
        String[] array = {expected, expected, "Code", "Code", "Code", "Wilmington"};
        ArrayUtility<String> utility = new ArrayUtility<>(array);

        // when
        String actual = utility.findEvenOccurringValue();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        // given
        String expected = "(-_-)";
        String[] array = {expected, expected, "Code", "Code", "Code", expected, expected, "Wilmington"};
        ArrayUtility<String> utility = new ArrayUtility<>(array);

        // when
        String actual = utility.findEvenOccurringValue();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        // given
        String expected = "Code";
        String[] array = {"Zip", "Zip", "Zip", expected, expected, expected, "Wilmington", expected, expected, expected};
        ArrayUtility<String> utility = new ArrayUtility<>(array);

        // when
        String actual = utility.findEvenOccurringValue();
        Assert.assertEquals(expected, actual);
    }

}
