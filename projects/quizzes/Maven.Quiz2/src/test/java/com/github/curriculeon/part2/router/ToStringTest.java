package com.github.curriculeon.part2.router;

import com.github.curriculeon.part2.Router;
import org.junit.Assert;
import org.junit.Test;

public class ToStringTest {
    @Test
    public void test1() {
        test(
                new Pair<>("/users", "UserController"));
    }

    @Test
    public void test2() {
        test(
                new Pair<>("/users", "UserController"),
                new Pair<>("/students", "StudentController"),
                new Pair<>("/instructors", "InstructorController"),
                new Pair<>("/students", "StudentController"));
    }


    @Test
    public void test3() {
        test(
                new Pair<>("/users", "UserController"),
                new Pair<>("/instructors", "InstructorController"));
    }


    @Test
    public void test4() {
        test(
                new Pair<>("/users", "UserController"),
                new Pair<>("/instructors", "InstructorController"));
    }

    @Test
    public void test(Pair<String, String>... pairs) {
        // given
        StringBuilder expectedString = new StringBuilder();
        Router router = new Router();
        for (Pair<String, String> pair : pairs) {
            String path = pair.getKey();
            String controller = pair.getValue();

            router.add(path, controller);
            expectedString.append(path).append(controller).append('\n');
        }


        // when
        String actualString = router.toString();


        // then
        Assert.assertEquals(expectedString.toString(), actualString);

    }


}
