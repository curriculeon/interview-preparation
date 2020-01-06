package com.github.curriculeon.part1.basicutilities;

import com.github.curriculeon.part1.BasicUtilities;
import org.junit.Assert;
import org.junit.Test;

public class IsBetween5And7Test {

    @Test
    public void test0() {
        test(0, false);
    }

    @Test
    public void test1() {
        test(1, false);
    }

    @Test
    public void test2() {
        test(6, true);
    }

    @Test
    public void test3() {
        test(5, true);
    }

    @Test
    public void test4() {
        test(7, true);
    }

    private void test(Integer valueToEvaluate, boolean expectedOutcome) {
        // given
        BasicUtilities basicUtilities = new BasicUtilities();

        // when
        Boolean actualOutcome = basicUtilities.isBetween5And7(valueToEvaluate);

        // then
        Assert.assertEquals(expectedOutcome, actualOutcome);
    }
}
