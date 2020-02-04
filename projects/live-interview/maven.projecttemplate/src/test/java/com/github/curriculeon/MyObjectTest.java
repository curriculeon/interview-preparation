package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class MyObjectTest {
    @Test
    public void testRun() { // TODO
        // Given
        MyObject myObject = new MyObject();

        // when
        myObject.run();

        //then
        Assert.assertNotNull(myObject.toString());
    }
}
