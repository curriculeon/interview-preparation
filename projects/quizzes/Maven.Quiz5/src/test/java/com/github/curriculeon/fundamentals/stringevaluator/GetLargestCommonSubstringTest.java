package com.github.curriculeon.fundamentals.stringevaluator;

import org.junit.Assert;
import org.junit.Test;
import com.github.curriculeon.fundamentals.StringEvaluator;

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

        // when
        String actual = StringEvaluator.getLargestCommonSubstring(firstInput, secondInput);

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        // given
        String firstInput = "AAZB";
        String secondInput = "AAAB";
        String expected = "AA";

        // when
        String actual = StringEvaluator.getLargestCommonSubstring(firstInput, secondInput);

        // then
        Assert.assertEquals(expected, actual);
    }



    @Test
    public void test3() {
        // given
        String firstInput = "Zapple";
        String secondInput = "Candy apples!";
        String expected = "apple";

        // when
        String actual = StringEvaluator.getLargestCommonSubstring(firstInput, secondInput);

        // then
        Assert.assertEquals(expected, actual);
    }



    @Test
    public void test4() {
        // given
        String firstInput = "Irreducible complexity";
        String secondInput = "Deductive operations";
        String expected = "educ";

        // when
        String actual = StringEvaluator.getLargestCommonSubstring(firstInput, secondInput);

        // then
        Assert.assertEquals(expected, actual);
    }
}
