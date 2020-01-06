package com.github.curriculeon.mathutilities;
import com.github.curriculeon.MathUtilities;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author leon on 8/26/18.
 */
public class TestAddition {
    private static volatile MathUtilities mathUtils = new MathUtilities();

    @Test
    public void testIntegerAddition() {
        // : Given
        int baseValue = 20;
        int addedValue = 7;
        int expected = 27;
        // : When
        int actual = mathUtils.add(baseValue, addedValue);
        // : Then
        assertEquals(expected, actual);
    }

    @Test
    public void testLongAddition() {
        // : Given
        long baseValue = 228437266;
        long difference = 228437265;
        long expected = 456874531;
        // : When
        long actual = mathUtils.add(baseValue, difference);
        // : Then
        assertEquals(expected, actual);
    }


    @Test
    public void testFloatAddition() {
        // : Given
        float baseValue = 750.585F;
        float addedValue = 795.000F;
        float expected = 1545.585F;
        // : When
        float actual = mathUtils.add(baseValue, addedValue);
        // : Then
        assertEquals(expected, actual, 0);
    }

    @Test
    public void testDoubleAddition() {
        // : Given
        double baseValue = 225.25;
        double addedValue = 231;
        double expected = 456.25;
        // : When
        double actual = mathUtils.add(baseValue, addedValue);
        // : Then
        assertEquals(expected, actual, 0);
    }


}
