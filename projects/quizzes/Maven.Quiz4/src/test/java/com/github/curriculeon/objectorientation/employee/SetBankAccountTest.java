package com.github.curriculeon.objectorientation.employee;

import org.junit.Assert;
import org.junit.Test;
import com.github.curriculeon.objectorientation.account.BankAccount;
import com.github.curriculeon.objectorientation.account.Employee;
import com.github.curriculeon.objectorientation.account.Transactable;

/**
 * @author leon on 30/12/2018.
 */
public class SetBankAccountTest {
    @Test
    public void test1() {
        // given
        Employee employee = new Employee();
        BankAccount expected = new BankAccount();

        // when
        employee.setBankAccount(expected);
        BankAccount actual = employee.getBankAccount();

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        test(10.0);
    }


    @Test
    public void test3() {
        test(15.0);
    }




    @Test
    public void tes4() {
        test(20.0);
    }


    public void test(Double expectedBalance) {
        // given
        Employee employee = new Employee();
        BankAccount expected = new BankAccount();
        ((Transactable)expected).deposit(expectedBalance);

        // when
        employee.setBankAccount(expected);
        BankAccount actual = employee.getBankAccount();
        Double actualBalance = ((Transactable)employee).getBalance();

        // then
        Assert.assertEquals(expected, actual);
        Assert.assertEquals(expectedBalance, actualBalance);
    }
}
