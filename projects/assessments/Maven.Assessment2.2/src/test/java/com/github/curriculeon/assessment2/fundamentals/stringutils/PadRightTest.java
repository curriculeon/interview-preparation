package com.github.curriculeon.assessment2.fundamentals.stringutils;

import com.github.curriculeon.assessment2.fundamentals.StringUtils;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author leon on 28/11/2018.
 */
public class PadRightTest {
    @Test
    public void padRight10Test() {
        // Given
        String hello = "hello";
        int numberOfUnitsToPad = 10;
        String expected = "hello     ";

        // When
        String actual = StringUtils.padRight(hello, numberOfUnitsToPad);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void padRight15Test() {
        // Given
        String hello = "";
        int numberOfUnitsToPad = 15;
        String expected = "               ";

        // When
        String actual = StringUtils.padRight(hello, numberOfUnitsToPad);

        // Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void padRight20Test() {
        // Given
        String hello = "The quick";
        int numberOfUnitsToPad = 20;
        String expected = "The quick           ";

        // When
        String actual = StringUtils.padRight(hello, numberOfUnitsToPad);

        // Then
        Assert.assertEquals(expected, actual);
    }
}