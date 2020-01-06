package com.github.curriculeon.part2.listutility;

import com.github.curriculeon.part2.ListUtility;
import org.junit.Assert;
import org.junit.Test;

public class SizeTest {
    @Test
    public void test1() {
        test(1);
    }

    @Test
    public void test2() {
        test(1, 10, 123213);
    }

    @Test
    public void test3() {
        test(1, 912, 1381, 12312, 13, 75657);
    }


    public void test(Integer... valuesToBeAdded) {
        // given
        ListUtility utility = new ListUtility();
        int expectedSize = valuesToBeAdded.length;
        for (Integer valueToBeAdded : valuesToBeAdded) {
            utility.add(valueToBeAdded);
        }

        // when
        int actualSize = utility.size();

        // then
        Assert.assertEquals(expectedSize, actualSize);
    }

}
