package com.github.curriculeon.assessment2.generics.shelter;

import com.github.curriculeon.assessment2.generics.Shelter;
import com.github.curriculeon.assessment2.generics.ageable.Ageable;
import com.github.curriculeon.assessment2.generics.ageable.Cat;
import com.github.curriculeon.assessment2.generics.ageable.Dog;
import com.github.curriculeon.assessment2.generics.ageable.Person;
import org.junit.Assert;
import org.junit.Test;

import java.util.function.Supplier;

public class ShelterGetIndexOfTest {
    @Test
    public void testPerson() {
        // given
        int numberOfPerson = 10;
        Supplier<Ageable> supplier = Person::new;
        Shelter<Person> shelter = new Shelter<>();

        // when
        test(numberOfPerson, supplier, shelter);
    }

    @Test
    public void testDog() {
        // given
        int numberOfPerson = 10;
        Supplier<Ageable> supplier = Dog::new;
        Shelter<Person> shelter = new Shelter<>();

        // when
        test(numberOfPerson, supplier, shelter);
    }

    @Test
    public void testCat() {
        // given
        int numberOfPerson = 10;
        Supplier<Ageable> supplier = Cat::new;
        Shelter<Person> shelter = new Shelter<>();

        // when
        test(numberOfPerson, supplier, shelter);
    }


    private void test(int numberOfElements, Supplier<Ageable> supplier, Shelter shelter) {
        for (int expected = 0; expected < numberOfElements; expected++) {
            Ageable ageable = supplier.get();
            shelter.add(ageable);
            int actual = shelter.getIndexOf(ageable);

            // then
            Assert.assertEquals(expected, actual);
        }
    }
}
