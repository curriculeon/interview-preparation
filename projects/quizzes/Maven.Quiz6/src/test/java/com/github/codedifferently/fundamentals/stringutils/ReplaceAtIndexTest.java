package com.github.codedifferently.fundamentals.stringutils;

import com.github.codedifferently.fundamentals.StringUtils;
import org.junit.Assert;
import org.junit.Test;

public class ReplaceAtIndexTest {
    @Test
    public void test1() {
        String input = "reptilian";
        String expected = "Reptilian";
        Character insertValue = 'R';
        Integer indexToReplaceAt = 0;
        test(expected, input, insertValue, indexToReplaceAt);
    }

    @Test
    public void test2() {
        String input = "reptilian";
        String expected = "rEptilian";
        Character insertValue = 'E';
        Integer indexToReplaceAt = 1;
        test(expected, input, insertValue, indexToReplaceAt);
    }

    @Test
    public void test3() {
        String input = "reptilian";
        String expected = "rePtilian";
        Character insertValue = 'P';
        Integer indexToReplaceAt = 2;
        test(expected, input, insertValue, indexToReplaceAt);
    }



    @Test
    public void test4() {
        String input = "reptilian";
        String expected = "repTilian";
        Character insertValue = 'T';
        Integer indexToReplaceAt = 3;
        test(expected, input, insertValue, indexToReplaceAt);
    }


    @Test
    public void test5() {
        String input = "reptilian";
        String expected = "reptIlian";
        Character insertValue = 'I';
        Integer indexToReplaceAt = 4;
        test(expected, input, insertValue, indexToReplaceAt);
    }



    @Test
    public void test6() {
        String input = "reptilian";
        String expected = "reptiLian";
        Character insertValue = 'L';
        Integer indexToReplaceAt = 5;
        test(expected, input, insertValue, indexToReplaceAt);
    }



    @Test
    public void test7() {
        String input = "reptilian";
        String expected = "reptilIan";
        Character insertValue = 'I';
        Integer indexToReplaceAt = 6;
        test(expected, input, insertValue, indexToReplaceAt);
    }



    @Test
    public void test8() {
        String input = "reptilian";
        String expected = "reptiliAn";
        Character insertValue = 'A';
        Integer indexToReplaceAt = 7;
        test(expected, input, insertValue, indexToReplaceAt);
    }



    @Test
    public void test9() {
        String input = "reptilian";
        String expected = "reptiliaN";
        Character insertValue = 'N';
        Integer indexToReplaceAt = 8;
        test(expected, input, insertValue, indexToReplaceAt);
    }


    @Test
    public void test10() {
        String input = "reptilian";
        String expected = "reptilia\n";
        Character insertValue = '\n';
        Integer indexToReplaceAt = 8;
        test(expected, input, insertValue, indexToReplaceAt);
    }


    private void test(String expected, String input, Character replacementValue, Integer indexToReplaceAt) {
        String actual = StringUtils.replaceAtIndex(input, replacementValue, indexToReplaceAt);
        Assert.assertEquals(expected, actual);
    }
}
