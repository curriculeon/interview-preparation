package com.github.curriculeon.fundamentals.calculator;

import org.junit.Assert;
import org.junit.Test;
import com.github.curriculeon.fundamentals.Calculator;

/**
 * @author leon on 01/01/2019.
 */
public class SquareRootsTest {

    @Test
    public void test1() {
        // given
        test(new Double[]{8.0, 9.0, 10.0, 3.0}, 64.0, 81.0, 100.0, 9.0);
    }

    @Test
    public void test2() {
        // given
        test(new Double[]{864.0, 3.0, 4.0}, 746496.0, 9.0, 16.0);
    }

    @Test
    public void test3() {
        // given
        test(new Double[]{12.0, 438.0, 9.0}, 144.0, 191844.0, 81.0);
    }

    @Test
    public void test4() {
        // given
        test(new Double[]{6.0, 8.0, 12.0}, 36.0, 64.0, 144.0);
    }

    @Test
    public void test5() {
        // given
        test(new Double[]{6.0, 12.0, 9.0}, 36.0, 144.0, 81.0);
    }

    private void test(Double[] expected, Double... inputArray) {
        // when
        Calculator calculator = new Calculator();
        Double[] actual = calculator.squareRoots(inputArray);

        // then
        Assert.assertArrayEquals(expected, actual);
    }
}
