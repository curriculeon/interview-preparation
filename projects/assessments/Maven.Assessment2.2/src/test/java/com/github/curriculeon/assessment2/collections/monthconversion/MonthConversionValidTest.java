package com.github.curriculeon.assessment2.collections.monthconversion;

import com.github.curriculeon.assessment2.collections.MonthConversion;
import org.junit.Assert;
import org.junit.Test;

public class MonthConversionValidTest {

    @Test
    public void testIsValidNumber_whenExist(){
        //Given
        MonthConversion conversion = new MonthConversion();
        String expectedMonth = "March";
        Integer number = 3;
        conversion.add(number, expectedMonth);

        //When
        Boolean actual = conversion.isValidNumber(number);

        //Then
        Assert.assertTrue(actual);
    }

    @Test
    public void testIsValidNumber_whenNotExist(){
        //Given
        MonthConversion conversion = new MonthConversion();
        String expectedMonth = "March";
        Integer number = 3;
        conversion.add(number, expectedMonth);

        //When
        Boolean actual = conversion.isValidNumber(10);

        //Then
        Assert.assertFalse(actual);
    }


    @Test
    public void testIsValidMonth_whenExist(){
        //Given
        MonthConversion conversion = new MonthConversion();
        String month = "May";
        Integer expectedNumber = 5;
        conversion.add(4, "April");
        conversion.add(expectedNumber, month);
        conversion.add(6, "June");

        //When
        Boolean actual = conversion.isValidMonth(month);

        //Then
        Assert.assertTrue(actual);
    }

    @Test
    public void testIsValidMonth_whenNotExist(){
        //Given
        MonthConversion conversion = new MonthConversion();
        conversion.add(4, "April");

        //When
        Boolean actual = conversion.isValidMonth("aa");

        //Then
        Assert.assertFalse(actual);
    }
}
