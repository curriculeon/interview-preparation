package com.github.curriculeon.generics.group.integergroup;

import org.junit.Assert;
import org.junit.Test;
import com.github.curriculeon.generics.Group;

/**
 * @author leon on 11/12/2018.
 */
public class IntegerGroupDistinctTest {
    @Test
    public void test1() {
        test(1);
    }

    @Test
    public void test2() {
        test(2);
    }

    @Test
    public void test3() {
        test(3);
    }

    private void test(Integer valueToInsert) {
        // given
        Group<Integer> group = new Group<>();

        // when
        Assert.assertFalse(group.has(valueToInsert));
        group.insert(valueToInsert);

        // then
        Assert.assertTrue(group.has(valueToInsert));
    }
}
