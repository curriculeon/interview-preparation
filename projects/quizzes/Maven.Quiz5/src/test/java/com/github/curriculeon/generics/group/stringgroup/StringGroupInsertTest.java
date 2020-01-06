package com.github.curriculeon.generics.group.stringgroup;

import org.junit.Assert;
import org.junit.Test;
import com.github.curriculeon.generics.Group;

/**
 * @author leon on 11/12/2018.
 */
public class StringGroupInsertTest {
    @Test
    public void test1() {
        test("first test");
    }

    @Test
    public void test2() {
        test("second test");
    }

    @Test
    public void test3() {
        test("third test");
    }

    private void test(String valueToInsert) {
        // given
        Group<String> group = new Group<>();

        // when
        Assert.assertFalse(group.has(valueToInsert));
        group.insert(valueToInsert);

        // then
        Assert.assertTrue(group.has(valueToInsert));
    }
}
