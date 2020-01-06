package com.github.curriculeon.fundamentals.stringevaluator;

import org.junit.Test;
import com.github.curriculeon.fundamentals.StringEvaluator;
import com.github.curriculeon.utils.TestUtils;

/**
 * @author leon on 11/12/2018.
 */
public class GetCommonSubstringsTest {
    @Test
    public void test1() {
        // given
        String firstInput = "AAB";
        String secondInput = "AAAB";
        String[] expected = {"A", "AA", "AAB", "AB", "B"};

        // when
        String[] actual = StringEvaluator.getCommonSubstrings(firstInput, secondInput);

        // then
        TestUtils.assertArrayEquals(expected, actual);
    }

    @Test
    public void test2() {
        // given
        String firstInput = "AAZB";
        String secondInput = "AAAB";
        String[] expected = {"A", "AA", "B"};

        // when
        String[] actual = StringEvaluator.getCommonSubstrings(firstInput, secondInput);

        // then
        TestUtils.assertArrayEquals(expected, actual);
    }


    @Test
    public void test3() {
        // given
        String firstInput = "Zapple";
        String secondInput = "Candy apples!";
        String[] expected = {"a", "ap", "app", "appl", "apple", "e", "l", "le", "p", "pl", "ple", "pp", "ppl", "pple"};

        // when
        String[] actual = StringEvaluator.getCommonSubstrings(firstInput, secondInput);

        // then
        TestUtils.assertArrayEquals(expected, actual);
    }



    @Test
    public void tes4() {
        // given
        String firstInput = "Irreducible complexity";
        String secondInput = "Deductive operations";
        String[] expected = {" ", "c", "d", "du", "duc", "e", "e ", "ed", "edu", "educ", "i", "o", "p", "r", "t", "u", "uc"};

        // when
        String[] actual = StringEvaluator.getCommonSubstrings(firstInput, secondInput);

        // then
        TestUtils.assertArrayEquals(expected, actual);
    }

    @Test
    public void test5() {
        // given
        String firstInput = "Peter piper picked a pepper";
        String secondInput = "Jimmy neutron was a fancy scientist";
        String[] expected = {" ", " a", " a ", "a", "a ", "c", "e", "i", "r", "t"};

        // when
        String[] actual = StringEvaluator.getCommonSubstrings(firstInput, secondInput);

        // then
        TestUtils.assertArrayEquals(expected, actual);
    }

}
