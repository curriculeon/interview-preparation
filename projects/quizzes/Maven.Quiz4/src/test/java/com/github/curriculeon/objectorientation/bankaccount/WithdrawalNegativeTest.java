package com.github.curriculeon.objectorientation.bankaccount;

import org.junit.Assert;
import org.junit.Test;
import com.github.curriculeon.objectorientation.account.BankAccount;
import com.github.curriculeon.objectorientation.account.Transactable;

/**
 * @author leon on 30/12/2018.
 */
@SuppressWarnings("all")
public class WithdrawalNegativeTest {

    @Test(expected = IllegalArgumentException.class)
    public void test1() {
        test(0.0, 1.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test2() {
        test(10.0, 50.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test3() {
        test(10.0, -50.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test4() {
        test(00.0, -50.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test5() {
        test(00.0, 0.01);
    }

    private void test(Double initialBalance, Double withdrawalAmount) {
        // given
        Double expected = initialBalance - withdrawalAmount;
        BankAccount bankAccount = new BankAccount();
        Transactable transactable = (Transactable)bankAccount;
        bankAccount.setBalance(initialBalance);

        // when
        transactable.withdrawal(withdrawalAmount);
        Double actual = transactable.getBalance();

        // then
        Assert.assertEquals(expected, actual);
    }
}
