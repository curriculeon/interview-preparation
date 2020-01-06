package com.github.curriculeon.assessment2.objectorientation.person;

import com.github.curriculeon.assessment2.objectorientation.Person;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author leon on 29/11/2018.
 */
public class PersonEqualsTest {
    @Test
    public void checkDefaultPersonEquivalence() {
        // given
        Person person1 = new Person();
        Person person2 = new Person();

        // when
        Boolean outcome = person1.equals(person2);

        // then
        Assert.assertTrue(outcome);
    }

    @Test
    public void checkDefaultPersonNonEquivalence() {
        // given
        Person person1 = new Person(null, "PersonName", null);
        Person person2 = new Person();

        // when
        Boolean outcome = person1.equals(person2);

        // then
        Assert.assertFalse(outcome);
    }

    @Test
    public void checkNonDefaultPersonEquivalence() {
        // given
        Person person1 = new Person(null, "PersonName", null);
        Person person2 = new Person(null, "PersonName", null);

        // when
        Boolean outcome = person1.equals(person2);

        // then
        Assert.assertTrue(outcome);
    }
}