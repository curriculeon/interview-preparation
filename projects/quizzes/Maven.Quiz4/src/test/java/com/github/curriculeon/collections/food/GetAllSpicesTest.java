package com.github.curriculeon.collections.food;

import org.junit.Assert;
import org.junit.Test;
import com.github.curriculeon.collections.culonary.Food;
import com.github.curriculeon.collections.culonary.Curry;
import com.github.curriculeon.collections.culonary.Ginger;
import com.github.curriculeon.collections.culonary.Pepper;
import com.github.curriculeon.collections.culonary.Spice;

import java.util.Arrays;
import java.util.List;

public class GetAllSpicesTest {

    private void test(List<Spice> expected) {
        // given there is some food
        Food food = new Food();

        // given each spice is applied to food
        expected.forEach(food::applySpice);

        // when spice on food is evaluated
        List<Spice> actual = food.getAllSpices();

        // then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void test1() {
        // given
        test(Arrays.asList((Spice) new Curry()));
    }

    @Test
    public void test2() {
        // given
        test(Arrays.asList((Spice) new Ginger()));
    }

    @Test
    public void test3() {
        // given
        test(Arrays.asList((Spice) new Pepper()));
    }

    @Test
    public void test4() {
        // given
        test(Arrays.asList(
                (Spice) new Pepper(),
                (Spice) new Ginger(),
                (Spice) new Curry()));
    }

    @Test
    public void test5() {
        // given
        test(Arrays.asList(
                (Spice) new Pepper(),
                (Spice) new Pepper(),
                (Spice) new Ginger(),
                (Spice) new Curry()));
    }


    @Test
    public void test6() {
        // given
        test(Arrays.asList(
                (Spice) new Pepper(),
                (Spice) new Pepper(),
                (Spice) new Ginger(),
                (Spice) new Ginger(),
                (Spice) new Curry()));
    }

}
