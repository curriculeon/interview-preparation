 

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringUtilsGetMiddleCharacterTest {

    private StringUtilities utilities;

    @Before
    public void setUp() {
        utilities = new StringUtilities();
    }

    @Test
    public void test1(){
        //Given
        String word = "Aggadah";
        char expected = 'a';

        //When
        char actual = utilities.getMiddleCharacter(word);

        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        //Given
        String word = "information";
        char expected = 'm';

        //When
        char actual = utilities.getMiddleCharacter(word);

        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        //Given
        String word = "reification";
        char expected = 'c';

        //When
        char actual = utilities.getMiddleCharacter(word);

        //Then
        assertEquals(expected, actual);
    }


    @Test
    public void test4(){
        //Given
        String word = "ohm";
        char expected = 'h';

        //When
        char actual = utilities.getMiddleCharacter(word);

        //Then
        assertEquals(expected, actual);
    }
}
