package com.github.curriculeon.arrays.arrayutils;

import com.github.curriculeon.arrays.ArrayUtils;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author leon on 02/01/2019.
 */
public class GetLastElementTest {
    @Test
    public void test1() {
        // given
        String expected = "Dog";
        String[] input = {"The", "Quick", "Brown", "Fox", "Jumps", "Over", "The", "Lazy", expected};
        test(expected, input);
    }

    @Test
    public void test2() {
        // given
        String expected = "Lazy";
        String[] input = {"The", "Quick", "Brown", "Fox", "Jumps", "Over", "The", expected};
        test(expected, input);
    }


    @Test
    public void test3() {
        // given
        String expected = "The";
        String[] input = {"The", "Quick", "Brown", "Fox", "Jumps", "Over", expected};
        test(expected, input);
    }


    @Test
    public void test4() {
        // given
        String expected = "Over";
        String[] input = {"The", "Quick", "Brown", "Fox", "Jumps", expected};
        test(expected, input);
    }

    private void test(String expected, String[] input) {
        // when
        String actual = ArrayUtils.getLastElement(input);

        //then
        Assert.assertEquals(expected, actual);
    }
}
