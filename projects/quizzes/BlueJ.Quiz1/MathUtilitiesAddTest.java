 

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MathUtilitiesAddTest
{
    private MathUtilities utilities;
    private static final double DELTA = 0.009;

    @Before
    public void setup(){
        utilities = new MathUtilities();
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
}