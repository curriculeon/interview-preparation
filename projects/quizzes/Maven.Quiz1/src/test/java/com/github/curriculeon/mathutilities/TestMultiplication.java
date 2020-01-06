package com.github.curriculeon.mathutilities;

import com.github.curriculeon.MathUtilities;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author leon on 8/26/18.
 */
public class TestMultiplication {

    private static volatile MathUtilities mathUtils = new MathUtilities();


    @Test
    public void testIntegerMultiplication(){
        // : Given
        int multiplicand = 5;
        int multiplier = 2;
        int expectedInt = 10;
        // : When
        int actualInt = mathUtils.multiply(multiplicand,multiplier);
        // : Then
        assertEquals(expectedInt,actualInt);
    }
    @Test
    public void testLongMultiplication() {
        // : Given
        long multiplicand = 20;
        long multiplier = 1000;
        long expectedLong = 20000;
        // : When
        long actualLong = mathUtils.multiply(multiplicand, multiplier);
        // : Then
        assertEquals(expectedLong, actualLong);
    }

    @Test
    public void testFloatMultiplication() {
        // : Given
        float multiplicand = 2.5F;
        float multiplier = 1;
        float expectedFloat = 2.50F;
        // : When
        float actualFloat =  mathUtils.multiply(multiplicand,multiplier);
        // : Then
        assertEquals(expectedFloat, actualFloat, 0);
    }
    @Test
    public void testDoubleMultiplication() {
        // : Given
        double multiplicand = 3.25;
        double multiplier = 3.0;
        double expectedDouble = 9.75;
        // : When
        double actualDouble = mathUtils.multiply(multiplicand,multiplier);
        // : Then
        assertEquals(expectedDouble, actualDouble, 0);
    }
}
