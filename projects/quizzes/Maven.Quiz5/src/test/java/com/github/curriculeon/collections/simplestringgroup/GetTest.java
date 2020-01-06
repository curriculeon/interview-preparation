package com.github.curriculeon.collections.simplestringgroup;

import org.junit.Assert;
import org.junit.Test;
import com.github.curriculeon.collections.SimpleStringGroup;

import java.util.Arrays;
import java.util.List;

/**
 * @author leon on 11/12/2018.
 */
public class GetTest {
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
        SimpleStringGroup group = new SimpleStringGroup();

        // when
        group.fetch(10);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void test5() {
        // given
        SimpleStringGroup group = new SimpleStringGroup();

        // when
        group.fetch(15);
    }


    private void test(String... stringsToInsert) {
        // given
        SimpleStringGroup group = new SimpleStringGroup();
        List<String> simpleStringGroupContents = Arrays.asList(stringsToInsert);
        simpleStringGroupContents.forEach(string -> group.insert(string));

        // when
        for (int i = 0; i < stringsToInsert.length; i++) {
            Assert.assertEquals(stringsToInsert[i], group.fetch(i));
        }
    }
}
