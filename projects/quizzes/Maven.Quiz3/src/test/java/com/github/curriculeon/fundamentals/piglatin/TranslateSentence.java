package com.github.curriculeon.fundamentals.piglatin;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import com.github.curriculeon.fundamentals.PigLatinGenerator;

/**
 * @author leon on 09/12/2018.
 */
public class TranslateSentence {
    private PigLatinGenerator p;

    @Before
    public void setUp() throws Exception {
        this.p = new PigLatinGenerator();
    }

    @Test
    public void testTheQuickBrownFoxJumpsOverTheLazyDog() {
        String input = "The Quick Brown Fox Jumps Over The Lazy Dog";
        String expected = "eThay uickQay ownBray oxFay umpsJay Overway eThay azyLay ogDay";
        String actual = p.translate(input);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void test_thequickbrownfoxjumpsoverthelazydog() {
        String input = "The Quick Brown Fox Jumps Over The Lazy Dog".toLowerCase();
        String expected = "eThay uickQay ownBray oxFay umpsJay Overway eThay azyLay ogDay".toLowerCase();
        String actual = p.translate(input);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testTHEQUICKBROWNFOXJUMPSOVERTHELAZYDOG() {
        String input = "The Quick Brown Fox Jumps Over The Lazy Dog".toUpperCase();
        String expected = "ETHay UICKQay OWNBRay OXFay UMPSJay OVERway ETHay AZYLay OGDay";
        String actual = p.translate(input);
        Assert.assertEquals(expected, actual);

    }
}
