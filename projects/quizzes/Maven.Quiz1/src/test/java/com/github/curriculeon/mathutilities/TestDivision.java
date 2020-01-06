package com.github.curriculeon.mathutilities;

import com.github.curriculeon.MathUtilities;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author leon on 8/26/18.
 */
public class TestDivision {
    private static volatile MathUtilities mathUtils = new MathUtilities();


    @Test
    public void testIntegerDivision() {
        // : Given
        int dividend = 20;
        int divisor = 2;
        int expectedInt = 10;
        // : When
        int actualInt = mathUtils.divide(dividend, divisor);
        // : Then
        assertEquals(expectedInt, actualInt);
    }

    @Test
    public void testLongDivision() {
        // : Given
        long dividend = 20000000L;
        long divisor = 1000L;
        long expectedLong = 20000;
        // : When
        long actualLong = mathUtils.divide(dividend, divisor);
        // : Then
        assertEquals(expectedLong, actualLong);
    }

    @Test
    public void testFloatDivision() {
        // : Given
        float dividend = 7.5F;
        float divisor = 3;
        float expectedFloat = 2.50F;
        // : When
        float actualFloat = mathUtils.divide(dividend, divisor);
        // : Then
        assertEquals(expectedFloat, actualFloat, 0);
    }

    @Test
    public void testDoubleDivision() {
        // : Given
        double dividend = 5.0;
        double divisor = 4.0;
        double expectedDouble = 1.25;
        // : When
        double actualDouble = mathUtils.divide(dividend, divisor);
        // : Then
        assertEquals(expectedDouble, actualDouble, 0);
    }


}
