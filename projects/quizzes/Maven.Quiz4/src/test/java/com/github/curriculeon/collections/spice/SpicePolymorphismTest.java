package com.github.curriculeon.collections.spice;

import org.junit.Assert;
import org.junit.Test;
import com.github.curriculeon.collections.culonary.Curry;
import com.github.curriculeon.collections.culonary.Ginger;
import com.github.curriculeon.collections.culonary.Pepper;
import com.github.curriculeon.collections.culonary.Spice;

/**
 * @author leon on 27/12/2018.
 */
public class SpicePolymorphismTest {
    @Test
    public void testPepperIsSpice() {
        Assert.assertTrue(new Pepper() instanceof Spice);
    }

    @Test
    public void testGingerIsSpice() {
        Assert.assertTrue(new Ginger() instanceof Spice);
    }

    @Test
    public void testCurryIsSpice() {
        Assert.assertTrue(new Curry() instanceof Spice);
    }
}
