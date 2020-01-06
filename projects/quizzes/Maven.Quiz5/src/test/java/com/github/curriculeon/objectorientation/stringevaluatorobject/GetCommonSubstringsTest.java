package com.github.curriculeon.objectorientation.stringevaluatorobject;

import org.junit.Test;
import com.github.curriculeon.objectorientation.StringEvaluatorObject;
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
        test(firstInput, secondInput, expected);
    }

    @Test
    public void test2() {
        // given
        String firstInput = "AAZB";
        String secondInput = "AAAB";
        String[] expected = {"A", "AA", "B"};
        test(firstInput, secondInput, expected);
    }


    @Test
    public void test3() {
        // given
        String firstInput = "Zapple";
        String secondInput = "Candy apples!";
        String[] expected = {"a", "ap", "app", "appl", "apple", "e", "l", "le", "p", "pl", "ple", "pp", "ppl", "pple"};
        test(firstInput, secondInput, expected);
    }


    @Test
    public void tes4() {
        // given
        String firstInput = "Irreducible complexity";
        String secondInput = "Deductive operations";
        String[] expected = {" ", "c", "d", "du", "duc", "e", "e ", "ed", "edu", "educ", "i", "o", "p", "r", "t", "u", "uc"};
        test(firstInput, secondInput, expected);
    }

    @Test
    public void test5() {
        // given
        String firstInput = "Peter piper picked a pepper";
        String secondInput = "Jimmy neutron was a fancy scientist";
        String[] expected = {" ", " a", " a ", "a", "a ", "c", "e", "i", "r", "t"};
        test(firstInput, secondInput, expected);
    }

    private void test(String firstInput, String secondInput, String[] expected) {
        // when
        String[] actual = new StringEvaluatorObject(firstInput).getCommonSubstrings(secondInput);

        // then
        TestUtils.assertArrayEquals(expected, actual);
    }

}
