package com.github.curriculeon.assessment2.objectorientation.person;

import com.github.curriculeon.assessment2.objectorientation.Address;
import com.github.curriculeon.assessment2.objectorientation.Person;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author leon on 29/11/2018.
 */
public class PersonToStringTest {
    @Test
    public void testNullaryConstructor() {
        // given
        Person person = new Person();
        String expected = "Person{id=-9223372036854775808, name='', address=Address{addressLine1='', addressLine2='', city='', state='', zipcode=''}}";

        // when
        String actual = person.toString();

        // then
        Assert.assertEquals(expected,actual);
    }


    @Test
    public void testConstructor() {
        // given
        Long id = Long.MAX_VALUE;
        String name = "PersonName";
        Address address = new Address("line1","line2", "city","state","99999");
        String expected = "Person{id=9223372036854775807, name='PersonName', address=Address{addressLine1='line1', addressLine2='line2', city='city', state='state', zipcode='99999'}}";
        Person person = new Person(id, name, address);

        // when
        String actual = person.toString();

        // then
        Assert.assertEquals(expected, actual);
    }
}
