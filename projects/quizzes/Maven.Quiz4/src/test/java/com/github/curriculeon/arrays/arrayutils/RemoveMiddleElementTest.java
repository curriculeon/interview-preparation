package com.github.curriculeon.arrays.arrayutils;

import com.github.curriculeon.arrays.ArrayUtils;
import org.junit.Assert;
import org.junit.Test;

public class RemoveMiddleElementTest {
    @Test
    public void test1() {
        // given
        String[] expected = {"The", "Brown"};
        String[] input = {"The", "Quick", "Brown"};
        test(expected, input);

    }

    @Test
    public void test2() {
        // given
        String[] expected = {"The", "Quick", "Fox", "Jumps"};
        String[] input = {"The", "Quick", "Brown", "Fox", "Jumps"};
        test(expected, input);
    }

    @Test
    public void test3() {
        // given
        String[] expected = {"The", "Quick", "Brown", "Jumps", "Over", "The"};
        String[] input = {"The", "Quick", "Brown", "Fox", "Jumps", "Over", "The"};
        test(expected, input);
    }


    @Test
    public void test4() {
        // given
        String[] expected = {"The", "Quick", "Brown", "Fox", "Over", "The", "Lazy", "Dog"};
        String[] input = {"The", "Quick", "Brown", "Fox", "Jumps", "Over", "The", "Lazy", "Dog"};
        test(expected, input);
    }

    private void test(String[] expected, String[] input) {
        // when
        String[] actual = ArrayUtils.removeMiddleElement(input);

        //then
        Assert.assertArrayEquals(expected, actual);
    }
}
