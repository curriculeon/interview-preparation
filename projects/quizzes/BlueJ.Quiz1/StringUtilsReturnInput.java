 

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StringUtilsReturnInput {

    private StringUtilities utilities;

    @Before
    public void setUp() {
        utilities = new StringUtilities();
    }

    @Test
    public void test1() {
        // given
        String input = "Deshret";
        String expected = input;

        // when
        String actual = utilities.returnInput(input);

        // then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void test2() {
        // given
        String input = "Hedjet";
        String expected = input;

        // when
        String actual = utilities.returnInput(input);

        // then
        Assert.assertEquals(expected, actual);
    }



    @Test
    public void test3() {
        // given
        String input = "Khepresh";
        String expected = input;

        // when
        String actual = utilities.returnInput(input);

        // then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void test4() {
        // given
        String input = "Pschent";
        String expected = input;

        // when
        String actual = utilities.returnInput(input);

        // then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void test5() {
        // given
        String input = "Atef";
        String expected = input;

        // when
        String actual = utilities.returnInput(input);

        // then
        Assert.assertEquals(expected, actual);
    }
}
