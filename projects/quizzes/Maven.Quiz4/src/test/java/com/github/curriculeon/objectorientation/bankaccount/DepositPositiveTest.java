package com.github.curriculeon.objectorientation.bankaccount;

import org.junit.Assert;
import org.junit.Test;
import com.github.curriculeon.objectorientation.account.BankAccount;
import com.github.curriculeon.objectorientation.account.Transactable;

/**
 * @author leon on 02/01/2019.
 */
@SuppressWarnings("all")
public class DepositPositiveTest {
    @Test(expected = IllegalArgumentException.class)
    public void test1() {
        test(100.0, -1.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test2() {
        test(10.0, -50.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test3() {
        test(55.0, -500.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test4() {
        test(78.0, -90.0);
    }

    public void test(Double initialBalance, Double depositAmount) {
        // given
        Double expected = initialBalance + depositAmount;
        BankAccount bankAccount = new BankAccount();
        Transactable transactable = (Transactable)bankAccount;
        bankAccount.setBalance(initialBalance);

        // when
        transactable.deposit(depositAmount);
        Double actual = transactable.getBalance();

        // then
        Assert.assertEquals(expected, actual);
    }
}
