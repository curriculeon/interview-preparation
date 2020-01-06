package com.github.curriculeon.assessment2.arrays.stringarrayutils;

import com.github.curriculeon.assessment2.arrays.StringArrayUtils;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author leon on 28/11/2018.
 */
public class GetSubArrayTest {
    @Test
    public void testGetSubArrayFrom0To2() {
        // given
        String[] input = {"The", "Quick", "Brown", "Fox", "Jumps"};
        String[] expected = {"The", "Quick"};
        int startIndex = 0;
        int endIndex = 2;

        // when
        String[] actual = StringArrayUtils.getSubArray(input, startIndex, endIndex);

        // Then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testGetSubArrayFrom1To3() {
        // given
        String[] input = {"The", "Quick", "Brown", "Fox", "Jumps"};
        String[] expected = {"Quick", "Brown"};
        int startIndex = 1;
        int endIndex = 3;

        // when
        String[] actual = StringArrayUtils.getSubArray(input, startIndex, endIndex);

        // Then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetSubArrayOutOfBounds1() {
        // given
        String[] input = {"The", "Quick", "Brown", "Fox", "Jumps"};
        int startIndex = 98;
        int endIndex = 99;

        // when
        StringArrayUtils.getSubArray(input, startIndex, endIndex);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetSubArrayOutOfBounds2() {
        // given
        String[] input = {"The", "Quick", "Brown", "Fox", "Jumps"};
        int startIndex = -1;
        int endIndex = -10;

        // when
        StringArrayUtils.getSubArray(input, startIndex, endIndex);
    }
}
