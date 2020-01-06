package com.github.curriculeon.objectorientation.palindromeobject;

import org.junit.Test;
import com.github.curriculeon.objectorientation.PalindromeObject;
import com.github.curriculeon.utils.TestUtils;

/**
 * @author leon on 11/12/2018.
 */
public class PalindromeObjectGetAllPalindromesTest {
    @Test
    public void test1() {
        // given
        String input = "racecar";
        String[] expected = new String[]{"a", "aceca", "c", "cec", "e", "r", "racecar"};
        test(input, expected);
    }

    @Test
    public void test2() {
        // given
        String input = "redder";
        String[] expected = new String[]{"d", "dd", "e", "edde", "r", "redder"};
        test(input, expected);
    }


    @Test
    public void test3() {
        // given
        String input = "rotor";
        String[] expected = new String[]{"o", "oto", "r", "rotor", "t"};
        test(input, expected);
    }

    @Test
    public void test4() {
        // given
        String input = "civic";
        String[] expected = new String[]{"c", "civic", "i", "ivi", "v"};
        test(input, expected);
    }

    public void test(String input, String... expected) {
        // when
        String[] actual = new PalindromeObject(input).getAllPalindromes();

        // then
        TestUtils.assertArrayEquals(expected, actual);
    }
}
