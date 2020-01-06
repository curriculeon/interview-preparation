package com.github.curriculeon.fundamentals.calculator;

import org.junit.Assert;
import org.junit.Test;
import com.github.curriculeon.fundamentals.Calculator;

/**
 * @author leon on 01/01/2019.
 */
public class SquareTest {
    @Test
    public void test1() {
        // given
        test(1069.29, 32.70);
    }

    @Test
    public void test2() {
        // given
        test(476003.4049, 689.93);
    }

    @Test
    public void test3() {
        // given
        test(36.0, 6.0);
    }

    @Test
    public void test4() {
        // given
        test(64.0, 8.0);
    }

    @Test
    public void test5() {
        // given
        test(321489.0, 567.0);
    }

    private void test(Double expected, Double input) {
        // when
        Calculator calculator = new Calculator();
        Double actual = calculator.square(input);

        // then
        Assert.assertEquals(expected, actual, 0.01);
    }
}
