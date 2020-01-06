package com.github.curriculeon.generics.sortedgroup;

import org.junit.Assert;
import org.junit.Test;
import com.github.curriculeon.generics.GroupInterface;
import com.github.curriculeon.generics.SortedGroup;

/**
 * @author leon on 18/12/2018.
 */
public class SortedGroupPolymorphismTest {
    @Test
    public void test1() {
        Assert.assertTrue(new SortedGroup() instanceof GroupInterface);
    }
}
