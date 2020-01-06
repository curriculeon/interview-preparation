package com.github.curriculeon.fundamentals.stringutils;

import org.junit.Assert;
import org.junit.Test;
import com.github.curriculeon.fundamentals.StringUtils;

/**
 * @author leon on 09/12/2018.
 */
public class IsCharacterAtIndex {
    @Test
    public void test1() {
        // given
        String string = "Quickly";
        Character character = 'Q';
        Integer index = 0;

        // then
        Assert.assertTrue(StringUtils.isCharacterAtIndex(string, character, index));
    }

    @Test
    public void test2() {
        // given
        String string = "Quickly";
        Character character = 'q';
        Integer index = 0;

        // then
        Assert.assertFalse(StringUtils.isCharacterAtIndex(string, character, index));
    }


    @Test
    public void test3() {
        // given
        String string = "Quickly";
        Character character = 'y';
        Integer index = 6;

        // then
        Assert.assertTrue(StringUtils.isCharacterAtIndex(string, character, index));
    }

    @Test
    public void test4() {
        // given
        String string = "Quickly";
        Character character = 'Y';
        Integer index = 6;

        // then
        Assert.assertFalse(StringUtils.isCharacterAtIndex(string, character, index));
    }

}
