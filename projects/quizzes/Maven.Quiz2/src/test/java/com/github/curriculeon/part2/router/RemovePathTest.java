package com.github.curriculeon.part2.router;

import com.github.curriculeon.part2.Router;
import org.junit.Assert;
import org.junit.Test;

public class RemovePathTest {
    @Test
    public void test1() {
        test("/users", "UserController");
    }

    @Test
    public void test2() {
        test("/employees", "EmployeeController");
    }

    @Test
    public void test3() {
        test("/students", "StudentController");
    }

    private void test(String path, String controller) {
        // given
        Router router = new Router();
        router.add(path, controller);
        Assert.assertNotNull(router.getController(path));

        // when
        router.remove(path);

        // then
        Assert.assertNull(router.getController(path));
    }
}
