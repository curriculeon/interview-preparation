package com.github.curriculeon.part1;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 3/1/18.
 */
public class WuTangConcatenatorTest {
    @Test
    public void testFive() {
        Integer input = 5;
        WuTangConcatenator wtc = new WuTangConcatenator(input);

        boolean isWu = wtc.isWu();
        boolean isTang = wtc.isTang();
        boolean isWuTang = wtc.isWuTang();

        Assert.assertFalse(isWu); // multiple of 3
        Assert.assertTrue(isTang); // multiple of 5
        Assert.assertFalse(isWuTang); // multiple of 15
    }

    @Test
    public void testThree() {
        Integer input = 3;
        WuTangConcatenator wtc = new WuTangConcatenator(input);

        boolean isWu = wtc.isWu();
        boolean isTang = wtc.isTang();
        boolean isWuTang = wtc.isWuTang();

        Assert.assertTrue(isWu); // multiple of 3
        Assert.assertFalse(isTang); // multiple of 5
        Assert.assertFalse(isWuTang); // multiple of 15
    }


    @Test
    public void testTen() {
        Integer input = 10;
        WuTangConcatenator wtc = new WuTangConcatenator(input);

        boolean isWu = wtc.isWu();
        boolean isTang = wtc.isTang();
        boolean isWuTang = wtc.isWuTang();

        Assert.assertFalse(isWu); // multiple of 3
        Assert.assertTrue(isTang); // multiple of 5
        Assert.assertFalse(isWuTang); // multiple of 15
    }


    @Test
    public void testSix() {
        Integer input = 6;
        WuTangConcatenator wtc = new WuTangConcatenator(input);

        boolean isWu = wtc.isWu();
        boolean isTang = wtc.isTang();
        boolean isWuTang = wtc.isWuTang();

        Assert.assertTrue(isWu); // multiple of 3
        Assert.assertFalse(isTang); // multiple of 5
        Assert.assertFalse(isWuTang); // multiple of 15
    }


    @Test
    public void testFifteen() {
        Integer input = 15;
        WuTangConcatenator wtc = new WuTangConcatenator(input);

        boolean isWu = wtc.isWu();
        boolean isTang = wtc.isTang();
        boolean isWuTang = wtc.isWuTang();

        Assert.assertTrue(isWu); // multiple of 3
        Assert.assertTrue(isTang); // multiple of 5
        Assert.assertTrue(isWuTang); // multiple of 15
    }
}
