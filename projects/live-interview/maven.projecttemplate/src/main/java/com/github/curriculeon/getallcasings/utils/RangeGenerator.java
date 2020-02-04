package com.github.curriculeon.getallcasings.utils;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by leon on 2/3/2020.
 */
public class RangeGenerator {
    Integer start;
    Integer end;

    public RangeGenerator(Integer start, Integer end) {
        this.start = start;
        this.end = end;
    }
    public Integer[] getRange() {
        return IntStream
                .rangeClosed(start, end)
                .boxed()
                .collect(Collectors.toList())
                .toArray(new Integer[0]);
    }

    public Integer getStart() {
        return start;
    }

    public Integer getEnd() {
        return end;
    }
}
