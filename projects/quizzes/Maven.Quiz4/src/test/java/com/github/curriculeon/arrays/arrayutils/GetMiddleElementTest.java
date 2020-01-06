package com.github.curriculeon.arrays.arrayutils;

import com.github.curriculeon.arrays.ArrayUtils;
import org.junit.Assert;
import org.junit.Test;

public class GetMiddleElementTest {
    @Test
    public void test1() {
        // given
        String expected = "Quick";
        String[] input = {"The", expected, "Brown"};
        test(expected, input);

    }

    @Test
    public void test2() {
        // given
        String expected = "Brown";
        String[] input = {"The", "Quick", expected, "Fox", "Jumps"};
        test(expected, input);

    }

    @Test
    public void test3() {
        // given
        String expected = "Fox";
        String[] input = {"The", "Quick", "Brown", expected, "Jumps", "Over", "The"};
        test(expected, input);
    }

    @Test
    public void test4() {
        // given
        String expected = "Jumps";
        String[] input = {"The", "Quick", "Brown", "Fox", expected, "Over", "The", "Lazy", "Dog"};
        test(expected, input);
    }

    private void test(String expected, String[] input) {
        // when
        String actual = ArrayUtils.getMiddleElement(input);

        //then
        Assert.assertEquals(expected, actual);
    }
}
