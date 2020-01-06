package com.github.curriculeon.part3;

import org.junit.Assert;
import org.junit.Test;

public class HorseTest {

    @Test
    public void testMove() {
        Animal horse = (Animal)(Object)new Horse();
        String expected = "gallop";

        String actual = horse.move();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testColor() {
        Animal horse = (Animal)(Object)new Horse();
        String expected = "brown";

        String actual = horse.color();

        Assert.assertEquals(expected, actual);
    }
}
