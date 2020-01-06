package com.github.curriculeon.part1.integerarrayutilities;

import com.github.curriculeon.part1.IntegerArrayUtilities;
import org.junit.Assert;
import org.junit.Test;

public class GetProductOfLastTwoTest {
    @Test
    public void test1() {
        Integer[] array = {1, 2, 4};
        Integer expectedSum = 8;
        test(array, expectedSum);
    }

    @Test
    public void test2() {
        Integer[] array = {4, 0};
        Integer expectedSum = 0;
        test(array, expectedSum);
    }

    @Test
    public void test3() {
        Integer[] array = {10, 20, 4};
        Integer expectedSum = 80;
        test(array, expectedSum);
    }


    private void test(Integer[] array, Integer expectedSum) {
        // given
        IntegerArrayUtilities utilities = new IntegerArrayUtilities();

        // when
        Integer actualSum = utilities.getProductOfFirstTwo(array);

        // then
        Assert.assertEquals(expectedSum, actualSum);
    }
}
