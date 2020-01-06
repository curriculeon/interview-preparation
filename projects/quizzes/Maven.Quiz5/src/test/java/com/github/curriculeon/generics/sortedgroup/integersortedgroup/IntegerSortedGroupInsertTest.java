package com.github.curriculeon.generics.sortedgroup.integersortedgroup;

import org.junit.Assert;
import org.junit.Test;
import com.github.curriculeon.generics.SortedGroup;

/**
 * @author leon on 11/12/2018.
 */
public class IntegerSortedGroupInsertTest {
    @Test
    public void test1() {
        // given
        SortedGroup<Integer> group = new SortedGroup<>();
        Integer firstValue = 1;
        Integer secondValue = 2;
        Integer thirdValue = 3;
        Integer fourthValue = 4;

        // when
        group.insert(fourthValue);
        group.insert(firstValue);
        group.insert(thirdValue);
        group.insert(secondValue);

        int firstValueIndex = group.indexOf(firstValue);
        int secondValueIndex = group.indexOf(secondValue);
        int thirdValueIndex = group.indexOf(thirdValue);
        int fourthValueIndex = group.indexOf(fourthValue);

        // then
        Assert.assertEquals(firstValueIndex, 0);
        Assert.assertEquals(secondValueIndex, 1);
        Assert.assertEquals(thirdValueIndex, 2);
        Assert.assertEquals(fourthValueIndex, 3);
    }

    @Test
    public void test2() {
        // given
        SortedGroup<Integer> group = new SortedGroup<>();
        Integer firstValue = 98;
        Integer secondValue = 102;
        Integer thirdValue = 362;
        Integer fourthValue = 999;

        // when
        group.insert(fourthValue);
        group.insert(firstValue);
        group.insert(thirdValue);
        group.insert(secondValue);

        int firstValueIndex = group.indexOf(firstValue);
        int secondValueIndex = group.indexOf(secondValue);
        int thirdValueIndex = group.indexOf(thirdValue);
        int fourthValueIndex = group.indexOf(fourthValue);

        // then
        Assert.assertEquals(firstValueIndex, 0);
        Assert.assertEquals(secondValueIndex, 1);
        Assert.assertEquals(thirdValueIndex, 2);
        Assert.assertEquals(fourthValueIndex, 3);
    }


    @Test
    public void test3() {
        // given
        SortedGroup<Integer> group = new SortedGroup<>();
        Integer firstValue = Integer.MIN_VALUE;
        Integer secondValue = firstValue + 1;
        Integer thirdValue = secondValue + 1;
        Integer fourthValue = Integer.MAX_VALUE;

        // when
        group.insert(fourthValue);
        group.insert(firstValue);
        group.insert(thirdValue);
        group.insert(secondValue);

        int firstValueIndex = group.indexOf(firstValue);
        int secondValueIndex = group.indexOf(secondValue);
        int thirdValueIndex = group.indexOf(thirdValue);
        int fourthValueIndex = group.indexOf(fourthValue);

        // then
        Assert.assertEquals(firstValueIndex, 0);
        Assert.assertEquals(secondValueIndex, 1);
        Assert.assertEquals(thirdValueIndex, 2);
        Assert.assertEquals(fourthValueIndex, 3);
    }
}
