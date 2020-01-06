package com.github.curriculeon.generics.arrayutility.string;

import com.github.curriculeon.generics.ArrayUtility;
import com.github.curriculeon.utils.TestUtils;
import org.junit.Test;

/**
 * @author leon on 09/12/2018.
 */
public class StringFilterTest {

    @Test
    public void test1() {
        // given
        String[] expected = {"quick", "brown", "jumps", "over", "lazy"};
        String[] input = "The quick brown fox jumps over the lazy dog".split(" ");
        ArrayUtility<String> utility = new ArrayUtility<>(input);



        // when
        String[] actual = utility.filter(string -> string.length() > 3);

        // then
        TestUtils.assertArrayEquals(expected, actual);
    }


    @Test
    public void test2() {
        // given
        String[] expected = {"The", "fox", "the", "dog"};
        String[] input = "The quick brown fox jumps over the lazy dog".split(" ");
        ArrayUtility<String> utility = new ArrayUtility<>(input);

        // when
        String[] actual = utility.filter(string -> string.length() <= 3);

        // then
        TestUtils.assertArrayEquals(expected, actual);
    }


    @Test
    public void test3() {
        // given
        String[] expected = {"The", "over", "the"};
        String[] input = "The quick brown fox jumps over the lazy dog".split(" ");
        ArrayUtility<String> utility = new ArrayUtility<>(input);

        // when
        String[] actual = utility.filter(string -> string.contains("e"));

        // then
        TestUtils.assertArrayEquals(expected, actual);
    }
}
