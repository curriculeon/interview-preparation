package com.github.curriculeon.part2.listutility;

import com.github.curriculeon.part2.ListUtility;
import org.junit.Assert;
import org.junit.Test;

public class JoinTest {
    private ListUtility utility = new ListUtility();


    @Test
    public void testJoin_withOneElement(){
        utility.add(812);
        String expected = "812";

        String actual = utility.join();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testJoin_withMultipleElement(){
        utility.add(8);
        utility.add(7);
        utility.add(9);
        utility.add(71);
        String expected = "8, 7, 9, 71";

        String actual = utility.join();

        Assert.assertEquals(expected, actual);
    }



}
