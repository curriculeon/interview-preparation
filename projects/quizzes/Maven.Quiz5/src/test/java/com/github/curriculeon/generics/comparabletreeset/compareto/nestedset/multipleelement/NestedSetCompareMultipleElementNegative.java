package com.github.curriculeon.generics.comparabletreeset.compareto.nestedset.multipleelement;

import org.junit.Assert;
import org.junit.Test;
import com.github.curriculeon.generics.ComparableTreeSet;

/**
 * @author leon on 11/12/2018.
 */
public class NestedSetCompareMultipleElementNegative {
    @Test
    public void test1() {
        // given
        ComparableTreeSet<String> set1 = new ComparableTreeSet<>("Arty", "Fee", "Shawl");
        ComparableTreeSet<String> set2 = new ComparableTreeSet<>("Burt", "Bot");
        ComparableTreeSet<ComparableTreeSet<String>> powerset1 = new ComparableTreeSet<>(set1, set2);

        ComparableTreeSet<String> set3 = new ComparableTreeSet<>("Candy", "Cane");
        ComparableTreeSet<String> set4 = new ComparableTreeSet<>("Corny", "Carl");
        ComparableTreeSet<ComparableTreeSet<String>> powerset2 = new ComparableTreeSet<>(set3, set4);

        // when
        Integer actual = powerset1.compareTo(powerset2);

        // then
        Assert.assertTrue(actual < 0);
    }


    @Test
    public void test2() {
        // given
        ComparableTreeSet<String> set1 = new ComparableTreeSet<>("Froilan", "Miranda");
        ComparableTreeSet<String> set2 = new ComparableTreeSet<>("Wilhem", "Alcivar");
        ComparableTreeSet<ComparableTreeSet<String>> powerset1 = new ComparableTreeSet<>(set1, set2);

        ComparableTreeSet<String> set3 = new ComparableTreeSet<>("Leon", "Hunter");
        ComparableTreeSet<String> set4 = new ComparableTreeSet<>("Nhu", "Nguyen");
        ComparableTreeSet<ComparableTreeSet<String>> powerset2 = new ComparableTreeSet<>(set3, set4);

        // when
        Integer actual = powerset1.compareTo(powerset2);

        // then
        Assert.assertTrue(actual < 0);
    }
}
