package com.github.curriculeon.assessment2.objectorientation.person;

import com.github.curriculeon.assessment2.objectorientation.Person;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author leon on 28/11/2018.
 */
public class SetIdTest {
    @Test
    public void test1() {
        // given
        Person person = new Person();
        Long expected = Long.MAX_VALUE;

        // when
        person.setId(expected);
        Long actual = person.getId();

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        // given
        Person person = new Person();
        Long expected = Long.MIN_VALUE;

        // when
        person.setId(expected);
        Long actual = person.getId();

        // then
        Assert.assertEquals(expected, actual);
    }
}
