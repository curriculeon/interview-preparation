import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MathUtilitiesTest {

    private MathUtilities utilities;
    private static final double DELTA = 0.009;

    @Before
    public void setup(){
        utilities = new MathUtilities();
    }


    @Test
    public void isOdd() {
    }

    @Test
    public void square() {
    }

    @Test
    public void testAddInteger(){
        //Given
        int expected = 15;

        //When
        int actual = utilities.add(7, 8);

        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void testAddDouble(){
        //Given
        double expected = 11.22;

        //When
        double actual = utilities.add(10.0, 1.22);

        //Then
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void testHalf1(){
        //Given
        double expected = 2.0;

        //When
        double actual = utilities.half(4);

        //Then
        assertEquals(expected, actual, DELTA);
    }



    @Test
    public void testHalf2(){
        //Given
        double expected = 4;

        //When
        double actual = utilities.half(8);

        //Then
        assertEquals(expected, actual, DELTA);
    }



    @Test
    public void testHalf3(){
        //Given
        double expected = 8;

        //When
        double actual = utilities.half(16);

        //Then
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void testIsOddForOddNumber(){
        assertTrue(utilities.isOdd(7));
    }

    @Test
    public void testIsOddForEvenNumber(){
        assertFalse(utilities.isOdd(12));
    }

    @Test
    public void testSquareForBaseCase() {
        //Given
        int expected = 1;

        //When
        int actual = utilities.square(1);

        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void testSquareForOneDigit() {
        //Given
        int expected = 9;

        //When
        int actual = utilities.square(3);

        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void testSquareForTwoDigit() {
        //Given
        int expected = 121;

        //When
        int actual = utilities.square(11);

        //Then
        assertEquals(expected, actual);
    }

}