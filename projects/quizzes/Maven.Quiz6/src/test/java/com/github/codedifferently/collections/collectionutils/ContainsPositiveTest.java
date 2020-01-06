package com.github.codedifferently.collections.collectionutils;

import com.github.codedifferently.collections.CollectionUtils;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collection;

public class ContainsPositiveTest {
    // given
    private Collection<?> collection1 = Arrays.asList(0, 1, 2, 3);
    private Collection<?> collection2 = Arrays.asList(5, 10, 15, 20);
    private Collection<?> collection3 = Arrays.asList(10, 20, 30, 40);
    private Collection<?> collection4 = Arrays.asList(15, 30, 45, 60);
    private Collection<? extends Collection<?>> nestedCollection = Arrays.asList(
            collection1,collection2, collection3, collection4);

    @Test
    public void test1() {
        // when
        Boolean outcome = CollectionUtils.contains(nestedCollection, collection1);

        // then
        Assert.assertTrue(outcome);
    }

    @Test
    public void test2() {
        // when
        Boolean outcome = CollectionUtils.contains(nestedCollection, collection2);

        // then
        Assert.assertTrue(outcome);
    }

    @Test
    public void test3() {
        // when
        Boolean outcome = CollectionUtils.contains(nestedCollection, collection3);

        // then
        Assert.assertTrue(outcome);
    }

    @Test
    public void test4() {
        // when
        Boolean outcome = CollectionUtils.contains(nestedCollection, collection4);

        // then
        Assert.assertTrue(outcome);
    }
}
