package com.github.curriculeon.part2.listutility;

import com.github.curriculeon.part2.ListUtility;
import org.junit.Assert;
import org.junit.Test;

public class MostCommonTest {

    @Test
    public void test1() {
        Integer mostCommonValue = 8193;
        Integer[] valuesToAdd = {mostCommonValue, mostCommonValue, mostCommonValue, 10};
        test(valuesToAdd, mostCommonValue);
    }

    @Test
    public void test2() {
        Integer mostCommonValue = 6783;
        Integer[] valuesToAdd = {mostCommonValue, mostCommonValue, mostCommonValue, 10};
        test(valuesToAdd, mostCommonValue);
    }


    @Test
    public void test3() {
        Integer mostCommonValue = null;
        Integer[] valuesToAdd = {mostCommonValue, mostCommonValue, mostCommonValue, 10};
        test(valuesToAdd, mostCommonValue);
    }

    @Test
    public void test4() {
        Integer mostCommonValue = Integer.MAX_VALUE;
        Integer[] valuesToAdd = {mostCommonValue, mostCommonValue, mostCommonValue, 10};
        test(valuesToAdd, mostCommonValue);
    }


    public void test(Integer[] valuesToAdd, Integer mostCommonValue) {
        //Given
        ListUtility utility = new ListUtility();
        for (Integer valueToAdd : valuesToAdd) {
            utility.add(valueToAdd);
        }

        //When
        Integer actual = utility.mostCommon();

        //Then
        Assert.assertEquals(mostCommonValue, actual);
    }

}
