package com.github.curriculeon.objectorientation.account;

import org.junit.Assert;
import org.junit.Test;

public class AccountSetIdTest {

    private void test(Long expectedId) {
        // given
        Account account = new Account();

        // when
        account.setId(expectedId);

        // then
        Assert.assertEquals(expectedId, account.getId());
    }

    @Test
    public void test1() {
        test(0L);
    }

    @Test
    public void test2() {
        test(10L);
    }

    @Test
    public void test3() {
        test(Long.MAX_VALUE);
    }

    @Test
    public void test4() {
        test(Long.MIN_VALUE);
    }
}
