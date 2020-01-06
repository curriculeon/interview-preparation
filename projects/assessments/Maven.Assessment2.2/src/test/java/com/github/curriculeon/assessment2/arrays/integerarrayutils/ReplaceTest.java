package com.github.curriculeon.assessment2.arrays.integerarrayutils;

import com.github.curriculeon.assessment2.arrays.IntegerArrayUtils;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author leon on 28/11/2018.
 */
public class ReplaceTest {
    @Test
    public void testInsert1() {
        // Given
        Integer indexToInsertAt = 3;
        Integer valueToBeInserted = 12;
        Integer[] input = {1,2,5,8};
        Integer[] expected = {1,2,5,valueToBeInserted};

        // when
        Integer[] actual = IntegerArrayUtils.replace(input, indexToInsertAt, valueToBeInserted);

        // then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testInsert2() {
        // Given
        Integer valueToBeInserted = 82;
        Integer indexToInsertAt = 0;
        Integer[] input = {1,2,5,8};
        Integer[] expected = {valueToBeInserted,2,5,8};

        // when
        Integer[] actual = IntegerArrayUtils.replace(input, indexToInsertAt, valueToBeInserted);

        // then
        Assert.assertArrayEquals(expected, actual);
    }
}
