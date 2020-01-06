package com.github.curriculeon.arrays.squarearrayanalyzer;

import com.github.curriculeon.arrays.SquareArrayAnalyzer;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author leon on 10/12/2018.
 * Given two shuffled arrays `inputArray`, and `squarevAlues`,
 * ensure each element of `inputArray` has a corresponding value in `squaredValues`
 * such that element == value*value
 */
public class CompareAssortedArrays {

    @Test
    public void test1() {
        Integer[] array = {1, 2, 3};
        Integer[] arraySquared = {1, 4, 9};
        test(array, arraySquared);
    }

    @Test
    public void test2() {
        Integer[] array = {3, 4, 5};
        Integer[] arraySquared = {9, 16, 25};
        test(array, arraySquared);
    }

    @Test
    public void test3() {
        Integer[] array = {121, 144, 19, 161, 19, 144, 19, 11};
        Integer[] arraySquared = {121, 14641, 20736, 361, 25921, 361, 20736, 361};
        test(array, arraySquared);
    }
    
    private void test(Integer[] array1, Integer[] array2) {
        List<Integer> intList1 = Arrays.asList(array1);
        List<Integer> intList2 = Arrays.asList(array2);
        
        Collections.shuffle(intList1);
        Collections.shuffle(intList2);
        
        array1 = intList1.toArray(new Integer[intList1.size()]);
        array2 = intList2.toArray(new Integer[intList2.size()]);
        
        Assert.assertTrue(SquareArrayAnalyzer.compare(array1, array2));
    }
    
    

}
