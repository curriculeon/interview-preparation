package com.github.codedifferently.collections.powerset.integer;


import com.github.codedifferently.collections.powerset.PowerSetTestUtilities;
import org.junit.Test;

import java.util.Arrays;
@SuppressWarnings("all")
public class IntegerPowerSetTest {
    @Test
    public void test1() {
        Integer[] input = {0};
        PowerSetTestUtilities.test(input,
                Arrays.asList(),
                Arrays.asList(0)
        );
    }

    @Test
    public void test2() {
        Integer[] input = {0, 1};
        PowerSetTestUtilities.test(input,
                Arrays.asList(),
                Arrays.asList(0),
                Arrays.asList(0, 1),
                Arrays.asList(1)
        );
    }

    @Test
    public void test3() {
        Integer[] input = {0, 0, 1};
        PowerSetTestUtilities.test(input,
                Arrays.asList(),
                Arrays.asList(0),
                Arrays.asList(0, 1),
                Arrays.asList(1)
        );
    }


    @Test
    public void test4() {
        Integer[] input = {0, 1, 2};
        PowerSetTestUtilities.test(input,
                Arrays.asList(),
                Arrays.asList(0),
                Arrays.asList(0, 1),
                Arrays.asList(0, 1, 2),
                Arrays.asList(0, 2),
                Arrays.asList(1),
                Arrays.asList(1, 0),
                Arrays.asList(1, 2),
                Arrays.asList(2)
        );
    }

    @Test
    public void test5() {
        Integer[] input = {0, 1, 2, 3};
        PowerSetTestUtilities.test(input,
                Arrays.asList(),
                Arrays.asList(0),
                Arrays.asList(0, 1),
                Arrays.asList(0, 1, 2),
                Arrays.asList(0, 1, 2, 3),
                Arrays.asList(0, 1, 3),
                Arrays.asList(0, 2),
                Arrays.asList(0, 2, 3),
                Arrays.asList(0, 3),
                Arrays.asList(1),
                Arrays.asList(1, 0),
                Arrays.asList(1, 2),
                Arrays.asList(1, 2, 3),
                Arrays.asList(1, 3),
                Arrays.asList(2),
                Arrays.asList(2, 3)
        );
    }
}

