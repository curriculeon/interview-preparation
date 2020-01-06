package com.github.curriculeon.collections.simplestringgroup;

import org.junit.Assert;
import org.junit.Test;
import com.github.curriculeon.collections.SimpleStringGroup;

/**
 * @author leon on 11/12/2018.
 */
public class ClearTest {
    @Test
    public void test1() {
        test("first", "clear", "test");
    }

    @Test
    public void test2() {
        test("an", "additional", "test", "here");
    }

    @Test
    public void test3() {
        test("a", "dash", "of", "anonymity");
    }

    private void test(String... valuesToInsert) {
        // given
        SimpleStringGroup group = new SimpleStringGroup();
        for(String valueToInsert : valuesToInsert) {
            group.insert(valueToInsert);
            Assert.assertTrue(group.has(valueToInsert));
        }

        // when
        group.clear();


        // then
        for(String valueToInsert : valuesToInsert) {
            Assert.assertFalse(group.has(valueToInsert));
        }
    }
}
