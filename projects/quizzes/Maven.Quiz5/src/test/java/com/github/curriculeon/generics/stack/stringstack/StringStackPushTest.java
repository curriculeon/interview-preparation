package com.github.curriculeon.generics.stack.stringstack;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import com.github.curriculeon.generics.MyStack;

/**
 * @author leon on 11/12/2018.
 */
public class StringStackPushTest {
    private MyStack<String> stack;

    @Before
    public void setup() {
        this.stack = new MyStack<>();
    }

    @Test
    public void test1() {
        Assert.assertNull(stack.peek());
    }

    @Test
    public void test2() {
        String expected = "0";
        stack.push(expected);
        Assert.assertEquals(stack.peek(), expected);
    }

    @Test
    public void test3() {
        String expected = "1";
        stack.push(expected);
        Assert.assertEquals(stack.peek(), expected);
    }

    @Test
    public void test4() {
        String val1 = "10";
        String val2 = "15";
        String val3 = "20";
        String expected = "25";

        stack.push(val1);
        stack.push(val2);
        stack.push(val3);
        stack.push(expected);

        Assert.assertEquals(stack.peek(), expected);
    }

    @Test
    public void test5() {
        String  val1 = "30";
        String  val2 = "35";
        String  val3 = "40";
        String  expected = "45";

        stack.push(val1);
        stack.push(val2);
        stack.push(val3);
        stack.push(expected);

        Assert.assertEquals(stack.peek(), expected);
    }
}
