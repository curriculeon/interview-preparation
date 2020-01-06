package com.github.curriculeon.generics.group;

import com.github.curriculeon.generics.Group;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author leon on 11/12/2018.
 */
public class GroupToStringTest {
    @Test
    public void test1() {
        String expected = "[the, quick, brown, fox]";
        Group<String> group = new Group<>();
        group.insert("the");
        group.insert("quick");
        group.insert("brown");
        group.insert("fox");

        // when
        String actual = group.toString();

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        String expected = "[123, 456, 789, 101112]";
        Group<Number> group = new Group<>();
        group.insert(123);
        group.insert(456);
        group.insert(789);
        group.insert(101112);

        // when
        String actual = group.toString();

        // then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void test3() {
        String expected = "[a, b, c, d]";
        Group<Character> group = new Group<>();
        group.insert('a');
        group.insert('b');
        group.insert('c');
        group.insert('d');

        // when
        String actual = group.toString();

        // then
        Assert.assertEquals(expected, actual);
    }
}
