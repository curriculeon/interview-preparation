package com.github.curriculeon.generics.arrayutility.integer;

import com.github.curriculeon.generics.ArrayUtility;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author leon on 09/12/2018.
 */
public class IntegerFindOddOccurringValue {
    @Test
    public void test1() {
        // given
        Integer expected = 5;
        Integer[] array = new Integer[]{1, 1, 2, 2, 3, 3, expected, expected, expected};
        ArrayUtility<Integer> utility = new ArrayUtility<>(array);

        // when
        Integer actual = utility.findOddOccurringValue();

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        // given
        Integer expected = 18;
        Integer[] array = new Integer[]{1, 1, 6, 6, 9, 9, expected, expected, expected, expected, expected};
        ArrayUtility<Integer> utility = new ArrayUtility<>(array);

        // when
        Integer actual = utility.findOddOccurringValue();

        // then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void test3() {
        // given
        Integer expected = 30;
        Integer[] array = new Integer[]{11, 11, 11, 11, 20, 20, 27, 27, 27, 27, expected, expected, expected, expected, expected, expected, expected};
        ArrayUtility<Integer> utility = new ArrayUtility<>(array);

        // when
        Integer actual = utility.findOddOccurringValue();

        // then
        Assert.assertEquals(expected, actual);
    }
}
