package com.github.curriculeon.objectorientation.bankaccount;

import org.junit.Assert;
import org.junit.Test;
import com.github.curriculeon.objectorientation.account.Account;
import com.github.curriculeon.objectorientation.account.BankAccount;
import com.github.curriculeon.objectorientation.account.Transactable;

/**
 * @author leon on 30/12/2018.
 */
public class BankAccountPolymorphismTest {
    Object bankAccount = new BankAccount();

    @Test
    public void test1() {
        Assert.assertTrue(bankAccount instanceof Transactable);
    }

    @Test
    public void test2() {
        Assert.assertTrue(bankAccount instanceof Account);
    }
}
