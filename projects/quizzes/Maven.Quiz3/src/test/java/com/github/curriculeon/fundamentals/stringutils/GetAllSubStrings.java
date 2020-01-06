package com.github.curriculeon.fundamentals.stringutils;

import org.junit.Test;
import com.github.curriculeon.utils.TestUtils;
import com.github.curriculeon.fundamentals.StringUtils;

import java.util.Arrays;

/**
 * @author leon on 10/12/2018.
 */
public class GetAllSubStrings {
    @Test
    public void test1() {
        // given
        String input = "Hello";
        String[] expected = {
                "H",
                "He",
                "Hel",
                "Hell",
                "Hello",
                "e",
                "el",
                "ell",
                "ello",
                "l",
                "ll",
                "llo",
                "lo",
                "o"};

        // when
        String[] actual = StringUtils.getAllSubStrings(input);

        // then
        TestUtils.assertArrayEquals(expected, actual);
    }

    @Test
    public void test5() {
        // given
        String input = "Janitor";
        String[] expected = {
                "J",
                "Ja",
                "Jan",
                "Jani",
                "Janit",
                "Janito",
                "Janitor",
                "a",
                "an",
                "ani",
                "anit",
                "anito",
                "anitor",
                "i",
                "it",
                "ito",
                "itor",
                "n",
                "ni",
                "nit",
                "nito",
                "nitor",
                "o",
                "or",
                "r",
                "t",
                "to",
                "tor"};

        // when
        String[] actual = StringUtils.getAllSubStrings(input);
        Arrays.sort(actual);
        System.out.println("String[] expected = {");
        for (String s : actual) {
            System.out.println("\"" + s + "\",");
        }

        // then
        TestUtils.assertArrayEquals(expected, actual);
    }

}
