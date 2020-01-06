package com.github.curriculeon.utils;

import org.junit.Assert;

import java.util.Arrays;
import java.util.concurrent.TimeoutException;
import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * @author leon on 09/12/2018.
 */
public class TestUtils {
    public static <ObjectType> void assertArrayEquals(ObjectType[] array1, ObjectType[] array2) {
        Arrays.sort(array1);
        Arrays.sort(array2);
        Assert.assertEquals(Arrays.toString(array1), Arrays.toString(array2));
    }


    public static <ArgType1, ReturnType> void constrainMethodPerformance(
            Function<ArgType1, ReturnType> function,
            ArgType1 arg1,
            Long maxTimeInMilliseconds) {
        constrainMethodPerformance((val1, val2) -> function.apply(val1), arg1, null, maxTimeInMilliseconds);
    }

    public static <ArgType1, ArgType2, ReturnType> void constrainMethodPerformance(
            BiFunction<ArgType1, ArgType2, ReturnType> function,
            ArgType1 arg1, ArgType2 arg2, Long maxTimeInMilliseconds) {
        if (timeMethod(function, arg1, arg2) > maxTimeInMilliseconds) {
            Throwable timeoutException = new TimeoutException("Method must perform in under " + maxTimeInMilliseconds + "millseconds");
            ;
            throw new Error(timeoutException);
        }
    }


    public static <ArgType1, ReturnType> Long timeMethod(Function<ArgType1, ReturnType> function, ArgType1 arg1) {
        return timeMethod((val1, val2) -> function.apply(val1), arg1, null);
    }

    public static <ArgType1, ArgType2, ReturnType> Long timeMethod(
            BiFunction<ArgType1, ArgType2, ReturnType> function,
            ArgType1 arg1, ArgType2 arg2) {
        Long startTime = System.currentTimeMillis();
        function.apply(arg1, arg2);
        Long endTime = System.currentTimeMillis();
        Long delta = endTime - startTime;
        return delta;
    }

}
