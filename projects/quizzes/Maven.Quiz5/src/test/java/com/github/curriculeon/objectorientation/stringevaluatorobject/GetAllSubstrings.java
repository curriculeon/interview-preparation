package com.github.curriculeon.objectorientation.stringevaluatorobject;

import org.junit.Test;
import com.github.curriculeon.objectorientation.StringEvaluatorObject;
import com.github.curriculeon.utils.TestUtils;

/**
 * @author leon on 11/12/2018.
 */
public class GetAllSubstrings {
    @Test
    public void test1() {
        // given
        String input = "A";
        String[] expected = {input};
        test(input, expected);
    }

    @Test
    public void test2() {
        // given
        String input = "B";
        String[] expected = {input};
        test(input, expected);
    }


    @Test
    public void test3() {
        // given
        String input = "AB";
        String[] expected = {"A", "B", "AB"};
        test(input, expected);
    }


    @Test
    public void test4() {
        // given
        String input = "ABB";
        String[] expected = {"A", "AB", "ABB", "B", "BB"};
        test(input, expected);
    }


    @Test
    public void test5() {
        // given
        String input = "AABB";
        String[] expected = {"A", "AA", "AAB", "AABB", "AB", "ABB", "B", "BB"};
        test(input, expected);
    }


    @Test
    public void test6() {
        // given
        String input = "AnotherMethodToTest";
        String[] expected = {
                "A", "An", "Ano", "Anot", "Anoth", "Anothe", "Another", "AnotherM", "AnotherMe", "AnotherMet", "AnotherMeth", "AnotherMetho", "AnotherMethod", "AnotherMethodT", "AnotherMethodTo", "AnotherMethodToT", "AnotherMethodToTe", "AnotherMethodToTes", "AnotherMethodToTest",
                "n", "no", "not", "noth", "nothe", "nother", "notherM", "notherMe", "notherMet", "notherMeth", "notherMetho", "notherMethod", "notherMethodT", "notherMethodTo", "notherMethodToT", "notherMethodToTe", "notherMethodToTes", "notherMethodToTest",
                "o", "oT", "oTe", "oTes", "oTest", "od", "odT", "odTo", "odToT", "odToTe", "odToTes", "odToTest", "ot", "oth", "othe", "other", "otherM", "otherMe", "otherMet", "otherMeth", "otherMetho", "otherMethod", "otherMethodT", "otherMethodTo", "otherMethodToT", "otherMethodToTe", "otherMethodToTes", "otherMethodToTest",
                "t", "th", "the", "ther", "therM", "therMe", "therMet", "therMeth", "therMetho", "therMethod", "therMethodT", "therMethodTo", "therMethodToT", "therMethodToTe", "therMethodToTes", "therMethodToTest", "tho", "thod", "thodT", "thodTo", "thodToT", "thodToTe", "thodToTes", "thodToTest",
                "h", "he", "her", "herM", "herMe", "herMet", "herMeth", "herMetho", "herMethod", "herMethodT", "herMethodTo", "herMethodToT", "herMethodToTe", "herMethodToTes", "herMethodToTest", "ho", "hod", "hodT", "hodTo", "hodToT", "hodToTe", "hodToTes", "hodToTest",
                "e", "er", "erM", "erMe", "erMet", "erMeth", "erMetho", "erMethod", "erMethodT", "erMethodTo", "erMethodToT", "erMethodToTe", "erMethodToTes", "erMethodToTest", "es", "est", "et", "eth", "etho", "ethod", "ethodT", "ethodTo", "ethodToT", "ethodToTe", "ethodToTes", "ethodToTest",
                "r", "rM", "rMe", "rMet", "rMeth", "rMetho", "rMethod", "rMethodT", "rMethodTo", "rMethodToT", "rMethodToTe", "rMethodToTes", "rMethodToTest",
                "M", "Me", "Met", "Meth", "Metho", "Method", "MethodT", "MethodTo", "MethodToT", "MethodToTe", "MethodToTes", "MethodToTest",
                "T", "Te", "Tes", "Test", "To", "ToT", "ToTe", "ToTes", "ToTest",
                "d", "dT", "dTo", "dToT", "dToTe", "dToTes", "dToTest",
                "s", "st"};

        test(input, expected);
    }

    private void test(String input, String[] expected) {
        // when
        String[] actual = new StringEvaluatorObject(input).getAllSubstrings();

        // then
        TestUtils.assertArrayEquals(expected, actual);

    }
}
