package com.github.curriculeon.generics.group;

import com.github.curriculeon.generics.Group;
import com.github.curriculeon.generics.GroupInterface;
import org.junit.Assert;
import org.junit.Test;

import java.util.Collection;

/**
 * @author leon on 11/12/2018.
 */
public class GroupPolymorphismTest {
    @Test
    public void test1() {
        Assert.assertTrue(new Group() instanceof Iterable);
    }

    @Test
    public void test3() {
        Assert.assertTrue(new Group() instanceof GroupInterface);
    }

    @Test
    public void test2() {
        Assert.assertFalse(new Group() instanceof Collection);
    }
}
