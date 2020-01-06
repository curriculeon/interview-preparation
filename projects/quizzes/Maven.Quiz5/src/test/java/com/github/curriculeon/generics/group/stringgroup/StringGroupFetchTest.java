package com.github.curriculeon.generics.group.stringgroup;

import org.junit.Assert;
import org.junit.Test;
import com.github.curriculeon.generics.Group;

import java.util.Arrays;
import java.util.List;

/**
 * @author leon on 11/12/2018.
 */
public class StringGroupFetchTest {
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

    @Test(expected = IndexOutOfBoundsException.class)
    public void test4() {
        // given
        Group<String> group = new Group<>();

        // when
        group.fetch(10);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void test5() {
        // given
        Group<String> group = new Group<>();

        // when
        group.fetch(15);
    }


    private void test(String... stringsToInsert) {
        // given
        Group<String> group = new Group<>();
        List<String> simpleStringGroupContents = Arrays.asList(stringsToInsert);
        simpleStringGroupContents.forEach(string -> group.insert(string));

        // when
        for (int i = 0; i < stringsToInsert.length; i++) {
            Assert.assertEquals(stringsToInsert[i], group.fetch(i));
        }
    }
}
