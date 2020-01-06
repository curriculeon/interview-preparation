package com.github.curriculeon.collections.simplestringgroup;

import org.junit.Assert;
import org.junit.Test;
import com.github.curriculeon.collections.SimpleStringGroup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author leon on 11/12/2018.
 */
public class IterableTest {
    @Test
    public void test1() {
        test("the");
    }

    @Test
    public void test2() {
        test("the", "quick");
    }

    @Test
    public void test3() {
        test("the", "quick", "brown");
    }


    @Test
    public void test4() {
        test("the", "quick", "brown", "fox");
    }

    @Test
    public void test5() {
        test("the", "quick", "brown", "fox", "jumps");
    }

    private void test(String... stringsToInsert) {
        // given
        List<String> result = new ArrayList<>();
        SimpleStringGroup group = new SimpleStringGroup();
        List<String> simpleStringGroupContents = Arrays.asList(stringsToInsert);
        simpleStringGroupContents.forEach(string -> group.insert(string));
        Iterable<String> simpleStringGroup = (Iterable<String>)group;

        // when
        simpleStringGroup.forEach(string -> result.add(string));

        // then
        Assert.assertEquals(group.count().intValue(), result.size());
    }
}
