package com.github.curriculeon.arrays.arrayutils;

import com.github.curriculeon.arrays.ArrayUtils;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author leon on 02/01/2019.
 */
public class RemoveLastElementTest {
    @Test
    public void test1() {
        // given
        String[] expected = {"The", "Quick"};
        String[] input = {"The", "Quick", "Brown"};
        test(expected, input);

    }

    @Test
    public void test2() {
        // given
        String[] expected = {"The", "Quick", "Brown", "Fox"};
        String[] input = {"The", "Quick", "Brown", "Fox", "Jumps"};
        test(expected, input);
    }

    @Test
    public void test3() {
        // given
        String[] expected = {"The", "Quick", "Brown", "Fox", "Jumps", "Over"};
        String[] input = {"The", "Quick", "Brown", "Fox", "Jumps", "Over", "The"};
        test(expected, input);
    }


    @Test
    public void test4() {
        // given
        String[] expected = {"The", "Quick", "Brown", "Fox", "Jumps", "Over", "The", "Lazy"};
        String[] input = {"The", "Quick", "Brown", "Fox", "Jumps", "Over", "The", "Lazy", "Dog"};
        test(expected, input);
    }

    private void test(String[] expected, String[] input) {
        // when
        String[] actual = ArrayUtils.removeLastElement(input);

        //then
        Assert.assertArrayEquals(expected, actual);
    }
}
