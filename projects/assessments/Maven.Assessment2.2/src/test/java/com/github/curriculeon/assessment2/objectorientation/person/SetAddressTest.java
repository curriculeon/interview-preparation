package com.github.curriculeon.assessment2.objectorientation.person;

import com.github.curriculeon.assessment2.objectorientation.Address;
import com.github.curriculeon.assessment2.objectorientation.Person;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author leon on 28/11/2018.
 */
public class SetAddressTest {
    @Test
    public void test1() {
        // given
        Person person = new Person();
        Address expected = new Address();
        
        // when
        person.setAddress(expected);
        Address actual = person.getAddress(); 
        
        // then
        Assert.assertEquals(expected, actual);
    }
}
