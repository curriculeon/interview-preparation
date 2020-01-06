package com.github.curriculeon.objectorientation.employee;

import org.junit.Assert;
import org.junit.Test;
import com.github.curriculeon.objectorientation.account.BankAccount;
import com.github.curriculeon.objectorientation.account.Employee;
import com.github.curriculeon.objectorientation.account.Transactable;

/**
 * @author leon on 30/12/2018.
 */
public class EmployeeDepositTest {
    @Test
    public void test1() {
        test(0.0, 10.0);
    }

    @Test
    public void test2() {
        test(0.0, 20.0);
    }

    @Test
    public void test3() {
        test(10.0, 100.0);
    }

    @Test
    public void test4() {
        test(20.0, 300.0);
    }

    @Test
    public void test5() {
        test(0.0, 400.0);
    }


    private void test(Double preDepositBalance, Double amountToDeposit) {
        // given
        Employee employee = new Employee();
        BankAccount bankAccount = employee.getBankAccount();
        Transactable employeeAsTransactable = (Transactable) employee;

        employeeAsTransactable.deposit(preDepositBalance);
        Double expectedEmployeeBalance = preDepositBalance + amountToDeposit;


        // when
        employeeAsTransactable.deposit(amountToDeposit);
        Double actualEmployeeBalance = employeeAsTransactable.getBalance();
        Double actualBankAccountBalance = ((Transactable)bankAccount).getBalance();


        // then
        Assert.assertEquals(expectedEmployeeBalance, actualEmployeeBalance);
        Assert.assertEquals(expectedEmployeeBalance, actualBankAccountBalance);
    }
}
