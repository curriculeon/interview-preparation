package com.github.codedifferently.collections.collectionutils;

import com.github.codedifferently.collections.CollectionUtils;
import org.junit.Assert;
import org.junit.Test;

import java.util.*;
import java.util.function.Supplier;

public class ToListTest {
    @Test
    public void test1() {
        test(TreeSet::new, 0,5,10,15);
    }

    @Test
    public void test2() {
        test(TreeSet::new, "0","10","15","5");
    }

    @Test
    public void test3() {
        test(TreeSet::new, 'a', 'b', 'c', 'd');
    }

    @Test
    public void test4() {
        test(Stack::new, 0,5,10,15);
    }

    @Test
    public void test5() {
        test(Stack::new, "0","5","10","15");
    }

    @Test
    public void test6() {
        test(Stack::new, 'a', 'b', 'c', 'd');
    }



    private <E> void test(Supplier<? extends Collection<E>> collectionSupplier, E... items) {
        // given
        Collection<E> collection = collectionSupplier.get();
        List<E> expected = Arrays.asList(items);
        collection.addAll(expected);

        // when
        List<E> actual = CollectionUtils.toList(collection);

        // then
        Assert.assertEquals(expected, actual);
    }
}
