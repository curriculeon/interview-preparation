package com.github.curriculeon.part2.listutility;

import com.github.curriculeon.part2.ListUtility;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class GetUniqueTest {

    @Test
    public void test1() {
        Integer[] valuesToAdd = {1, 1, 2, 3};
        Integer[] uniqueValues = {1, 2, 3};
        test(valuesToAdd, uniqueValues);
    }

    @Test
    public void test2() {
        Integer[] valuesToAdd = {1, 2, 3};
        Integer[] uniqueValues = {1, 2, 3};
        test(valuesToAdd, uniqueValues);
    }

    @Test
    public void test3() {
        Integer[] valuesToAdd = {1, 1, 2, 3, 4, 4, 6};
        Integer[] uniqueValues = {1, 2, 3, 4, 6};
        test(valuesToAdd, uniqueValues);
    }


    private void test(Integer[] valuesToAdd, Integer[] uniqueValues) {
        // given
        ListUtility utility = new ListUtility();
        List<Integer> expectedList = Arrays.asList(uniqueValues);
        for (Integer valueToAdd : valuesToAdd) {
            utility.add(valueToAdd);
        }

        // when
        List<Integer> actualList = utility.getUnique();

        // then
        assertEquals(expectedList, actualList);
    }


    private static void assertEquals(List<Integer> expected, List<Integer> actual) {
        if (expected.size() != actual.size()) {
            Assert.fail();
        }

        for(int i = 0; i < expected.size(); i++) {
            Integer expectedI = expected.get(i);
            Integer actualI = actual.get(i);

            Assert.assertEquals(expectedI, actualI);
        }
    }

}
