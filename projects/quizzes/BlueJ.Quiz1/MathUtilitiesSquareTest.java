 

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MathUtilitiesSquareTest {
    private MathUtilities utilities;

    @Before
    public void setup(){
        utilities = new MathUtilities();
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
