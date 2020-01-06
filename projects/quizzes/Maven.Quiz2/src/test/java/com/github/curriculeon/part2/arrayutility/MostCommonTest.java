package com.github.curriculeon.part2.arrayutility;

import com.github.curriculeon.part2.ArrayUtility;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MostCommonTest {
    private ArrayUtility utility;

    @Before
    public void setup(){
        utility = new ArrayUtility();
    }


    @Test
    public void testMostCommon_withOnlyOneElement(){
        //Given
        Integer[] array = {5};
        Integer expected = 5;

        //When
        Integer actual = utility.mostCommon(array);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testMostCommon_withMultipleElements(){
        //Given
        Integer commonValue = 8;
        Integer[] array = {commonValue, 5, 1, 1, commonValue, 5, 5, commonValue, commonValue};

        //When
        Integer actual = utility.mostCommon(array);

        //Then
        Assert.assertEquals(commonValue, actual);
    }
}
