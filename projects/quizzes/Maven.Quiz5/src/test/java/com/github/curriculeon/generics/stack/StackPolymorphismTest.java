package com.github.curriculeon.generics.stack;

import org.junit.Assert;
import org.junit.Test;
import com.github.curriculeon.generics.MyStack;

import java.util.Collection;

/**
 * @author leon on 11/12/2018.
 */
public class StackPolymorphismTest {
    @Test
    public void ensureStackIsIterable() {
        Assert.assertTrue(new MyStack<>() instanceof Iterable);
    }

    @Test
    public void ensureStackIsNotCollection() {
        Assert.assertFalse(new MyStack<>() instanceof Collection);
    }
}
