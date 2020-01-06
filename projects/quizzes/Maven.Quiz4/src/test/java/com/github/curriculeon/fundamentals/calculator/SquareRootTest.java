package com.github.curriculeon.fundamentals.calculator;
import org.junit.*;
import com.github.curriculeon.fundamentals.Calculator;

public class SquareRootTest {

    @Test
    public void test1() {
        // given
        test(8.0, 64.0);
    }

    @Test
    public void test2() {
        // given
        test(438.0, 191844.0);
    }

    @Test
    public void test3() {
        // given
        test(12.0, 144.0);
    }

    @Test
    public void test4() {
        // given
        test(864.0, 746496.0);
    }

    @Test
    public void test5() {
        // given
        test(6.0, 36.0);
    }

    private void test(Double expected, Double input) {
        // when
        Calculator calculator = new Calculator();
        Double actual = calculator.squareRoot(input);

        // then
        Assert.assertEquals(expected, actual, 0.01);
    }
}
