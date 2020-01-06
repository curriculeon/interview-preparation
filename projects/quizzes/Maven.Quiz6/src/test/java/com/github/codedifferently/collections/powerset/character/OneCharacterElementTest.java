package com.github.codedifferently.collections.powerset.character;


import org.junit.Test;
import com.github.codedifferently.collections.powerset.PowerSetTestUtilities;

import java.util.Arrays;

@SuppressWarnings("all")
public class OneCharacterElementTest {
    @Test
    public void test1() {
        Character[] input = {'0'};
        PowerSetTestUtilities.test(input,
                Arrays.asList(),
                Arrays.asList('0')
        );
    }

    @Test
    public void test2() {
        Character[] input = {'a'};
        PowerSetTestUtilities.test(input,
                Arrays.asList(),
                Arrays.asList('a')
        );
    }


    @Test
    public void test3() {
        Character[] input = {'b'};
        PowerSetTestUtilities.test(input,
                Arrays.asList(),
                Arrays.asList('b')
        );
    }


    @Test
    public void test4() {
        Character[] input = {'c'};
        PowerSetTestUtilities.test(input,
                Arrays.asList(),
                Arrays.asList('c')
        );
    }

    @Test
    public void test5() {
        Character[] input = {'d'};
        PowerSetTestUtilities.test(input,
                Arrays.asList(),
                Arrays.asList('d')
        );
    }
}