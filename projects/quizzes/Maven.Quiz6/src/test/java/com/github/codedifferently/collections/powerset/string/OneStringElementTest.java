package com.github.codedifferently.collections.powerset.string;


import com.github.codedifferently.collections.powerset.PowerSetTestUtilities;
import org.junit.Test;

import java.util.Arrays;

@SuppressWarnings("all")
public class OneStringElementTest {
    @Test
    public void test1() {
        String[] input = {"0"};
        PowerSetTestUtilities.test(input,
                Arrays.asList(),
                Arrays.asList("0")
        );
    }

    @Test
    public void test2() {
        String[] input = {"a"};
        PowerSetTestUtilities.test(input,
                Arrays.asList(),
                Arrays.asList("a")
        );
    }


    @Test
    public void test3() {
        String[] input = {"b"};
        PowerSetTestUtilities.test(input,
                Arrays.asList(),
                Arrays.asList("b")
        );
    }


    @Test
    public void test4() {
        String[] input = {"c"};
        PowerSetTestUtilities.test(input,
                Arrays.asList(),
                Arrays.asList("c")
        );
    }

    @Test
    public void test5() {
        String[] input = {"d"};
        PowerSetTestUtilities.test(input,
                Arrays.asList(),
                Arrays.asList("d")
        );
    }
}