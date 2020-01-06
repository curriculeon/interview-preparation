package com.github.codedifferently.fundamentals.stringutils;

import com.github.codedifferently.fundamentals.StringUtils;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collection;

public class GetAllCasingsTest {
    @Test
    public void test1() {
        // given
        String stringInput = "ab";
        Collection<String> expected = Arrays.asList(
                "Ab", "ab", "AB", "aB");



        test(stringInput, expected);
    }

    @Test
    public void test2() {
        // given
        String stringInput = "abc";
        Collection<String> expected = Arrays.asList(
                "ABc", "ABC", "Abc", "abc",
                "aBc", "AbC", "abC", "aBC");
        test(stringInput, expected);
    }

    @Test
    public void test3() {
        // given
        String stringInput = "abcd";
        Collection<String> expected = Arrays.asList(
                        "abcd", "aBcd", "abCd", "aBCd",
                        "abcD", "aBcD", "abCD", "aBCD",
                        "ABcd", "ABCd", "ABcD", "ABCD",
                        "Abcd", "AbCd", "AbcD", "AbCD");
        test(stringInput, expected);
    }

    @Test
    public void test4() {
        // given
        String stringInput = "ab cd";
        Collection<String> expected = Arrays.asList(
                "ab cd", "aB cd", "ab Cd", "aB Cd",
                "ab cD", "aB cD", "ab CD", "aB CD",
                "AB cd", "AB Cd", "AB cD", "AB CD",
                "Ab cd", "Ab Cd", "Ab cD", "Ab CD");
        test(stringInput, expected);
    }

    private void test(String stringInput, Collection<String> expected) {
        // when
        Collection<String> actual = StringUtils.getAllCasings(stringInput);


        // then
        Assert.assertTrue(actual.containsAll(expected));
        Assert.assertTrue(expected.containsAll(actual));
    }

}
