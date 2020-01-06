package com.github.curriculeon.collections.wordcounter;

import org.junit.Assert;
import org.junit.Test;
import com.github.curriculeon.collections.WordCounter;

import java.util.Map;

public class GetWordCountMapTest {
    @Test
    public void test1() {
        // given
        WordCounter wordCounter = new WordCounter("Hey");
        Integer expected = 1;

        // when
        Map<String, Integer> map = wordCounter.getWordCountMap();
        Integer actual = map.get("Hey");

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        // given
        WordCounter wordCounter = new WordCounter("Hey", "Hey");
        Integer expected = 2;

        // when
        Map<String, Integer> map = wordCounter.getWordCountMap();
        Integer actual = map.get("Hey");

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        // given
        WordCounter wordCounter = new WordCounter("Hey", "Hey", "Hello");
        Integer expectedHey = 2;
        Integer expectedHello = 1;

        // when
        Map<String, Integer> map = wordCounter.getWordCountMap();
        Integer actualHey = map.get("Hey");
        Integer actualHello = map.get("Hello");

        // then
        Assert.assertEquals(expectedHey, actualHey);
        Assert.assertEquals(expectedHello, actualHello);
    }


    @Test
    public void test4() {
        // given
        WordCounter wordCounter = new WordCounter("Hey", "Hey", "Hello", "Hello", "Hello");
        Integer expectedHey = 2;
        Integer expectedHello = 3;

        // when
        Map<String, Integer> map = wordCounter.getWordCountMap();
        Integer actualHey = map.get("Hey");
        Integer actualHello = map.get("Hello");

        // then
        Assert.assertEquals(expectedHey, actualHey);
        Assert.assertEquals(expectedHello, actualHello);
    }
}
