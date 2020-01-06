package com.github.curriculeon.assessment2.fundamentals.stringutils;

import com.github.curriculeon.assessment2.fundamentals.StringUtils;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author leon on 28/11/2018.
 */
public class RepeatStringTest {
    @Test
    public void testRepeatHello5Times() {
        // given
        String stringToRepeat = "Hello";
        Integer numberOfTimesToRepeat = 5;
        String expected = new StringBuilder()
                .append(stringToRepeat)
                .append(stringToRepeat)
                .append(stringToRepeat)
                .append(stringToRepeat)
                .append(stringToRepeat)
                .toString();

        // when
        String actual = StringUtils.repeatString(stringToRepeat, numberOfTimesToRepeat);

        // then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testRepeatQuickBrown6Times() {
        // given
        String stringToRepeat = "Quick Brown";
        Integer numberOfTimesToRepeat = 6;
        String expected = new StringBuilder()
                .append(stringToRepeat)
                .append(stringToRepeat)
                .append(stringToRepeat)
                .append(stringToRepeat)
                .append(stringToRepeat)
                .append(stringToRepeat)
                .toString();

        // when
        String actual = StringUtils.repeatString(stringToRepeat, numberOfTimesToRepeat);

        // then
        Assert.assertEquals(expected, actual);
    }

}
