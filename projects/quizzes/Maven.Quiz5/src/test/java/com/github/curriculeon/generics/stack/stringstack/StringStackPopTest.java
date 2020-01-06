package com.github.curriculeon.generics.stack.stringstack;

import org.junit.Before;
import org.junit.Test;
import com.github.curriculeon.generics.MyStack;
import com.github.curriculeon.utils.TestUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.List;

/**
 * @author leon on 11/12/2018.
 */
public class StringStackPopTest {
    private MyStack<String> stack;

    @Before
    public void setup() {
        this.stack = new MyStack<>();
    }

    @Test(expected = EmptyStackException.class)
    public void test1() {
        stack.pop();
    }

    @Test
    public void test2() {
        test("765", "321", "9", "342", "98", "132");
    }
    
    @Test
    public void test3() {
        test("1123", "65", "4568", "21", "3154");
    }

    private void test(String... elementsToBePushed) {
        List<String> listOfElementsTobePushed = Arrays.asList(elementsToBePushed);
        List<String> result = new ArrayList<>();
        for (String elementToBePushed : listOfElementsTobePushed) {
            stack.push(elementToBePushed);
        }

        for (String elementToBePopped : listOfElementsTobePushed) {
            result.add(stack.pop());
        }

        String[] actual = TestUtils.reveseList(result).toArray(String[]::new);
        String[] expected = listOfElementsTobePushed.stream().toArray(String[]::new);
        TestUtils.assertArrayEquals(expected, actual);
    }
}
