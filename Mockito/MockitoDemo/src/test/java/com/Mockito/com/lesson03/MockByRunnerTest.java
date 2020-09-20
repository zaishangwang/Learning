package com.Mockito.com.lesson03;

import com.Mockito.com.Account;
import com.Mockito.com.AccountDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.mock;

@RunWith(MockitoJUnitRunner.class)
public class MockByRunnerTest {
    @Test
    public void testMock(){
        AccountDao accountDao = mock(AccountDao.class, Mockito.RETURNS_SMART_NULLS);
        Account account = accountDao.findAccount("x","x");
        System.out.println(account);
    }
}
