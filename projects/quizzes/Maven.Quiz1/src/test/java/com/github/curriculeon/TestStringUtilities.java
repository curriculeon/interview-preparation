package com.github.curriculeon;


import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by dan on 6/14/17.
 */
public class TestStringUtilities {
    @Test
    public void getHelloWorldTest() {
        // : Given
        String expected = "Hello World";

        // : When
        String actual = StringUtilities.getHelloWorld();

        // : Then
        assertEquals(expected, actual);

    }

    @Test
    public void concatenationStringTest(){
        // : Given
        String one = "Hello";
        String two = " Java";
        String expected = "Hello Java";

        // : When
        String actual = StringUtilities.concatenation(one,two);


        // : Then
        assertEquals(expected, actual);
    }


    @Test
    public void concatenationStringAndIntegerTest(){
        // : Given
        int one = 1;
        String two = " Java";
        String expected = "1 Java";

        // : When
        String actual = StringUtilities.concatenation(one,two);


        // : Then
        assertEquals(expected, actual);
    }

    @Test
    public void substringBeginTest(){
        // : Given
        String input = "Hello";
        String expected = "Hel";

        // : When
        String actual = StringUtilities.getPrefix(input);

        // : Then
        assertEquals(expected, actual);
    }

    @Test
    public void substringEndTest(){
        // : Given
        String input = "Hello";
        String expected = "llo";

        // : When
        String actual = StringUtilities.getSuffix("Hello");

        // : Then
        assertEquals(expected, actual);
    }

    @Test
    public void testCompareToEquals(){
        // : Given
        String inputValue = "Curriculeon";
        String comparableValue = "Curriculeon";

        // : When
        boolean actual = StringUtilities.compareTwoStrings(inputValue, comparableValue);

        // : Then
        assertTrue(actual);
    }


    @Test
    public void testCompareToNotEquals(){
        // : Given
        String inputValue = "Curriculeon";
        String comparableValue = "CodeDifferent";

        // : When
        boolean actual = StringUtilities.compareTwoStrings(inputValue, comparableValue);

        // : Then
        assertFalse(actual);
    }

    @Test
    public void getTheMiddleCharOfCodeDifferently(){
        // : Given
        String input = "Curriculeon";
        Character expected = 'f';

        // : When
        Character actual = StringUtilities.getMiddleCharacter(input);

        // : Then
        assertEquals(expected.toString(), actual.toString());
    }


    @Test
    public void getTheMiddleCharOfCodeDifferent(){
        // : Given
        String input = "CodeDifferent";
        Character expected = 'i';

        // : When
        Character actual = StringUtilities.getMiddleCharacter(input);

        // : Then
        assertEquals(expected.toString(), actual.toString());
    }


    @Test
    public void getTheFirstWord(){
        // : Given
        String input = "Code Differently";
        String expected = "Code";

        // : When
        String actual = StringUtilities.getFirstWord(input);

        // : Then
        assertEquals(expected, actual);
    }


    @Test
    public void getTheSecondWord(){
        // : Given
        String input = "Code Differently";
        String expected = "Differently";

        // : When
        String actual = StringUtilities.getSecondWord(input);

        // : Then
        assertEquals(expected, actual);
    }

    @Test
    public void reverseHello(){
        // : Given
        String input = "Hello";
        String expected = "olleH";


        // : When
        String actual = StringUtilities.reverse(input);

        // : Then
        assertEquals(expected, actual);
    }

    @Test
    public void reverseHey(){
        // : Given
        String input = "Hey";
        String expected = "yeH";


        // : When
        String actual = StringUtilities.reverse(input);

        // : Then
        assertEquals(expected, actual);
    }

    @Test
    public void reverseCodeDifferently(){
        // : Given
        String input = "Curriculeon";
        String expected = "yltnereffiDedoC";


        // : When
        String actual = StringUtilities.reverse(input);

        // : Then
        assertEquals(expected, actual);
    }
}
