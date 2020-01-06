package com.github.codedifferently.collections.powerset.string;

import com.github.codedifferently.collections.powerset.PowerSetTestUtilities;
import org.junit.Test;

import java.util.Arrays;

public class ThreeStringElementTest {

    @Test
    public void test1() {
        String[] input = {"0", "1", "2"};
        PowerSetTestUtilities.test(input,
                Arrays.asList(),
                Arrays.asList("0"),
                Arrays.asList("0", "1"),
                Arrays.asList("0", "1", "2"),
                Arrays.asList("0", "2"),
                Arrays.asList("1"),
                Arrays.asList("1", "0"),
                Arrays.asList("1", "2"),
                Arrays.asList("2")
        );
    }


    @Test
    public void test2() {
        String[] input = {"a", "b", "c"};
        PowerSetTestUtilities.test(input,
                Arrays.asList(),
                Arrays.asList("a"),
                Arrays.asList("a", "b"),
                Arrays.asList("a", "b", "c"),
                Arrays.asList("a", "c"),
                Arrays.asList("b"),
                Arrays.asList("b", "a"),
                Arrays.asList("b", "c"),
                Arrays.asList("c")
        );
    }


    @Test
    public void test3() {
        String[] input = {"x", "y", "z"};
        PowerSetTestUtilities.test(input,
                Arrays.asList(),
                Arrays.asList("x"),
                Arrays.asList("x", "y"),
                Arrays.asList("x", "y", "z"),
                Arrays.asList("x", "z"),
                Arrays.asList("y"),
                Arrays.asList("y", "x"),
                Arrays.asList("y", "z"),
                Arrays.asList("z")
        );
    }

}
