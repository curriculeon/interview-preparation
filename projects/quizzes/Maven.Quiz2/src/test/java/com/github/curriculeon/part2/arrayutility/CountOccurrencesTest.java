package com.github.curriculeon.part2.arrayutility;

import com.github.curriculeon.part2.ArrayUtility;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CountOccurrencesTest {
    private ArrayUtility utility;

    @Before
    public void setup(){
        utility = new ArrayUtility();
    }


    @Test
    public void countOccurrence_whenValueDoesNotExist() {
        // Given
        Integer valueToEvaluate = 7;
        Integer expected = 0;
        Integer[] array1 = {1, 6};
        Integer[] array2 = {9, 8, 11};

        // When
        Integer actual = utility.countOccurrence(array1, array2, valueToEvaluate);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void countOccurrence_whenValueExistInFirstArray() {
        // Given
        Integer valueToEvaluate = 7;
        Integer expected = 1;
        Integer[] array1 = {1, 6, valueToEvaluate};
        Integer[] array2 = {3};

        // When
        Integer actual = utility.countOccurrence(array1, array2, valueToEvaluate);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void countOccurrence_whenValueExistInSecondArray() {
        // Given
        Integer valueToEvaluate = 9;
        Integer expected = 2;
        Integer[] array1 = {1, 6};
        Integer[] array2 = {valueToEvaluate, valueToEvaluate, 3};

        // When
        Integer actual = utility.countOccurrence(array1, array2, valueToEvaluate);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void countOccurrence_whenValueAppearsInBoth() {
        // Given
        Integer valueToEvaluate = 7;
        Integer expected = 7;
        Integer[] array1 = {valueToEvaluate, 1, valueToEvaluate, 8, 84, 5, valueToEvaluate, 9, 8, valueToEvaluate};
        Integer[] array2 = {1, valueToEvaluate, valueToEvaluate, 8, 5, valueToEvaluate, 91};

        // When
        Integer actual = utility.countOccurrence(array1, array2, valueToEvaluate);

        // Then
        Assert.assertEquals(expected, actual);
    }

}
