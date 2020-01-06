package com.github.curriculeon.generics.sortedgroup.stringsortedgroup;

import org.junit.Assert;
import org.junit.Test;
import com.github.curriculeon.generics.SortedGroup;

/**
 * @author leon on 11/12/2018.
 */
@SuppressWarnings("all")
public class StringSortedGroupDeleteTest {
    @Test
    public void test1() {
        // given
        SortedGroup<String> group = new SortedGroup<>();
        String firstValue = "1";
        String secondValue = "2";
        String thirdValue = "3";
        String fourthValue = "4";

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
        SortedGroup<String> group = new SortedGroup<>();
        String firstValue = "1";
        String secondValue = "2";
        String thirdValue = "3";
        String fourthValue = "4";

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
        SortedGroup<String> group = new SortedGroup<>();
        String firstValue = "1";
        String secondValue = "2";
        String thirdValue = "3";
        String fourthValue = "4";

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
