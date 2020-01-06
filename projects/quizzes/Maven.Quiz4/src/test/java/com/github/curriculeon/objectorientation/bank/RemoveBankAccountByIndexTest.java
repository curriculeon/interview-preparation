package com.github.curriculeon.objectorientation.bank;

import org.junit.Assert;
import org.junit.Test;
import com.github.curriculeon.objectorientation.account.Bank;
import com.github.curriculeon.objectorientation.account.BankAccount;

public class RemoveBankAccountByIndexTest {
    @Test
    public void test1() {
        // given
        Bank bank = new Bank();
        BankAccount bankAccount = new BankAccount();
        bank.addBankAccount(bankAccount);
        Assert.assertTrue(bank.containsBankAccount(bankAccount));

        // when
        bank.removeBankAccountByIndex(0);

        // then
        Assert.assertFalse(bank.containsBankAccount(bankAccount));
    }

    @Test
    public void test2() {
        // given
        Bank bank = new Bank();
        BankAccount bankAccount1 = new BankAccount();
        BankAccount bankAccount2 = new BankAccount();

        bank.addBankAccount(bankAccount1);
        bank.addBankAccount(bankAccount2);

        Assert.assertTrue(bank.containsBankAccount(bankAccount1));
        Assert.assertTrue(bank.containsBankAccount(bankAccount2));

        // when
        bank.removeBankAccountByIndex(1);

        // then
        Assert.assertTrue(bank.containsBankAccount(bankAccount1));
        Assert.assertFalse(bank.containsBankAccount(bankAccount2));
    }


    @Test
    public void test3() {
        // given
        Bank bank = new Bank();
        BankAccount bankAccount1 = new BankAccount();
        BankAccount bankAccount2 = new BankAccount();
        BankAccount bankAccount3= new BankAccount();

        bank.addBankAccount(bankAccount1);
        bank.addBankAccount(bankAccount2);
        bank.addBankAccount(bankAccount3);

        Assert.assertTrue(bank.containsBankAccount(bankAccount1));
        Assert.assertTrue(bank.containsBankAccount(bankAccount2));
        Assert.assertTrue(bank.containsBankAccount(bankAccount3));

        // when
        bank.removeBankAccountByIndex(2);

        // then
        Assert.assertTrue(bank.containsBankAccount(bankAccount1));
        Assert.assertTrue(bank.containsBankAccount(bankAccount2));
        Assert.assertFalse(bank.containsBankAccount(bankAccount3));
    }
}
