package com.github.codedifferently.objectorientation;

import org.junit.Assert;
import org.junit.Test;

public class TVChannelTest {
    @Test
    public void test0() {
        Assert.assertEquals(9, TVChannel.values().length);
    }

    @Test
    public void test1() {
        test(0, "MSN");
    }

    @Test
    public void test2() {
        test(1, "CNN");
    }

    @Test
    public void test3() {
        test(2, "FOX");
    }

    @Test
    public void test4() {
        test(3, "AE");
    }

    @Test
    public void test5() {
        test(4, "MTV");
    }

    @Test
    public void test6() {
        test(5, "BET");
    }

    @Test
    public void test7() {
        test(6, "HBO");
    }

    @Test
    public void test8() {
        test(7, "NBC");
    }

    @Test
    public void test9() {
        test(8, "CBS");
    }

    private void test(int enumOrdinal, String expectedName) {
        TVChannel tvChannel = TVChannel.getByOrdinal(enumOrdinal);
        String actualName = tvChannel.name();

        Assert.assertEquals(expectedName, actualName);
    }
}
