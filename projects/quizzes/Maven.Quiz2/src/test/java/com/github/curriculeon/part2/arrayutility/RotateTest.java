package com.github.curriculeon.part2.arrayutility;

import com.github.curriculeon.part2.ArrayUtility;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RotateTest {
    private ArrayUtility utility;

    @Before
    public void setup(){
        utility = new ArrayUtility();
    }


    @Test
    public void testRotateLeft_forOne(){
        //Given
        Integer[] array = {5, 1, 8, 4, 2};
        Integer[] expected = {1, 8, 4, 2, 5};

        //When
        Integer[] actual = utility.rotate(array, 1);

        //Then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testRotateLeft_forMoreThanOne(){
        //Given
        Integer[] array = {5, 1, 8, 4, 2};
        Integer[] expected = {4, 2, 5, 1, 8,};

        //When
        Integer[] actual = utility.rotate(array, 3);

        //Then
        Assert.assertArrayEquals(expected, actual);
    }
}
