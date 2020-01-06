package com.github.curriculeon.part1.integerarrayutilities;

import com.github.curriculeon.part1.IntegerArrayUtilities;
import org.junit.Assert;
import org.junit.Test;

public class HasEvenLengthTest {
    @Test
    public void test1() {
        Integer[] array = {};
        test(array, true);
    }

    @Test
    public void test2() {
        Integer[] array = {0};
        test(array, false);
    }


    @Test
    public void test3() {
        Integer[] array = {0,0};
        test(array, true);
    }


    @Test
    public void test4() {
        Integer[] array = {1,2,3};
        test(array, false);
    }


    private void test(Integer[] array, Boolean expectedOutcome) {
        // given
        IntegerArrayUtilities utilities = new IntegerArrayUtilities();

        // when
        Boolean actualOutcome = utilities.hasEvenLength(array);

        // then
        Assert.assertEquals(actualOutcome, expectedOutcome);
    }
}
