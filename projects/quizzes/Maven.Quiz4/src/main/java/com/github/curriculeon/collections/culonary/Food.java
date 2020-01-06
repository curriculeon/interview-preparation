package com.github.curriculeon.collections.culonary;

import java.util.List;
import java.util.Map;

/**
 * @author leon on 27/12/2018.
 */
public class Food {
    public List<Spice> getAllSpices() {
        return null;
    }

    public <SpiceType extends Class<? extends Spice>> Map<SpiceType, Integer> getSpiceCount() {
        return null;
    }

    public void applySpice(Spice spice) {
    }
}
