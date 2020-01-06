package com.github.curriculeon.fundamentals.piglatin;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import com.github.curriculeon.fundamentals.PigLatinGenerator;

/**
 * @author leon on 09/12/2018.
 */
public class TranslateSingleWordStartingWithVowel {
    private PigLatinGenerator p;

    @Before
    public void setUp() throws Exception {
        this.p = new PigLatinGenerator();
    }

    @Test
    public void testegg() {
        Assert.assertEquals("eggway", p.translate("egg"));
    }

    @Test
    public void testapple() {
        Assert.assertEquals("appleway", p.translate("apple"));
    }
}
