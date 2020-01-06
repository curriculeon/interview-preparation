package com.github.curriculeon.generics.arrayutility.integer;

import com.github.curriculeon.generics.ArrayUtility;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author leon on 09/12/2018.
 */
public class IntegerGetNumberOfOccurrences {
    @Test
    public void test1() {
        // given
        Integer expected = 2;
        Integer valueToEvaluate = 5;
        Integer[] array = new Integer[]{1, 2, 3, 4, valueToEvaluate, valueToEvaluate};
        ArrayUtility<Integer> utility = new ArrayUtility<>(array);

        // when
        Integer actual = utility.getNumberOfOccurrences(valueToEvaluate);

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        // given
        Integer expected = 4;
        Integer valueToEvaluate = 18;
        Integer[] array = new Integer[]{1, 1, 1, 2, 2, 2, 2, 2, valueToEvaluate, 4, 4, 4, valueToEvaluate, valueToEvaluate, valueToEvaluate};
        ArrayUtility<Integer> utility = new ArrayUtility<>(array);

        // when
        Integer actual = utility.getNumberOfOccurrences(valueToEvaluate);

        // then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void test3() {
        // given
        Integer expected = 6;
        Integer valueToEvaluate = 30;
        Integer[] array = new Integer[]{1, valueToEvaluate, 4, valueToEvaluate, valueToEvaluate, 10, 10, 10, valueToEvaluate, valueToEvaluate, valueToEvaluate};
        ArrayUtility<Integer> utility = new ArrayUtility<>(array);

        // when
        Integer actual = utility.getNumberOfOccurrences(valueToEvaluate);

        // then
        Assert.assertEquals(expected, actual);
    }
}
