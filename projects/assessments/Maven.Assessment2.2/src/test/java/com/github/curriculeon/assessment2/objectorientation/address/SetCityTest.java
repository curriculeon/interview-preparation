package com.github.curriculeon.assessment2.objectorientation.address;

import com.github.curriculeon.assessment2.objectorientation.Address;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author leon on 28/11/2018.
 */
public class SetCityTest {
    @Test
    public void test1() {
        // Given
        Address address = new Address();
        String expected = "Philadelphia";

        // when
        address.setCity(expected);
        String actual = address.getCity();

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        // Given
        Address address = new Address();
        String expected = "New York";

        // when
        address.setCity(expected);
        String actual = address.getCity();

        // then
        Assert.assertEquals(expected, actual);
    }
}
