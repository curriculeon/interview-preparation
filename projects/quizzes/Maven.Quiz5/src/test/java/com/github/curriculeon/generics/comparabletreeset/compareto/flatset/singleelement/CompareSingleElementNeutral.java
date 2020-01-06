package com.github.curriculeon.generics.comparabletreeset.compareto.flatset.singleelement;

import org.junit.Assert;
import org.junit.Test;
import com.github.curriculeon.generics.ComparableTreeSet;

/**
 * @author leon on 11/12/2018.
 */
public class CompareSingleElementNeutral {
    @Test
    public void test1() {
        // given
        ComparableTreeSet<String> set1 = new ComparableTreeSet<>("a");
        ComparableTreeSet<String> set2 = new ComparableTreeSet<>("a");
        Integer expected = 0;
        // when
        Integer actual = set1.compareTo(set2);

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        // given
        ComparableTreeSet<String> set1 = new ComparableTreeSet<>("b");
        ComparableTreeSet<String> set2 = new ComparableTreeSet<>("b");
        Integer expected = 0;
        // when
        Integer actual = set1.compareTo(set2);

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        // given
        ComparableTreeSet<String> set1 = new ComparableTreeSet<>("c");
        ComparableTreeSet<String> set2 = new ComparableTreeSet<>("c");
        Integer expected = 0;
        // when
        Integer actual = set1.compareTo(set2);

        // then
        Assert.assertEquals(expected, actual);
    }
}
