package com.github.curriculeon.objectorientation.employee;

import org.junit.Assert;
import org.junit.Test;
import com.github.curriculeon.objectorientation.account.Account;
import com.github.curriculeon.objectorientation.account.Employee;
import com.github.curriculeon.objectorientation.account.Transactable;
import com.github.curriculeon.objectorientation.account.Worker;

/**
 * @author leon on 30/12/2018.
 */
public class EmployeePolymorphismTest {
    private Object employee = new Employee();

    @Test
    public void test1() {
        Assert.assertTrue(employee instanceof Transactable);
    }

    @Test
    public void test2() {
        Assert.assertTrue(employee instanceof Worker);
    }

    public void test3() {
        Assert.assertFalse(employee instanceof Account);
    }
}
