package com.github.curriculeon.part1.integerarrayutilities;

import com.github.curriculeon.TestUtils;
import com.github.curriculeon.part1.IntegerArrayUtilities;
import org.junit.Test;

public class RangeTest {

    @Test
    public void test1() {
        int start = -10;
        int stop = 0;
        Integer[] expected = {-10, -9, -8, -7, -6, -5, -4, -3, -2, -1, 0};
        test(start, stop, expected);
    }

    @Test
    public void test2() {
        int start = 0;
        int stop = 10;
        Integer[] expected = {0,1,2,3,4,5,6,7,8,9,10};
        test(start, stop, expected);
    }

    @Test
    public void test3() {
        int start = 5;
        int stop = 10;
        Integer[] expected = {5,6,7,8,9,10};
        test(start, stop, expected);
    }


    private void test(int start, int stop, Integer[] expected) {
        // given
        IntegerArrayUtilities integerArrayUtilities = new IntegerArrayUtilities();

        // when
        Integer[] actual = integerArrayUtilities.range(start, stop);

        // then
        TestUtils.assertArrayEquals(expected, actual);
    }
}
