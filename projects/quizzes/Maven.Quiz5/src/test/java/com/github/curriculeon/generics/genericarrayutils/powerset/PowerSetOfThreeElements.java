package com.github.curriculeon.generics.genericarrayutils.powerset;

import org.junit.Test;

/**
 * @author leon on 15/12/2018.
 */
public class PowerSetOfThreeElements {
    @Test
    public void test1() {
        // given
        String[] input = {"a", "b", "c"};
        String expectedString = "[[a, b, c], [a, b], [a, c], [a], [b, a], [b, c], [b], [c, a], [c, b], [c], []]";
        PowerSetTest.test(input, expectedString);
    }

    @Test
    public void test2() {
        // given
        String[] input = {"1", "2", "3"};
        String expectedString = "[[1, 2, 3], [1, 2], [1, 3], [1], [2, 1], [2, 3], [2], [3, 1], [3, 2], [3], []]";
        PowerSetTest.test(input, expectedString);
    }

    @Test
    public void test3() {
        // given
        String[] input = {"x", "y", "z"};
        String expectedString = "[[x, y, z], [x, y], [x, z], [x], [y, x], [y, z], [y], [z, x], [z, y], [z], []]";
        PowerSetTest.test(input, expectedString);
    }

    @Test
    public void test4() {
        // given
        String[] input = {"aFIRST", "bSECOND", "cTHIRD"};
        String eaFIRSTpectedString = "[[aFIRST, bSECOND, cTHIRD], [aFIRST, bSECOND], [aFIRST, cTHIRD], [aFIRST], [bSECOND, aFIRST], [bSECOND, cTHIRD], [bSECOND], [cTHIRD, aFIRST], [cTHIRD, bSECOND], [cTHIRD], []]";
        PowerSetTest.test(input, eaFIRSTpectedString);
    }


    @Test
    public void test5() {
        // given
        String[] input = {"1WATER", "2FIRE", "3LIGHTNING"};
        String e1WATERpectedString = "[[1WATER, 2FIRE, 3LIGHTNING], [1WATER, 2FIRE], [1WATER, 3LIGHTNING], [1WATER], [2FIRE, 1WATER], [2FIRE, 3LIGHTNING], [2FIRE], [3LIGHTNING, 1WATER], [3LIGHTNING, 2FIRE], [3LIGHTNING], []]";
        PowerSetTest.test(input, e1WATERpectedString);
    }
}
