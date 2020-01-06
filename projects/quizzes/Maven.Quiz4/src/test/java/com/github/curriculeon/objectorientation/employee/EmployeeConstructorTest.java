package com.github.curriculeon.objectorientation.employee;

import org.junit.Assert;
import org.junit.Test;
import com.github.curriculeon.objectorientation.account.BankAccount;
import com.github.curriculeon.objectorientation.account.Employee;
import com.github.curriculeon.objectorientation.account.Transactable;
import com.github.curriculeon.objectorientation.account.Worker;

/**
 * @author leon on 30/12/2018.
 */
public class EmployeeConstructorTest {
    @Test
    public void testNullaryConstructor() {
    // Given :
        // given default values are
        Double expectedHourlyWage = 35.0;
        Double expectedHoursWorked = 0.0;
        Double expectedBalance = 0.0;
        Double expectedBankAccountBalance = 0.0;



    // When :
        // when an employee is constructed via nullary constructor
        Employee employee = new Employee();

        // and employee is a `Worker`
        Worker workerEmployee = (Worker) employee;

        // and employee is a `Transactable`
        Transactable transactableEmployee = (Transactable) employee;

        // and `BankAccount` is `Transactable`
        Transactable bankAccount = (Transactable) employee.getBankAccount();



    // Then :
        // then the account shouldn't be null
        Assert.assertNotNull(employee.getBankAccount());

        // then their hourly wage should be set to the expected default value
        Assert.assertEquals(expectedHourlyWage, workerEmployee.getHourlyWage());

        // then their expected hours worked should be set to the expected default value
        Assert.assertEquals(expectedHoursWorked, workerEmployee.getHoursWorked());

        // then their expected balance should be set to the expected default value
        Assert.assertEquals(expectedBalance, transactableEmployee.getBalance());

        // then their expected hours worked should be set to the expected default value
        Assert.assertEquals(expectedBankAccountBalance, bankAccount.getBalance());
    }

    @Test
    public void testNonNullaryConstructor() {
        // given
        Double expectedHourlyWage = 35.0;
        Double expectedHoursWorked = 0.0;
        Double expectedBalance = 15.0;
        Double expectedBankAccountBalance = expectedBalance;
        Double expectedMoneyEarned = expectedHourlyWage * expectedHoursWorked;
        BankAccount bankAccount = new BankAccount();
        bankAccount.setBalance(expectedBankAccountBalance);
        Transactable transactableBankAccount = (Transactable)bankAccount;

        // when
        Employee employee = new Employee(bankAccount);
        Worker workerEmployee = (Worker) employee;
        Transactable transactableEmployee = (Transactable) employee;

        // then
        Assert.assertNotNull(employee.getBankAccount());
        Assert.assertEquals(expectedHourlyWage, workerEmployee.getHourlyWage());
        Assert.assertEquals(expectedHoursWorked, workerEmployee.getHoursWorked());
        Assert.assertEquals(expectedBalance, transactableEmployee.getBalance());
        Assert.assertEquals(expectedMoneyEarned, expectedMoneyEarned);
        Assert.assertEquals(expectedBankAccountBalance, transactableBankAccount.getBalance());
    }

}
