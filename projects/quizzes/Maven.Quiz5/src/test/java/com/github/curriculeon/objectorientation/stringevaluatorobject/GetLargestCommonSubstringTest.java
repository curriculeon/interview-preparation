package com.github.curriculeon.objectorientation.stringevaluatorobject;

import org.junit.Assert;
import org.junit.Test;
import com.github.curriculeon.objectorientation.StringEvaluatorObject;

/**
 * @author leon on 11/12/2018.
 */
public class GetLargestCommonSubstringTest {
    @Test
    public void test1() {
        // given
        String firstInput = "AAB";
        String secondInput = "AAAB";
        String expected = "AAB";
        test(firstInput, secondInput, expected);
    }

    @Test
    public void test2() {
        // given
        String firstInput = "AAZB";
        String secondInput = "AAAB";
        String expected = "AA";
        test(firstInput, secondInput, expected);
    }



    @Test
    public void test3() {
        // given
        String firstInput = "Zapple";
        String secondInput = "Candy apples!";
        String expected = "apple";
        test(firstInput, secondInput, expected);
    }



    @Test
    public void test4() {
        // given
        String firstInput = "Irreducible complexity";
        String secondInput = "Deductive operations";
        String expected = "educ";
        test(firstInput, secondInput, expected);
    }


    private void test(String firstInput, String secondInput, String expected) {
        // when
        String actual = new StringEvaluatorObject(firstInput).getLargestCommonSubstring(secondInput);

        // then
        Assert.assertEquals(expected, actual);
    }
}
