package com.github.curriculeon.objectorientation.bankaccount;

import org.junit.Assert;
import org.junit.Test;
import com.github.curriculeon.objectorientation.account.BankAccount;
import com.github.curriculeon.objectorientation.account.Transactable;

/**
 * @author leon on 02/01/2019.
 */
@SuppressWarnings("all")
public class WithdrawalPositiveTest {
    @Test
    public void test1() {
        test(100.0, 80.0);
    }

    @Test
    public void test2() {
        test(150.0, 70.0);
    }


    @Test
    public void test3() {
        test(150.0, 150.0);
    }

    @Test
    public void test4() {
        test(150.0, 100.0);
    }

    @Test
    public void test5() {
        test(150.0, 50.0);
    }

    public void test(Double initialBalance, Double withdrawalAmount) {
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
