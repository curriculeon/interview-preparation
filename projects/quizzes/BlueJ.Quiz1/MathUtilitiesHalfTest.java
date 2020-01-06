 

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MathUtilitiesHalfTest {
    private MathUtilities utilities;
    private static final double DELTA = 0.009; // allows a margin of error

    @Before
    public void setup(){
        utilities = new MathUtilities();
    }

    @Test
    public void test1(){
        //Given
        double expected = 2.0;

        //When
        double actual = utilities.half(4);

        //Then
        assertEquals(expected, actual, DELTA);
    }

    
    
    @Test
    public void test2(){
        //Given
        double expected = 4;

        //When
        double actual = utilities.half(8);

        //Then
        assertEquals(expected, actual, DELTA);
    }
    
    
    
    @Test
    public void test3(){
        //Given
        double expected = 8;

        //When
        double actual = utilities.half(16);

        //Then
        assertEquals(expected, actual, DELTA);
    }

}