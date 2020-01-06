package com.github.curriculeon.assessment2.generics.shelter;

import com.github.curriculeon.assessment2.generics.Shelter;
import com.github.curriculeon.assessment2.generics.ageable.Ageable;
import com.github.curriculeon.assessment2.generics.ageable.Cat;
import com.github.curriculeon.assessment2.generics.ageable.Dog;
import com.github.curriculeon.assessment2.generics.ageable.Person;
import org.junit.Assert;
import org.junit.Test;

import java.util.function.Supplier;

public class ShelterSizeTest {
    @Test
    public void testPerson() {
        // given
        int numberOfPerson = 10;
        Supplier<Ageable> supplier = Person::new;

        // when
        test(numberOfPerson, supplier);
    }

    @Test
    public void testDog() {
        // given
        int numberOfPerson = 10;
        Supplier<Ageable> supplier = Dog::new;

        // when
        test(numberOfPerson, supplier);
    }

    @Test
    public void testCat() {
        // given
        int numberOfPerson = 10;
        Supplier<Ageable> supplier = Cat::new;

        // when
        test(numberOfPerson, supplier);
    }


    private void test(int expected, Supplier<Ageable> supplier) {
        Shelter shelter = new Shelter();
        for (int i = 0; i < expected; i++) {
            Ageable ageable = supplier.get();
            shelter.add(ageable);
        }
        int actual = shelter.size();
        // then
        Assert.assertEquals(expected, actual);
    }
}
