package com.github.curriculeon.generics.comparabletreeset.compareto.nestedset.multipleelement;

import org.junit.Assert;
import org.junit.Test;
import com.github.curriculeon.generics.ComparableTreeSet;

/**
 * @author leon on 11/12/2018.
 */
public class NestedSetCompareMultipleElementPositive {
    @Test
    public void test1() {
        // given
        ComparableTreeSet<String> set3 = new ComparableTreeSet<>("Froilan", "Miranda");
        ComparableTreeSet<String> set4 = new ComparableTreeSet<>("Nhu", "Nguyen");
        ComparableTreeSet<ComparableTreeSet<String>> powerset1 = new ComparableTreeSet<>(set3, set4);

        ComparableTreeSet<String> set1 = new ComparableTreeSet<>("Wilhem", "Alcivar");
        ComparableTreeSet<String> set2 = new ComparableTreeSet<>("Leon", "Hunter");
        ComparableTreeSet<ComparableTreeSet<String>> powerset2 = new ComparableTreeSet<>(set1, set2);

        // when
        Integer actual = powerset1.compareTo(powerset2);

        // then
        Assert.assertTrue(actual > 0);
    }


    @Test
    public void test2() {
        // given
        ComparableTreeSet<String> set3 = new ComparableTreeSet<>("Kris", "Younger");
        ComparableTreeSet<String> set4 = new ComparableTreeSet<>("Leon", "Hunter");
        ComparableTreeSet<ComparableTreeSet<String>> powerset1 = new ComparableTreeSet<>(set3, set4);

        ComparableTreeSet<String> set1 = new ComparableTreeSet<>("Nhu", "Nguyen");
        ComparableTreeSet<String> set2 = new ComparableTreeSet<>("Wilhem", "Alcivar");
        ComparableTreeSet<ComparableTreeSet<String>> powerset2 = new ComparableTreeSet<>(set1, set2);

        // when
        Integer actual = powerset1.compareTo(powerset2);

        // then
        Assert.assertTrue(actual > 0);
    }
}
