package com.github.codedifferently.collections.collectionutils;

import com.github.codedifferently.collections.CollectionUtils;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collection;

public class FlattenTest {
    @Test
    public void test1() {
        // given
        Collection<?> collection1 = Arrays.asList(0, 1, 2, 3);
        Collection<?> collection2 = Arrays.asList(5, 10, 15, 20);
        Collection<?> collection3 = Arrays.asList(10, 20, 30, 40);
        Collection<?> collection4 = Arrays.asList(15, 30, 45, 60);
        Collection<?> expected = Arrays.asList(0, 1, 2, 3, 5, 10, 15, 20, 10, 20, 30, 40, 15, 30, 45, 60);

        // when
        Collection<?> actual = CollectionUtils.flatten(collection1, collection2, collection3, collection4);

        // then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void test2() {
        // given
        Collection<?> collection1 = Arrays.asList("0", "1", "2", "3");
        Collection<?> collection2 = Arrays.asList("5", "10", "15", "20");
        Collection<?> collection3 = Arrays.asList("10", "20", "30", "40");
        Collection<?> collection4 = Arrays.asList("15", "30", "45", "60");
        Collection<?> expected = Arrays.asList("0", "1", "2", "3", "5", "10", "15", "20", "10", "20", "30", "40", "15", "30", "45", "60");

        // when
        Collection<?> actual = CollectionUtils.flatten(collection1, collection2, collection3, collection4);

        // then
        Assert.assertEquals(expected, actual);
    }

}
