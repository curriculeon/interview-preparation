package com.github.curriculeon.part1.basicutilities;

import com.github.curriculeon.part1.BasicUtilities;
import org.junit.Assert;
import org.junit.Test;

public class IsGreaterThan5Test {
    @Test
    public void test1() {
        test(5, true);
    }

    @Test
    public void test2() {
        test(4, false);
    }

    @Test
    public void test3() {
        test(6, true);
    }

    @Test
    public void test4() {
        test(7, true);
    }


    private void test(Integer valueToCheckAgainst, Boolean actualOutcome) {
        // given
        BasicUtilities basicUtilities = new BasicUtilities();

        // when
        Boolean expectedOutcome = basicUtilities.isGreaterThan5(valueToCheckAgainst);

        // then
        Assert.assertEquals(expectedOutcome, actualOutcome);
    }
}
