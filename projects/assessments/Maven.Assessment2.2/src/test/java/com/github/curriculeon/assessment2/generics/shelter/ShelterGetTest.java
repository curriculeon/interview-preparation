package com.github.curriculeon.assessment2.generics.shelter;

import com.github.curriculeon.assessment2.generics.Shelter;
import com.github.curriculeon.assessment2.generics.ageable.Ageable;
import com.github.curriculeon.assessment2.generics.ageable.Cat;
import com.github.curriculeon.assessment2.generics.ageable.Dog;
import com.github.curriculeon.assessment2.generics.ageable.Person;
import org.junit.Assert;
import org.junit.Test;

public class ShelterGetTest {

    @Test
    public void testPerson() {
        // given
        Shelter shelter = new Shelter();
        Ageable ageable = new Person();

        // when
        test(shelter, ageable);
    }

    @Test
    public void testDog() {
        // given
        Shelter shelter = new Shelter();
        Ageable ageable = new Dog();

        // when
        test(shelter, ageable);
    }


    @Test
    public void testCat() {
        // given
        Shelter shelter = new Shelter();
        Ageable ageable = new Cat();

        // when
        test(shelter, ageable);
    }

    private void test(Shelter shelter, Ageable expected) {
        shelter.add(expected);
        Ageable actual = (Ageable) shelter.get(0);

        // then
        Assert.assertEquals(expected, actual);
    }
}
