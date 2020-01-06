package com.github.curriculeon.generics.group.stringgroup;

import org.junit.Assert;
import org.junit.Test;
import com.github.curriculeon.generics.Group;

/**
 * @author leon on 11/12/2018.
 */
public class StringGroupDeleteTest {
    @Test
    public void test1() {
        // given
        Group<String> group = new Group<>();
        String valueToInsert = "first test";

        // when
        group.insert(valueToInsert);
        group.delete(valueToInsert);

        Assert.assertFalse(group.has(valueToInsert));
    }

    @Test
    public void test2() {
        // given
        Group<String> group = new Group<>();
        String valueToInsert = "second test";

        // when
        group.insert(valueToInsert);
        group.delete(valueToInsert);

        // then
        Assert.assertFalse(group.has(valueToInsert));
    }

    @Test
    public void test3() {
        // given
        Group<String> group = new Group<>();
        String valueToInsert = "third test";

        // when
        group.insert(valueToInsert);
        group.delete(valueToInsert);

        // then
        Assert.assertFalse(group.has(valueToInsert));
    }
}
