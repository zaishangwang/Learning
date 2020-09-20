package com.Mockito.com.lesson03;

import com.Mockito.com.Account;
import com.Mockito.com.AccountDao;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Answers;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class MockByAnnotationTest {
    @Before
    public void setUp(){
        MockitoAnnotations.initMocks(this);
    }

    @Mock(answer = Answers.RETURNS_SMART_NULLS)
    private AccountDao accountDao;

    @Test
    public void testMock(){
        Account account = accountDao.findAccount("x","x");
        System.out.println(account);
    }
}
