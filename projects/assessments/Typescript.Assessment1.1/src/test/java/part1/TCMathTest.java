package part1;

import org.junit.Assert;
import org.junit.Test;

public class TCMathTest {
    /**
     * Please refer to the readme and complete the unit test.
     * **/
    @Test
    public void isPrimeTest1(){
        //:Given
        TCMath tcMath = new TCMath();

        //:When
        String expected = "*** Output ***\ntrue";
        String actual = tcMath.isPrime(7);
        //:Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void isPrimeTest2(){
        //:Given
        TCMath tcMath = new TCMath();

        //:When
        String expected = "*** Output ***\nfalse";
        String actual = tcMath.isPrime(22);
        //:Then
        Assert.assertEquals(expected,actual);
    }
}
