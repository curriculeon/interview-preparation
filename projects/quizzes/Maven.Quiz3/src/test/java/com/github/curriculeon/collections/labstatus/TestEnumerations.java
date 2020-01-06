package com.github.curriculeon.collections.labstatus;

import com.github.curriculeon.collections.LabStatus;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author leon on 10/12/2018.
 */
public class TestEnumerations {
    @Test
    public void test1() {
        LabStatus.valueOf("COMPLETED");
    }

    @Test
    public void test2() {
        LabStatus.valueOf("INCOMPLETE");
    }

    @Test
    public void test3() {
        LabStatus.valueOf("PENDING");
    }

    @Test
    public void test4() {
        Assert.assertEquals(3, LabStatus.values().length);
    }
}
