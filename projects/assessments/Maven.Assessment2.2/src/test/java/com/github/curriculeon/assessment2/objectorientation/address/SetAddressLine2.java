package com.github.curriculeon.assessment2.objectorientation.address;

import com.github.curriculeon.assessment2.objectorientation.Address;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author leon on 28/11/2018.
 */
public class SetAddressLine2 {
    @Test
    public void test1() {
        // Given
        Address address = new Address();
        String expected = "123 Cool Street";

        // when
        address.setAddressLine2(expected);
        String actual = address.getAddressLine2();

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        // Given
        Address address = new Address();
        String expected = "587 The Lane";

        // when
        address.setAddressLine2(expected);
        String actual = address.getAddressLine2();

        // then
        Assert.assertEquals(expected, actual);
    }
}
