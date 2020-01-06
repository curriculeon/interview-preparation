package com.github.curriculeon.part2.arrayutility;

import com.github.curriculeon.TestUtils;
import com.github.curriculeon.part2.ArrayUtility;
import org.junit.Before;
import org.junit.Test;

public class MergeTest {
    private ArrayUtility utility;

    @Before
    public void setup() {
        utility = new ArrayUtility();
    }

    @Test
    public void test1() {
        //Given
        Integer[] array1 = {9};
        Integer[] array2 = {6};
        Integer[] expected = {9, 6};

        //When
        test(array1, array2, expected);
    }

    @Test
    public void test2() {
        //Given
        Integer[] array1 = {5, 1, 8};
        Integer[] array2 = {4, 2};
        Integer[] expected = {5, 1, 8, 4, 2};

        // when
        test(array1, array2, expected);
    }



    @Test
    public void test3() {
        //Given
        Integer[] array1 = {5, 1, 8, 9, 10};
        Integer[] array2 = {4, 2, 11};
        Integer[] expected = {9, 10, 11, 5, 1, 8, 4, 2};

        // when
        test(array1, array2, expected);
    }


    @Test
    public void test4() {
        //Given
        Integer[] array1 = {1993, 1994, 1995};
        Integer[] array2 = {2003, 2004, 2005};
        Integer[] expected = {1993, 1994, 1995, 2003, 2004, 2005};

        // when
        test(array1, array2, expected);
    }


    private void test(Integer[] array1, Integer[] array2, Integer[] expected) {
        // when
        Integer[] actual = utility.merge(array1, array2);

        // then
        TestUtils.assertArrayEquals(expected, actual);
    }
}
