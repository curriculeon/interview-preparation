package com.github.codedifferently.collections.collectionutils;

import com.github.codedifferently.collections.CollectionUtils;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collection;

public class ContainsNegativeTest {
    @Test
    public void test1() {
        // given
        Collection<?> collection1 = Arrays.asList(0, 1, 2, 3);
        Collection<?> collection2 = Arrays.asList(5, 10, 15, 20);
        Collection<?> collection3 = Arrays.asList(10, 20, 30, 40);
        Collection<?> collection4 = Arrays.asList(15, 30, 45, 60);
        Collection<? extends Collection<?>> nestedCollection = Arrays.asList(
                collection2, collection3, collection4);

        // when
        Boolean outcome = CollectionUtils.contains(nestedCollection, collection1);

        // then
        Assert.assertFalse(outcome);
    }

    @Test
    public void test2() {
        // given
        Collection<?> collection1 = Arrays.asList(0, 1, 2, 3);
        Collection<?> collection2 = Arrays.asList(5, 10, 15, 20);
        Collection<?> collection3 = Arrays.asList(10, 20, 30, 40);
        Collection<?> collection4 = Arrays.asList(15, 30, 45, 60);
        Collection<? extends Collection<?>> nestedCollection = Arrays.asList(
                collection1, collection3, collection4);

        // when
        Boolean outcome = CollectionUtils.contains(nestedCollection, collection2);

        // then
        Assert.assertFalse(outcome);
    }

    @Test
    public void test3() {
        // given
        Collection<?> collection1 = Arrays.asList(0, 1, 2, 3);
        Collection<?> collection2 = Arrays.asList(5, 10, 15, 20);
        Collection<?> collection3 = Arrays.asList(10, 20, 30, 40);
        Collection<?> collection4 = Arrays.asList(15, 30, 45, 60);
        Collection<? extends Collection<?>> nestedCollection = Arrays.asList(
                collection1, collection2, collection4);

        // when
        Boolean outcome = CollectionUtils.contains(nestedCollection, collection3);

        // then
        Assert.assertFalse(outcome);
    }

    @Test
    public void test4() {
        // given
        Collection<?> collection1 = Arrays.asList(0, 1, 2, 3);
        Collection<?> collection2 = Arrays.asList(5, 10, 15, 20);
        Collection<?> collection3 = Arrays.asList(10, 20, 30, 40);
        Collection<?> collection4 = Arrays.asList(15, 30, 45, 60);
        Collection<? extends Collection<?>> nestedCollection = Arrays.asList(
                collection1, collection2, collection3);

        // when
        Boolean outcome = CollectionUtils.contains(nestedCollection, collection4);

        // then
        Assert.assertFalse(outcome);
    }
}

