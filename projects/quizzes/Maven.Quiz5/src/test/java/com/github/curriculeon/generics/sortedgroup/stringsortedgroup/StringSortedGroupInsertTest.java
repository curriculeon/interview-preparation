package com.github.curriculeon.generics.sortedgroup.stringsortedgroup;

import org.junit.Assert;
import org.junit.Test;
import com.github.curriculeon.generics.SortedGroup;

/**
 * @author leon on 11/12/2018.
 */
public class StringSortedGroupInsertTest {

    @Test
    public void test1() {
        // given
        SortedGroup<String> group = new SortedGroup<>();
        String firstValue = "A";
        String secondValue = "B";
        String thirdValue = "C";
        String fourthValue = "D";

        // when
        group.insert(fourthValue);
        group.insert(firstValue);
        group.insert(thirdValue);
        group.insert(secondValue);

        int indexOfFirstValue = group.indexOf(firstValue);
        int indexOfSecondValue = group.indexOf(secondValue);
        int indexOfThirdValue = group.indexOf(thirdValue);
        int indexOfFourthValue = group.indexOf(fourthValue);
        System.out.println(group);
        // then
        Assert.assertEquals(indexOfFirstValue, 0);
        Assert.assertEquals(indexOfSecondValue, 1);
        Assert.assertEquals(indexOfThirdValue, 2);
        Assert.assertEquals(indexOfFourthValue, 3);
    }
    @Test
    public void test2() {
        // given
        SortedGroup<String> group = new SortedGroup<>();
        String firstValue = "a";
        String secondValue = "b";
        String thirdValue = "c";
        String fourthValue = "d";

        // when
        group.insert(fourthValue);
        group.insert(firstValue);
        group.insert(thirdValue);
        group.insert(secondValue);

        int indexOfFirstValue = group.indexOf(firstValue);
        int indexOfSecondValue = group.indexOf(secondValue);
        int indexOfThirdValue = group.indexOf(thirdValue);
        int indexOfFourthValue = group.indexOf(fourthValue);
        System.out.println(group);
        // then
        Assert.assertEquals(indexOfFirstValue, 0);
        Assert.assertEquals(indexOfSecondValue, 1);
        Assert.assertEquals(indexOfThirdValue, 2);
        Assert.assertEquals(indexOfFourthValue, 3);
    }

    @Test
    public void test3() {
        // given
        SortedGroup<String> group = new SortedGroup<>();
        String firstValue = "A";
        String secondValue = "B";
        String thirdValue = "a";
        String fourthValue = "b";

        // when
        group.insert(fourthValue);
        group.insert(firstValue);
        group.insert(thirdValue);
        group.insert(secondValue);

        int indexOfFirstValue = group.indexOf(firstValue);
        int indexOfSecondValue = group.indexOf(secondValue);
        int indexOfThirdValue = group.indexOf(thirdValue);
        int indexOfFourthValue = group.indexOf(fourthValue);
        System.out.println(group);
        // then
        Assert.assertEquals(indexOfFirstValue, 0);
        Assert.assertEquals(indexOfSecondValue, 1);
        Assert.assertEquals(indexOfThirdValue, 2);
        Assert.assertEquals(indexOfFourthValue, 3);
    }


    @Test
    public void test4() {
        // given
        SortedGroup<String> group = new SortedGroup<>();
        String firstValue = "Astro";
        String secondValue = "Bicycle";
        String thirdValue = "Carnations";
        String fourthValue = "Dinosaur";

        // when
        group.insert(fourthValue);
        group.insert(firstValue);
        group.insert(thirdValue);
        group.insert(secondValue);

        int indexOfFirstValue = group.indexOf(firstValue);
        int indexOfSecondValue = group.indexOf(secondValue);
        int indexOfThirdValue = group.indexOf(thirdValue);
        int indexOfFourthValue = group.indexOf(fourthValue);
        System.out.println(group);
        // then
        Assert.assertEquals(indexOfFirstValue, 0);
        Assert.assertEquals(indexOfSecondValue, 1);
        Assert.assertEquals(indexOfThirdValue, 2);
        Assert.assertEquals(indexOfFourthValue, 3);
    }

    @Test
    public void test6() {
        // given
        SortedGroup<String> group = new SortedGroup<>();
        String firstValue = "Astro";
        String secondValue = "Carnations";
        String thirdValue = "bicycle";
        String fourthValue = "dinosaur";

        // when
        group.insert(fourthValue);
        group.insert(firstValue);
        group.insert(thirdValue);
        group.insert(secondValue);

        int indexOfFirstValue = group.indexOf(firstValue);
        int indexOfSecondValue = group.indexOf(secondValue);
        int indexOfThirdValue = group.indexOf(thirdValue);
        int indexOfFourthValue = group.indexOf(fourthValue);
        System.out.println(group);
        // then
        Assert.assertEquals(indexOfFirstValue, 0);
        Assert.assertEquals(indexOfSecondValue, 1);
        Assert.assertEquals(indexOfThirdValue, 2);
        Assert.assertEquals(indexOfFourthValue, 3);
    }


    @Test
    public void test7() {
        // given
        SortedGroup<String> group = new SortedGroup<>();
        String firstValue = "1";
        String secondValue = "2";
        String thirdValue = "3";
        String fourthValue = "4";

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
    public void test8() {
        // given
        SortedGroup<String> group = new SortedGroup<>();
        String firstValue = "102";
        String secondValue = "362";
        String thirdValue = "98";
        String fourthValue = "999";

        // when
        group.insert(fourthValue);
        group.insert(firstValue);
        group.insert(thirdValue);
        group.insert(secondValue);

        int indexOfFirstValue = group.indexOf(firstValue);
        int indexOfSecondValue = group.indexOf(secondValue);
        int indexOfThirdValue = group.indexOf(thirdValue);
        int indexOfFourthValue = group.indexOf(fourthValue);
        System.out.println(group);
        // then
        Assert.assertEquals(indexOfFirstValue, 0);
        Assert.assertEquals(indexOfSecondValue, 1);
        Assert.assertEquals(indexOfThirdValue, 2);
        Assert.assertEquals(indexOfFourthValue, 3);
    }


    @Test
    public void test9() {
        // given
        SortedGroup<String> group = new SortedGroup<>();
        String firstValue = String.valueOf(Integer.MIN_VALUE + 2);
        String secondValue = String.valueOf(Integer.MIN_VALUE + 1);
        String thirdValue = String.valueOf(Integer.MIN_VALUE);
        String fourthValue = String.valueOf(Integer.MAX_VALUE);

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
