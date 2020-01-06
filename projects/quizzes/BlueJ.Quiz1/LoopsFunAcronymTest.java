
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LoopsFunAcronymTest {
    private LoopFun loop;

    @Before
    public void setUp() {
        loop = new LoopFun();
    }

    @Test
    public void test1() {
        //Given
        String phrase = "Portable Network Graphics";
        String expected = "PNG";

        //When
        String actual = loop.acronym(phrase);

        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        //Given
        String phrase = "Ruby on Rails";
        String expected = "ROR"; // YES

        //When
        String actual = loop.acronym(phrase);

        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        //Given
        String phrase = "First In, First Out";
        String expected = "FIFO";

        //When
        String actual = loop.acronym(phrase);

        //Then
        assertEquals(expected, actual);
    }

    public void test6() {
        // given
        String phrase = "Center Disease Control Whistle Blower";
        String expected = "CDCWB";

        // when
        String actual = loop.acronym(phrase);

        // then
        assertEquals(expected, actual);
    }

    public void test7() {
        // given
        String phrase = "Tuskegee Macon County, Alabama";
        String expected = "TMCA";

        // when
        String actual = loop.acronym(phrase);

        // then
        assertEquals(expected, actual);
    }

    public void test8() {
        // given
        String phrase = "John Charles Cutler";
        String expected = "JCC";

        // when
        String actual = loop.acronym(phrase);

        // then
        assertEquals(expected, actual);
    }

    @Test
    public void test9() {
        // Given
        String sentence = "digital immunity infrastructure";
        String expected = "DII";

        // When
        String actual = loop.acronym(sentence);

        // Then
        assertEquals(expected, actual);
    }

    public void test4() {
        // given
        String phrase = "Tactical Reconnaissance Nuclear Powered Aerospace Platform";
        String expected = "TRNPAP";

        // when
        String actual = loop.acronym(phrase);

        // then
        assertEquals(expected, actual);
    }
}
