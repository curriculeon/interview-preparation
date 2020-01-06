 

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MathUtilitiesIsOddTest {
    private MathUtilities utilities;

    @Before
    public void setup(){
        utilities = new MathUtilities();
    }

    @Test
    public void testIsOddForOddNumber(){
        assertTrue(utilities.isOdd(7));
    }

    @Test
    public void testIsOddForEvenNumber(){
        assertFalse(utilities.isOdd(12));
    }

}
