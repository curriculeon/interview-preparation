package com.github.codedifferently.collections.powerset.string;

import org.junit.Test;
import com.github.codedifferently.collections.powerset.PowerSetTestUtilities;

import java.util.Arrays;

@SuppressWarnings("all")
public class TwoStringElementTest {
    @Test
    public void test1() {
        String[] input = {"0", "1"};
        PowerSetTestUtilities.test(input,
                Arrays.asList(),
                Arrays.asList("0"),
                Arrays.asList("0", "1"),
                Arrays.asList("1")
        );
    }

    @Test
    public void test2() {
        String[] input = {"a", "b"};
        PowerSetTestUtilities.test(input,
                Arrays.asList(),
                Arrays.asList("a"),
                Arrays.asList("a", "b"),
                Arrays.asList("b")
        );
    }

    @Test
    public void test3() {
        String[] input = {"x", "y"};
        PowerSetTestUtilities.test(input,
                Arrays.asList(),
                Arrays.asList("x"),
                Arrays.asList("x", "y"),
                Arrays.asList("y")
        );
    }


    @Test
    public void test4() {
        String[] input = {"0", "0", "1"};
        PowerSetTestUtilities.test(input,
                Arrays.asList(),
                Arrays.asList("0"),
                Arrays.asList("0", "1"),
                Arrays.asList("1")
        );
    }




    @Test
    public void test5() {
        String[] input = {"a", "a", "b"};
        PowerSetTestUtilities.test(input,
                Arrays.asList(),
                Arrays.asList("a"),
                Arrays.asList("a", "b"),
                Arrays.asList("b")
        );
    }



    @Test
    public void test6() {
        String[] input = {"x", "x", "y"};
        PowerSetTestUtilities.test(input,
                Arrays.asList(),
                Arrays.asList("x"),
                Arrays.asList("x", "y"),
                Arrays.asList("y")
        );
    }


}
