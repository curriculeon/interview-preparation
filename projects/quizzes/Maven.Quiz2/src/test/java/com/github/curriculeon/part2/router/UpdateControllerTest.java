package com.github.curriculeon.part2.router;

import com.github.curriculeon.part2.Router;
import org.junit.Assert;
import org.junit.Test;

public class UpdateControllerTest {
    @Test
    public void test1() {
        test("/users", "StudentController", "UserController");
    }

    @Test
    public void test2() {
        test("/employees",  "UserController", "EmployeeController");
    }

    @Test
    public void test3() {
        test("/students",  "EmployeeController", "StudentController");
    }

    private void test(String path, String originalController, String updatedController){
        // given
        Router router = new Router();
        router.add(path, originalController);

        // when
        router.update(path, updatedController);
        String actualController = router.getController(path);

        // then
        Assert.assertEquals(updatedController, actualController);
    }
}
