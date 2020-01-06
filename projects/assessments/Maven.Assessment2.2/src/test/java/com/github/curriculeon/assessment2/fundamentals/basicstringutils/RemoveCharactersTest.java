package com.github.curriculeon.assessment2.fundamentals.basicstringutils;

import com.github.curriculeon.assessment2.fundamentals.BasicStringUtils;
import org.junit.Assert;
import org.junit.Test;

public class RemoveCharactersTest {
    @Test
    public void test1() {
        test("racecar", "r", "aceca");
    }

    @Test
    public void test2() {
        test("basketball", "b", "asketall");
    }

    @Test
    public void test3() {
        test("basketball", "teks", "baball");
    }

    @Test
    public void test4() {
        test("football", "fto", "ball");
    }

    private void test(String string, String charactersToRemove, String expectedString) {
        // when
        String actualString = BasicStringUtils.removeCharacters(string, charactersToRemove);


        // then
        Assert.assertEquals(expectedString, actualString);
    }
}
