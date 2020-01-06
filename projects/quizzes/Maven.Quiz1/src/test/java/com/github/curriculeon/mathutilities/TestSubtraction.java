package com.github.curriculeon.mathutilities;

import com.github.curriculeon.MathUtilities;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author leon on 8/26/18.
 */
public class TestSubtraction {
    private static volatile MathUtilities mathUtils = new MathUtilities();


    @Test
    public void testIntegerSubtraction(){
        // : Given
        int baseValue = 20;
        int difference = 7;
        int expectedInt = 13;
        // : When
        int actualInt = mathUtils.subtract(baseValue,difference);
        // : Then
        assertEquals(expectedInt,actualInt);
    }
    @Test
    public void testLongSubtraction() {
        // : Given
        long baseValue = 228437266;
        long difference = 228437265;
        long expectedLong = 1;
        // : When
        long actualLong = mathUtils.subtract(baseValue, difference);
        // : Then
        assertEquals(expectedLong,actualLong);
    }

    @Test
    public void testFloatSubtraction() {
        // : Given
        float baseValue = 750.585F;
        float difference = 795.0F;
        float expectedFloat = -44.415F;
        // : When
        float actualFloat = mathUtils.subtract(baseValue,difference);
        // : Then
        assertEquals(expectedFloat,actualFloat, 0.005);
    }
    @Test
    public void testDoubleSubtraction() {
        // : Given
        double baseValue = 225.25;
        double difference = 231;
        double expectedDouble = -5.75;
        // : When
        double actualDouble = mathUtils.subtract(baseValue, difference);
        // : Then
        assertEquals(expectedDouble,actualDouble, 0);
    }


}
