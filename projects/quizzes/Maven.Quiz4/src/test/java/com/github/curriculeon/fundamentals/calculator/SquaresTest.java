package com.github.curriculeon.fundamentals.calculator;

import org.junit.Assert;
import org.junit.Test;
import com.github.curriculeon.fundamentals.Calculator;

/**
 * @author leon on 01/01/2019.
 */
public class SquaresTest {
    @Test
    public void test1() {
        // given
        test(new Double[]{4.0,16.0, 144.0}, 2.0,4.0,12.0);
    }

    @Test
    public void test2() {
        // given
        test(new Double[]{100.00, 49.0, 64.0, 36.0},10.0, 7.0, 8.0, 6.0);
    }

    @Test
    public void test3() {
        // given
        test(new Double[]{9.0, 25.0, 121.0, 169.0}, 3.0, 5.0, 11.0, 13.0);
    }

    @Test
    public void test4() {
        // given
        test(new Double[]{16.0, 9.0, 64.0, 81.0}, 4.0, 3.0, 8.0, 9.0);
    }

    @Test
    public void test5() {
        // given
        test(new Double[]{4.0, 25.0, 81.0}, 2.0, 5.0, 9.0);
    }

    private void test(Double[] expected, Double... inputArray) {
        // when
        Calculator calculator = new Calculator();
        Double[] actual = calculator.squares(inputArray);

        // then
        Assert.assertArrayEquals(expected, actual);
    }
}
