package com.github.codedifferently.generics;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ToArrayTest {
    @Test
    public void test1() {
        String[] array = {"The", "Quick", "Brown", "Fox"};
        test(Arrays.asList(array), array);
    }

    @Test
    public void test2() {
        Integer[] array = {0, 5, 15, 20, 25};
        test(Arrays.asList(array), array);
    }

    @Test
    public void test3() {
        Character[] array = {'T', 'Q', 'B', 'F'};
        test(Arrays.asList(array), array);
    }

    @Test
    public void test4() {
        Boolean[] array = {true, true, false, false, true, false, true, false};
        test(Arrays.asList(array), array);
    }

    private <E> void test(Collection<E> collection, E[] expected) {
        E[] collectionToArray = GenericUtils.toArray(collection);
        List<E> arrayAsList = Arrays.asList(collectionToArray);
        List<E> expectedAsList = Arrays.asList(expected);

        Assert.assertEquals(expectedAsList, arrayAsList);
    }
}
