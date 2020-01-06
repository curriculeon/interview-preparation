package com.github.curriculeon.fundamentals.piglatin;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import com.github.curriculeon.fundamentals.PigLatinGenerator;

/**
 * @author leon on 09/12/2018.
 *
 */
public class TranslateSingleWordStartingWithConsonant {
    private PigLatinGenerator p;

    @Before
    public void setUp() {
        this.p = new PigLatinGenerator();
    }

    @Test
    public void testMap() {
        Assert.assertEquals("apMay", p.translate("Map"));
    }


    @Test
    public void testSpaghetti() {
        Assert.assertEquals("aghettiSpay", p.translate("Spaghetti"));
    }

    @Test
    public void testJava() {
        Assert.assertEquals("avaJay", p.translate("Java"));
    }

    @Test
    public void testPython() {
        Assert.assertEquals("onPythay", p.translate("Python"));
    }

    @Test
    public void testPsychosis() {
        Assert.assertEquals("osisPsychay", p.translate("Psychosis"));
    }

    @Test
    public void testPneumonia() {
        Assert.assertEquals("eumoniaPnay", p.translate("Pneumonia"));
    }

    @Test
    public void testRuby() {
        Assert.assertEquals("ubyRay", p.translate("Ruby"));
    }


    @Test
    public void testCCC() {
        Assert.assertEquals("CCCCay", p.translate("CCCC"));
    }
}
