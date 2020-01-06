package com.github.curriculeon.assessment2.collections.monthconversion;

import com.github.curriculeon.assessment2.collections.MonthConversion;
import org.junit.Assert;
import org.junit.Test;

public class MonthConversionAddTest {

    @Test
    public void testAdd1(){
        //Given
        MonthConversion conversion = new MonthConversion();
        Integer expected = 1;

        //When
        conversion.add(1, "January");

        //Then
        Integer actual = conversion.size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testAddMultiples(){
        //Given
        MonthConversion conversion = new MonthConversion();
        Integer expected = 4;

        //When
        conversion.add(1, "January");
        conversion.add(2, "February");
        conversion.add(3, "March");
        conversion.add(4, "April");

        //Then
        Integer actual = conversion.size();
        Assert.assertEquals(expected, actual);
    }
}
