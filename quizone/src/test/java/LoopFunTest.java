import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LoopFunTest {
    private LoopFun loop;

    @Before
    public void setUp(){
        loop = new LoopFun();
    }

    @Test
    public void testFactorialBase() {
        //Given
        int number = 1;
        int expected = 1;

        //When
        int actual = loop.factorial(number);

        //Then
        assertEquals(expected, actual);

    }

    @Test
    public void testFactorialOfSmallNumber() {
        //Given
        int number = 3;
        int expected = 6;

        //When
        int actual = loop.factorial(number);

        //Then
        assertEquals(expected, actual);

    }

    @Test
    public void testFactorialOfBigNumber() {
        //Given
        int number = 6;
        int expected = 720;

        //When
        int actual = loop.factorial(number);

        //Then
        assertEquals(expected, actual);

    }


    @Test
    public void testAcronym1() {
        //Given
        String phrase = "Portable Network Graphics";
        String expected = "PNG";

        //When
        String actual = loop.acronym(phrase);

        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void testAcronym2() {
        //Given
        String phrase = "Ruby on Rails";
        String expected = "ROR"; // YES

        //When
        String actual = loop.acronym(phrase);

        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void testAcronym3() {
        //Given
        String phrase = "First In, First Out";
        String expected = "FIFO";

        //When
        String actual = loop.acronym(phrase);

        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void testAcronym6() {
        // given
        String phrase = "Center Disease Control Whistle Blower";
        String expected = "CDCWB";

        // when
        String actual = loop.acronym(phrase);

        // then
        assertEquals(expected, actual);
    }

    @Test
    public void testAcronym7() {
        // given
        String phrase = "Tuskegee Macon County, Alabama";
        String expected = "TMCA";

        // when
        String actual = loop.acronym(phrase);

        // then
        assertEquals(expected, actual);
    }

    @Test
    public void testAcronym8() {
        // given
        String phrase = "John Charles Cutler";
        String expected = "JCC";

        // when
        String actual = loop.acronym(phrase);

        // then
        assertEquals(expected, actual);
    }

    @Test
    public void testAcronym9() {
        // Given
        String sentence = "digital immunity infrastructure";
        String expected = "DII";

        // When
        String actual = loop.acronym(sentence);

        // Then
        assertEquals(expected, actual);
    }
    @Test
    public void testAcronym4() {
        // given
        String phrase = "Tactical Reconnaissance Nuclear Powered Aerospace Platform";
        String expected = "TRNPAP";

        // when
        String actual = loop.acronym(phrase);

        // then
        assertEquals(expected, actual);
    }


    @Test
    public void testEncryptWithTheFirstAlphabet(){
        //Given
        String word = "apple";
        String expected = "dssoh";

        //When
        String actual = loop.encrypt(word);

        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void testEncryptWithTheLastLetters() {
        //Given
        String word = "wxyz";
        String expected = "zabc";

        //When
        String actual = loop.encrypt(word);

        //Then
        assertEquals(expected, actual);
    }



}