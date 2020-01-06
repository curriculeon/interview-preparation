
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StringUtilsConcatenateTest {
    private StringUtilities stringUtils;

    @Before 
    public void setup() {
        this.stringUtils = new StringUtilities();
    }

    @Test
    public void test0() {
        // given
        String expected = "StarTetrahedron";
        String baseValue = "Star";
        String valueToBeAdded = "Tetrahedron";
        // when
        String actual = stringUtils.concatenate(baseValue, valueToBeAdded);

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test1() {
        // given
        String expected = "Metatron'sCube";
        String baseValue = "Metatron's";
        String valueToBeAdded = "Cube";

        // when
        String actual = stringUtils.concatenate(baseValue, valueToBeAdded);

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        // given
        String expected = "NebuchadnezzarII";
        String baseValue = "Nebuchadnezzar";
        String valueToBeAdded = "II";

        // when
        String actual = stringUtils.concatenate(baseValue, valueToBeAdded);

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        // given
        String expected = "StellatedOctahedron";
        String baseValue = "Stellated";
        String valueToBeAdded = "Octahedron";

        // when
        String actual = stringUtils.concatenate(baseValue, valueToBeAdded);

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test4() {
        // given
        String expected = "DracosConstellation";
        String baseValue = "Dracos";
        String valueToBeAdded = "Constellation";

        // when
        String actual = stringUtils.concatenate(baseValue, valueToBeAdded);

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test5() {
        // given
        String expected = "HeartHarmonics";
        String baseValue = "Heart";
        String valueToBeAdded = "Harmonics";

        // when
        String actual = stringUtils.concatenate(baseValue, valueToBeAdded);

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test6() {
        // given
        String expected = "ZetaReticuli";
        String baseValue = "Zeta";
        String valueToBeAdded = "Reticuli";

        // when
        String actual = stringUtils.concatenate(baseValue, valueToBeAdded);

        // then
        Assert.assertEquals(expected, actual);
    }

}
