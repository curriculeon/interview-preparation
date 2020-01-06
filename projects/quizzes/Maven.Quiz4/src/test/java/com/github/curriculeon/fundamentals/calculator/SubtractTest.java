package com.github.curriculeon.fundamentals.calculator;

import org.junit.Assert;
import org.junit.Test;
import com.github.curriculeon.fundamentals.Calculator;

/**
 * @author leon on 01/01/2019.
 */
public class SubtractTest {
    @Test
    public void test1() {
        // given
        test(5.0, 10.0, 5.0);
    }

    @Test
    public void test2() {
        // given
        test(150.0, 250.0, 100.0);
    }

    @Test
    public void test3() {
        // given
        test(762.0, 862.0, 100.0);
    }

    @Test
    public void test4() {
        // given
        test(-899.999, -999.999, -100.0);
    }

    @Test
    public void test5() {
        // given
        test(-10.0, -5.0, 5.0);
    }

    private void test(Double expected, Double input1, Double input2) {
        // when
        Calculator calculator = new Calculator();
        Double actual = calculator.subtract(input1, input2);

        // then
        Assert.assertEquals(expected, actual, 0);
    }
}
