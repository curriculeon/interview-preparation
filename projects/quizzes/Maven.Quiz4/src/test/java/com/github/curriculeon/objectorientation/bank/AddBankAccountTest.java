package com.github.curriculeon.objectorientation.bank;

import org.junit.Assert;
import org.junit.Test;
import com.github.curriculeon.objectorientation.account.Bank;
import com.github.curriculeon.objectorientation.account.BankAccount;

public class AddBankAccountTest {
    @Test
    public void test1() {
        // given
        Bank bank = new Bank();
        BankAccount bankAccount = new BankAccount();
        Assert.assertFalse(bank.containsBankAccount(bankAccount));

        // when
        bank.addBankAccount(bankAccount);

        // then
        Assert.assertTrue(bank.containsBankAccount(bankAccount));
    }
}
