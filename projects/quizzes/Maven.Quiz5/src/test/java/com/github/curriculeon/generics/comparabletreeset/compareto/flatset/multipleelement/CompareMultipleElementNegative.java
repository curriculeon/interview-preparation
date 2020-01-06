package com.github.curriculeon.generics.comparabletreeset.compareto.flatset.multipleelement;

import org.junit.Assert;
import org.junit.Test;
import com.github.curriculeon.generics.ComparableTreeSet;

/**
 * @author leon on 11/12/2018.
 */
public class CompareMultipleElementNegative {

    @Test
    public void test1() {
        // given
        ComparableTreeSet<String> set1 = new ComparableTreeSet<>("Arty", "Fee", "Shawl");
        ComparableTreeSet<String> set2 = new ComparableTreeSet<>("Burt", "Bot", "Boi");

        // when
        Integer actual = set1.compareTo(set2);

        // then
        Assert.assertTrue(actual < 0);
    }


    @Test
    public void test2() {
        // given
        ComparableTreeSet<String> set1 = new ComparableTreeSet<>("Candy", "Cane");
        ComparableTreeSet<String> set2 = new ComparableTreeSet<>("Corny", "Carl");

        // when
        Integer actual = set1.compareTo(set2);

        // then
        Assert.assertTrue(actual < 0);
    }
}
