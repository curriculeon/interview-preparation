package com.github.curriculeon.part1.basicutilities;

import com.github.curriculeon.part1.BasicUtilities;
import org.junit.Assert;
import org.junit.Test;

public class StartsWithTest {
    @Test
    public void test1() {
        test("The", 'T', true);
    }

    @Test
    public void test2() {
        test("The", 't', true);
    }

    @Test
    public void test3() {
        test("jump", 'z', false);
    }

    @Test
    public void test4() {
        test("tractor", 'f', false);
    }

    private void test(String value, Character character, Boolean expectdOutcome) {
        // given
        BasicUtilities basicUtilities = new BasicUtilities();

        // when
        Boolean actualOutcome = basicUtilities.startsWith(value, character);

        // then
        Assert.assertEquals(expectdOutcome, actualOutcome);
    }
}
