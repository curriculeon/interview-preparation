 

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LoopFunEncryptTest
{
    private LoopFun loop;

    @Before
    public void setUp(){
        loop = new LoopFun();
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
