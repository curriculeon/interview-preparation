package com.github.curriculeon.generics.genericarrayutils.powerset;

import org.junit.Assert;
import com.github.curriculeon.generics.GenericUtils;

/**
 * @author leon on 15/12/2018.
 */
public class PowerSetTest {
    public static void test(String[] input, String expectedString) {
        // given

        // when
        Iterable<? extends Iterable<? extends String>> actualSet = GenericUtils.powerSet(input);
        String actualString = actualSet.toString();

        // then
        Assert.assertEquals(expectedString, actualString);
    }
}
