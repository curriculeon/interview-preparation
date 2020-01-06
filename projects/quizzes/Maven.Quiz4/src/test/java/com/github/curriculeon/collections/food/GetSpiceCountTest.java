package com.github.curriculeon.collections.food;

import org.junit.Assert;
import org.junit.Test;
import com.github.curriculeon.collections.culonary.Food;
import com.github.curriculeon.collections.culonary.Curry;
import com.github.curriculeon.collections.culonary.Ginger;
import com.github.curriculeon.collections.culonary.Pepper;
import com.github.curriculeon.collections.culonary.Spice;

import java.util.Map;
import java.util.function.Supplier;

public class GetSpiceCountTest {

    private void test(Integer amountOfIngredients, Supplier<?> ingredientSupplier) {
        // we should expect `amountOfIngredients` to be fetched from mapping
        Integer expected = amountOfIngredients;

        // given there is some food
        Food food = new Food();

        // given there is a potential for existence of spice
        Spice spice = null;

        for (int i = 0; i < amountOfIngredients; i++) {
            // given the `Spice` interface has been implemented
            spice = (Spice) ingredientSupplier.get();

            // given spice is applied to food
            food.applySpice(spice);
        }

        // when mapping is created
        Map<Class<? extends Spice>, Integer> amountOfPeppers = food.getSpiceCount();

        // when mapping is evaluated
        Integer actual = amountOfPeppers.get(spice.getClass());

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test1() {
        test(5, Pepper::new);
    }

    @Test
    public void test2() {
        test(10, Pepper::new);
    }

    @Test
    public void test3() {
        test(3, Curry::new);
    }


    @Test
    public void test4() {
        test(6, Curry::new);
    }

    @Test
    public void test5() {
        test(2, Ginger::new);
    }

    @Test
    public void test6() {
        test(4, Ginger::new);
    }
}
