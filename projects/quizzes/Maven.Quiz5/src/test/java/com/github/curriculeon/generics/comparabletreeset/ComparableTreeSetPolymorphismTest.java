package com.github.curriculeon.generics.comparabletreeset;

import org.junit.Assert;
import org.junit.Test;
import com.github.curriculeon.generics.ComparableTreeSet;

import java.util.TreeSet;

/**
 * @author leon on 11/12/2018.
 */
public class ComparableTreeSetPolymorphismTest {
    @Test
    public void test1() {
        Assert.assertTrue((Object)new ComparableTreeSet() instanceof TreeSet);
    }

    @Test
    public void test2() {
        Assert.assertTrue(new ComparableTreeSet() instanceof Comparable);
    }
}
