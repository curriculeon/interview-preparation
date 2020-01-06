package com.github.curriculeon.part1.basicutilities;

import com.github.curriculeon.part1.BasicUtilities;
import org.junit.Assert;
import org.junit.Test;

public class IsLessThan7Test {
    @Test
    public void test1() {
        test(5, true);
    }

    @Test
    public void test2() {
        test(4, true);
    }

    @Test
    public void test3() {
        test(6, true);
    }

    @Test
    public void test4() {
        test(7, true);
    }



    @Test
    public void test5() {
        test(8, false);
    }


    private void test(Integer valueToCheckAgainst, Boolean actualOutcome) {
        // given
        BasicUtilities basicUtilities = new BasicUtilities();

        // when
        Boolean expectedOutcome = basicUtilities.isLessThan7(valueToCheckAgainst);

        // then
        Assert.assertEquals(expectedOutcome, actualOutcome);
    }
}
