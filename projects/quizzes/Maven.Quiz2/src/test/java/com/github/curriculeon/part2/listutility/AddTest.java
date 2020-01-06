package com.github.curriculeon.part2.listutility;

import com.github.curriculeon.part2.ListUtility;
import org.junit.Assert;
import org.junit.Test;

public class AddTest {
    @Test
    public void test1() {
        test(1);
    }

    @Test
    public void test2() {
        test(2);
    }

    @Test
    public void test3() {
        test(3);
    }

    @Test
    public void test4() {
        test(null);
    }


    private void test(Integer valueToAdd){
        // given
        ListUtility utility = new ListUtility();
        Assert.assertFalse(utility.contains(valueToAdd));

        // when
        utility.add(valueToAdd);

        // then
        Assert.assertTrue(utility.contains(valueToAdd));
    }

}
