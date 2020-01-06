package com.github.curriculeon.generics.sortedgroup.integersortedgroup;

import org.junit.Assert;
import org.junit.Test;
import com.github.curriculeon.generics.SortedGroup;

/**
 * @author leon on 11/12/2018.
 */
@SuppressWarnings("all")
public class IntegerSortedGroupDeleteTest {
    @Test
    public void test1() {
        // given
        SortedGroup<Integer> group = new SortedGroup<>();
        Integer firstValue = 1;
        Integer secondValue = 2;
        Integer thirdValue = 3;
        Integer fourthValue = 4;

        group.insert(fourthValue);
        group.insert(firstValue);
        group.insert(thirdValue);
        group.insert(secondValue);

        // when
        group.delete(firstValue);

        int secondValueIndex = group.indexOf(secondValue);
        int thirdValueIndex = group.indexOf(thirdValue);
        int fourthValueIndex = group.indexOf(fourthValue);

        // then
        Assert.assertEquals(secondValueIndex, 0);
        Assert.assertEquals(thirdValueIndex, 1);
        Assert.assertEquals(fourthValueIndex, 2);
    }

    @Test
    public void test2() {
        // given
        SortedGroup<Integer> group = new SortedGroup<>();
        Integer firstValue = 1;
        Integer secondValue = 2;
        Integer thirdValue = 3;
        Integer fourthValue = 4;

        group.insert(fourthValue);
        group.insert(firstValue);
        group.insert(thirdValue);
        group.insert(secondValue);

        // when
        group.delete(secondValue);

        int firstValueIndex = group.indexOf(firstValue);
        int thirdValueIndex = group.indexOf(thirdValue);
        int fourthValueIndex = group.indexOf(fourthValue);

        // then
        Assert.assertEquals(firstValueIndex, 0);
        Assert.assertEquals(thirdValueIndex, 1);
        Assert.assertEquals(fourthValueIndex, 2);
    }

    @Test
    public void test3() {
        // given
        SortedGroup<Integer> group = new SortedGroup<>();
        Integer firstValue = 1;
        Integer secondValue = 2;
        Integer thirdValue = 3;
        Integer fourthValue = 4;

        group.insert(fourthValue);
        group.insert(firstValue);
        group.insert(thirdValue);
        group.insert(secondValue);

        // when
        group.delete(thirdValue);

        int firstValueIndex = group.indexOf(firstValue);
        int secondValueIndex = group.indexOf(secondValue);
        int fourthValueIndex = group.indexOf(fourthValue);

        // then
        Assert.assertEquals(firstValueIndex, 0);
        Assert.assertEquals(secondValueIndex, 1);
        Assert.assertEquals(fourthValueIndex, 2);
    }
}
