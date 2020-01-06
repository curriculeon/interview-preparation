package com.github.curriculeon.part2.router;

import com.github.curriculeon.part2.Router;
import org.junit.Assert;
import org.junit.Test;

public class AddTest {

    @Test
    public void test1() {
        String expectedPath = "/users";
        String controller = "UserController";
        test(expectedPath, controller);
    }


    @Test
    public void test2() {
        String expectedPath = "/players";
        String controller = "PlayerController";
        test(expectedPath, controller);
    }


    @Test
    public void test3() {
        String expectedPath = "/Students";
        String controller = "StudentsController";
        test(expectedPath, controller);
    }


    @Test
    public void test4() {
        String expectedPath = "/myPath";
        String controller = "MyController";
        test(expectedPath, controller);
    }


    private void test(String expectedPath, String controller) {
        // given
        Router router = new Router();

        // when
        router.add(expectedPath, controller);
        String actualController = router.getController(expectedPath);

        // then
        Assert.assertEquals(controller, actualController);
    }
}
