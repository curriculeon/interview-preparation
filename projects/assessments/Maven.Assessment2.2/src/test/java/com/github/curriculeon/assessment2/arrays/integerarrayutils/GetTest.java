package com.github.curriculeon.assessment2.arrays.integerarrayutils;

import com.github.curriculeon.assessment2.arrays.IntegerArrayUtils;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author leon on 28/11/2018.
 */
public class GetTest {
    @Test
    public void testGet1() {
        // Given
        Integer indexToFetch = 3;
        Integer[] input = {1,2,5,178931798};
        Integer expected = 178931798;

        // when
        Integer actual = IntegerArrayUtils.get(input, indexToFetch);

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGet2() {
        // Given
        Integer indexToFetch = 0;
        Integer[] input = {981238912,2,5,8};
        Integer expected = 981238912;

        // when
        Integer actual = IntegerArrayUtils.get(input, indexToFetch);

        // then
        Assert.assertEquals(expected, actual);
    }
}
