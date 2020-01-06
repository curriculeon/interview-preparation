package com.github.curriculeon.arrays.squarearrayanalyzer;

import com.github.curriculeon.arrays.SquareArrayAnalyzer;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author leon on 10/12/2018.
 * Given two sorted arrays `inputArray`, and `squarevAlues`,
 * ensure each element of `inputArray` has a corresponding value in `squaredValues`
 * such that element == value*value
 */
public class CompareSortedArrays {

    @Test
    public void test0() {
        Integer[] array = {1};
        Integer[] arraySquared = {1};
        Assert.assertTrue(SquareArrayAnalyzer.compare(array, arraySquared));
    }

    @Test
    public void test1() {
        Integer[] array = {2};
        Integer[] arraySquared = {4};
        Assert.assertTrue(SquareArrayAnalyzer.compare(array, arraySquared));
    }

    @Test
    public void test2() {
        Integer[] array = {3};
        Integer[] arraySquared = {9};
        Assert.assertTrue(SquareArrayAnalyzer.compare(array, arraySquared));
    }

    @Test
    public void test3() {
        Integer[] array = {1,2,3};
        Integer[] arraySquared = {1,4,9};
        Assert.assertTrue(SquareArrayAnalyzer.compare(array, arraySquared));
    }

    @Test
    public void test4() {
        Integer[] array = {3,4,5,};
        Integer[] arraySquared = {9,16,25};
        Assert.assertTrue(SquareArrayAnalyzer.compare(array, arraySquared));
    }

    @Test
    public void test5() {
        Integer[] array = {121, 144, 19, 161, 19, 144, 19, 11};
        Integer[] arraySquared = {121, 14641, 20736, 361, 25921, 361, 20736, 361};
        Assert.assertTrue(SquareArrayAnalyzer.compare(array, arraySquared));
    }
}
