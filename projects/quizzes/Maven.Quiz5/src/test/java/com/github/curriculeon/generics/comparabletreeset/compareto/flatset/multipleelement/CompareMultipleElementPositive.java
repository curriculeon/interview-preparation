package com.github.curriculeon.generics.comparabletreeset.compareto.flatset.multipleelement;

import org.junit.Assert;
import org.junit.Test;
import com.github.curriculeon.generics.ComparableTreeSet;

/**
 * @author leon on 11/12/2018.
 */
public class CompareMultipleElementPositive {

    @Test
    public void test1() {
        // given
        ComparableTreeSet<String> set1 = new ComparableTreeSet<>("Burt", "Belly", "Bot");
        ComparableTreeSet<String> set2 = new ComparableTreeSet<>("Arty", "Fee", "Shawl");

        // when
        Integer actual = set1.compareTo(set2);

        // then
        Assert.assertTrue(actual > 0);
    }


    @Test
    public void test2() {
        // given
        ComparableTreeSet<String> set1 = new ComparableTreeSet<>("Corny", "Carl", "Cart");
        ComparableTreeSet<String> set2 = new ComparableTreeSet<>("Candy", "Cane", "Corks");

        // when
        Integer actual = set1.compareTo(set2);

        // then
        Assert.assertTrue(actual > 0);
    }


    @Test
    public void test3() {
        // given
        ComparableTreeSet<String> set1 = new ComparableTreeSet<>("Corny", "Carl", "Cart");
        ComparableTreeSet<String> set2 = new ComparableTreeSet<>("", "a", "z");

        // when
        Integer actual = set1.compareTo(set2);

        // then
        Assert.assertTrue(actual > 0);
    }
}
