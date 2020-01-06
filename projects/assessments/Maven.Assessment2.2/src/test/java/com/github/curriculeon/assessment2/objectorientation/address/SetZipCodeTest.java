package com.github.curriculeon.assessment2.objectorientation.address;

import com.github.curriculeon.assessment2.objectorientation.Address;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author leon on 28/11/2018.
 */
public class SetZipCodeTest {
    @Test
    public void test1() {
        // Given
        Address address = new Address();
        String expected = "19720";

        // when
        address.setZipcode(expected);
        String actual = address.getZipcode();

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        // Given
        Address address = new Address();
        String expected = "18713";

        // when
        address.setZipcode(expected);
        String actual = address.getZipcode();

        // then
        Assert.assertEquals(expected, actual);
    }
}
