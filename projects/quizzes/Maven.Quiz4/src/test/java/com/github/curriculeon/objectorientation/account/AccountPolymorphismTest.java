package com.github.curriculeon.objectorientation.account;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author leon on 30/12/2018.
 */
public class AccountPolymorphismTest {
    private Object account = new Account();
    @Test
    public void test1() {
        Assert.assertFalse(account instanceof Transactable);
    }

    @Test
    public void test2() {
        Assert.assertFalse(account instanceof BankAccount);
    }
}
