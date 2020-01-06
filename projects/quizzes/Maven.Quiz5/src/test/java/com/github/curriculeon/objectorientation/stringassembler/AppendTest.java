package com.github.curriculeon.objectorientation.stringassembler;

import org.junit.Assert;
import org.junit.Test;
import com.github.curriculeon.objectorientation.StringAssembler;

/**
 * @author leon on 11/12/2018.
 */
public class AppendTest {
    @Test
    public void test1() {
        // given
        Character delimeter = ' ';
        String expected = "The quick brown fox jumps";

        // when
        String actual = new StringAssembler(delimeter)
                .append("The")
                .append("quick")
                .append("brown")
                .append("fox")
                .append("jumps")
                .assemble();

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        // given
        Character delimeter = '\n';
        String expected = "The\nquick\nbrown\nfox\njumps";

        // when
        String actual = new StringAssembler(delimeter)
                .append("The")
                .append("quick")
                .append("brown")
                .append("fox")
                .append("jumps")
                .assemble();

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        // given
        Character delimeter = '_';
        String expected = "The_quick_brown_fox_jumps";

        // when
        String actual = new StringAssembler(delimeter)
                .append("The")
                .append("quick")
                .append("brown")
                .append("fox")
                .append("jumps")
                .assemble();

        // then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void test4() {
        // given
        Character delimeter = ';';
        String expected = "The;quick;brown;fox;jumps";

        // when
        String actual = new StringAssembler(delimeter)
                .append("The")
                .append("quick")
                .append("brown")
                .append("fox")
                .append("jumps")
                .assemble();

        // then
        Assert.assertEquals(expected, actual);
    }

}
