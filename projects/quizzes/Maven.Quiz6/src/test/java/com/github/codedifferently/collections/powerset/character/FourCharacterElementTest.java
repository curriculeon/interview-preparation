package com.github.codedifferently.collections.powerset.character;

import org.junit.Test;
import com.github.codedifferently.collections.powerset.PowerSetTestUtilities;

import java.util.Arrays;

public class FourCharacterElementTest {
    @Test
    public void test5() {
        Character[] input = {'0', '1', '2', '3'};
        PowerSetTestUtilities.test(input,
                Arrays.asList(),
                Arrays.asList('0'),
                Arrays.asList('0', '1'),
                Arrays.asList('0', '1', '2'),
                Arrays.asList('0', '1', '2', '3'),
                Arrays.asList('0', '1', '3'),
                Arrays.asList('0', '2'),
                Arrays.asList('0', '2', '3'),
                Arrays.asList('0', '3'),
                Arrays.asList('1'),
                Arrays.asList('1', '0'),
                Arrays.asList('1', '2'),
                Arrays.asList('1', '2', '3'),
                Arrays.asList('1', '3'),
                Arrays.asList('2'),
                Arrays.asList('2', '3')
        );
    }
}
