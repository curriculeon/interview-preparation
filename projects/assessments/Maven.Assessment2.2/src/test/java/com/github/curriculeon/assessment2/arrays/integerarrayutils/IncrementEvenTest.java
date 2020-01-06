package com.github.curriculeon.assessment2.arrays.integerarrayutils;

import com.github.curriculeon.assessment2.arrays.IntegerArrayUtils;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author leon on 28/11/2018.
 */
public class IncrementEvenTest {
    @Test
    public void test1() {
        // given
        Integer[] input =    {1,2,3,4,5,6,7,8};
        Integer[] expected = {1,3,3,5,5,7,7,9};


        // when
        Integer[] actual = IntegerArrayUtils.incrementEven(input);

        // then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void test2() {
        // given
        Integer[] input =    {10,20,30,1,3,5};
        Integer[] expected = {11,21,31,1,3,5};

        // when
        Integer[] actual = IntegerArrayUtils.incrementEven(input);

        // then
        Assert.assertArrayEquals(expected, actual);
    }
}
