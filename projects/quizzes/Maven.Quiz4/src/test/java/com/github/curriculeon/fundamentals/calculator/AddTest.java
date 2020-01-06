package com.github.curriculeon.fundamentals.calculator;

import org.junit.Assert;
import org.junit.Test;
import com.github.curriculeon.fundamentals.Calculator;

/**
 * @author leon on 01/01/2019.
 */
public class AddTest {
    @Test
    public void test1() {
        // given
        test(99.0, 10.5, 88.5);
    }

    @Test
    public void test2() {
        // given
        test(40.12, 19.93, 20.19);
    }

    @Test
    public void test3() {
        // given
        test(39.94, 19.94, 20.00);
    }

    @Test
    public void test4() {
        // given
        test(100.00, 50.0, 50.0);
    }

    @Test
    public void test5() {
        // given
        test(22.10, 7.06, 15.04);
    }

    private void test(Double expected, Double input1, Double input2) {
        // when
        Calculator calculator = new Calculator();
        Double actual = calculator.add(input1, input2);

        // then
        Assert.assertEquals(expected, actual, 0.01);
    }
}
