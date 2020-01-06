package com.github.curriculeon.assessment2.objectorientation.person;

import com.github.curriculeon.assessment2.objectorientation.Address;
import com.github.curriculeon.assessment2.objectorientation.Person;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author leon on 29/11/2018.
 */
public class PersonConstructorTest {
    @Test
    public void testNullaryConstructor() {
        // given
        Person person = new Person();
        Long expectedId = Long.MIN_VALUE;
        String expectedName = "";
        Address expectedAddress = new Address();

        // when
        Long actualId = person.getId();
        String actualName = person.getName();
        Address actualAddress = person.getAddress();

        // then
        Assert.assertEquals(expectedId, actualId);
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAddress, actualAddress);
    }


    @Test
    public void testConstructor() {
        // given
        Long expectedId = Long.MAX_VALUE;
        String expectedName = "PersonName";
        Address expectedAddress = new Address("line1","line2", "city","state","99999");
        Person person = new Person(expectedId, expectedName, expectedAddress);

        // when
        Long actualId = person.getId();
        String actualName = person.getName();
        Address actualAddress = person.getAddress();

        // then
        Assert.assertEquals(expectedId, actualId);
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAddress, actualAddress);
    }
}
