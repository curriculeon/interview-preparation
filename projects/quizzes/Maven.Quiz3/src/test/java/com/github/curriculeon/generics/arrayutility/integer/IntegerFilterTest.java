package com.github.curriculeon.generics.arrayutility.integer;

import com.github.curriculeon.generics.ArrayUtility;
import com.github.curriculeon.utils.TestUtils;
import org.junit.Test;

import java.util.function.Function;

/**
 * @author leon on 09/12/2018.
 */
public class IntegerFilterTest {

    @Test
    public void test1() {
        // given
        Integer[] array = new Integer[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Integer[] expected = new Integer[]{6, 7, 8, 9, 10};
        ArrayUtility<Integer> utility = new ArrayUtility<>(array);
        Function<Integer, Boolean> predicate = val -> val > 5;

        // when
        Integer[] actual = utility.filter(predicate);

        // then
        compare(expected, actual);
    }


    @Test
    public void test2() {
        // given
        Integer[] array = new Integer[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Integer[] expected = new Integer[]{};
        ArrayUtility<Integer> utility = new ArrayUtility<>(array);
        Function<Integer, Boolean> predicate = val -> val > 50;

        // when
        Integer[] actual = utility.filter(predicate);

        // then
        compare(expected, actual);
    }


    @Test
    public void test3() {
        // given
        Integer[] array = new Integer[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Integer[] expected = array;
        ArrayUtility<Integer> utility = new ArrayUtility<>(array);
        Function<Integer, Boolean> predicate = val -> val < 50;

        // when
        Integer[] actual = utility.filter(predicate);

        // then
        compare(expected, actual);
    }


    @Test
    public void test4() {
        // given
        Integer[] array = new Integer[]{10, 15, 20, 25, 55, 100, 150, 300, 900, 1000};
        Integer[] expected = {10, 100, 1000};
        ArrayUtility<Integer> utility = new ArrayUtility<>(array);
        Function<Integer, Boolean> predicate = val -> val.toString().startsWith("10");

        // when
        Integer[] actual = utility.filter(predicate);

        // then
        compare(expected, actual);
    }


    @Test
    public void test5() {
        // given
        Integer[] array = new Integer[]{10, 15, 20, 25, 55, 100, 150, 300, 900, 1000};
        Integer[] expected = {55, 15, 25};
        ArrayUtility<Integer> utility = new ArrayUtility<>(array);
        Function<Integer, Boolean> predicate = val -> val.toString().endsWith("5");

        // when
        Integer[] actual = utility.filter(predicate);

        // then
        compare(expected, actual);
    }

    private void compare(Integer[] expected, Integer[] actual) {
        TestUtils.assertArrayEquals(expected, actual);
    }
}
