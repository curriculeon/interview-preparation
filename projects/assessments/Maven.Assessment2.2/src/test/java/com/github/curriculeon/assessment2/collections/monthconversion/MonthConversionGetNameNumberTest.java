package com.github.curriculeon.assessment2.collections.monthconversion;

import com.github.curriculeon.assessment2.collections.MonthConversion;
import org.junit.Assert;
import org.junit.Test;

public class MonthConversionGetNameNumberTest {

    @Test
    public void testGetName_whenExist(){
        //Given
        MonthConversion conversion = new MonthConversion();
        String expectedMonth = "March";
        Integer number = 3;
        conversion.add(number, expectedMonth);

        //When
        String actualName = conversion.getName(number);

        //Then
        Assert.assertEquals(expectedMonth, actualName);
    }

    @Test
    public void testGetName_whenMultipleExist(){
        //Given
        MonthConversion conversion = new MonthConversion();
        String expectedMonth = "May";
        Integer number = 5;
        conversion.add(4, "April");
        conversion.add(number, expectedMonth);
        conversion.add(6, "June");

        //When
        String actualName = conversion.getName(number);

        //Then
        Assert.assertEquals(expectedMonth, actualName);
    }

    @Test
    public void testGetName_whenNotInThere(){
        //Given
        MonthConversion conversion = new MonthConversion();

        conversion.add(4, "April");
        conversion.add(6, "June");

        //When
        String actualName = conversion.getName(10);

        //Then
        Assert.assertNull(actualName);
    }

    @Test
    public void testGetNumber_whenExist(){
        //Given
        MonthConversion conversion = new MonthConversion();
        String month = "March";
        Integer expectedNumber = 3;
        conversion.add(expectedNumber, month);

        //When
        Integer actualNumber = conversion.getNumber(month);

        //Then
        Assert.assertEquals(expectedNumber, actualNumber);
    }

    @Test
    public void testGetNumber_whenMultipleExist(){
        //Given
        MonthConversion conversion = new MonthConversion();
        String month = "May";
        Integer expectedNumber = 5;
        conversion.add(4, "April");
        conversion.add(expectedNumber, month);
        conversion.add(6, "June");

        //When
        Integer actualNumber = conversion.getNumber(month);

        //Then
        Assert.assertEquals(expectedNumber, actualNumber);
    }

    @Test
    public void testGetNumber_whenNotInThere(){
        //Given
        MonthConversion conversion = new MonthConversion();

        conversion.add(4, "April");
        conversion.add(6, "June");


        //When
        Integer actualNumber = conversion.getNumber("aa");

        //Then
        Assert.assertNull(actualNumber);
    }
}
