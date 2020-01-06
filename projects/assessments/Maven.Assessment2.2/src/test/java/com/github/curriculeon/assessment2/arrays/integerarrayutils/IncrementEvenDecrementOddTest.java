package com.github.curriculeon.assessment2.arrays.integerarrayutils;

import com.github.curriculeon.assessment2.arrays.IntegerArrayUtils;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author leon on 28/11/2018.
 */
public class IncrementEvenDecrementOddTest {
    @Test
    public void testOneEvenElement() {
        //for one even element
        Integer[] input3 = {38};
        Integer[] expectedOutput3 = {39};

        Integer[] actual3 = IntegerArrayUtils.incrementEvenDecrementOdd(input3);

        Assert.assertArrayEquals(expectedOutput3, actual3);
    }

    @Test
    public void testOneOddElement() {
        //for one odd element
        Integer[] input4 = {91};
        Integer[] expectedOutput4 = {90};

        Integer[] actual4 = IntegerArrayUtils.incrementEvenDecrementOdd(input4);

        Assert.assertArrayEquals(expectedOutput4, actual4);
    }


    @Test
    public void testOdd() {
        //for odd numbers
        Integer[] input1 = {101, 25, 11};
        Integer[] expectedOutput1 = {100, 24, 10};

        Integer[] actual1 = IntegerArrayUtils.incrementEvenDecrementOdd(input1);

        Assert.assertArrayEquals(expectedOutput1, actual1);
    }

    @Test
    public void testEven() {
        //for even numbers
        Integer[] input2 = {34, 18, 700, 128, 110};
        Integer[] expectedOutput2 = {35, 19, 701, 129, 111};

        Integer[] actual2 = IntegerArrayUtils.incrementEvenDecrementOdd(input2);

        Assert.assertArrayEquals(expectedOutput2, actual2);
    }

}
