package com.github.curriculeon.assessment2.fundamentals.predicateutilities;

import com.github.curriculeon.assessment2.fundamentals.PredicateUtilities;
import org.junit.Assert;
import org.junit.Test;

public class IsMultipleOf3Test {
    @Test
    public void test1() {
        test(1, false);
    }

    @Test
    public void test2() {
        test(3, true);
    }

    @Test
    public void test3() {
        test(7, false);
    }

    @Test
    public void test4() {
        test(6, true);
    }

    @Test
    public void test5() {
        test(9, true);
    }


    private void test(Integer value, Boolean expectedOutcome) {
        // when
        Boolean actualOutcome = PredicateUtilities.isMultipleOf3(value);

        // then
        Assert.assertEquals(actualOutcome, expectedOutcome);
    }
}
