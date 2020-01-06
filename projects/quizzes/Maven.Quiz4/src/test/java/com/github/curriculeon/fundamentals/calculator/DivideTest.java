package com.github.curriculeon.fundamentals.calculator;

import org.junit.Assert;
import org.junit.Test;
import com.github.curriculeon.fundamentals.Calculator;

/**
 * @author leon on 01/01/2019.
 */
public class DivideTest {
    @Test
    public void test1() {
        // given
        test(12.0, 144.0, 12.0);
    }

    @Test
    public void test2() {
        // given
        test(5.0, 60.0, 12.0);
    }

    @Test
    public void test3() {
        // given
        test(6.0, 36.0, 6.0);
    }

    @Test
    public void test4() {
        // given
        test(12.6, 63.0, 5.0);
    }

    @Test
    public void test5() {
        // given
        test(8.0, 72.0, 9.0);
    }

    private void test(Double expected, Double input1, Double input2) {
        // when
        Calculator calculator = new Calculator();
        Double actual = calculator.divide(input1, input2);

        // then
        Assert.assertEquals(expected, actual, 0.01);
    }
}
