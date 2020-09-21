package com.Mockito.com.Offidal_doc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.List;

import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;

@RunWith(MockitoJUnitRunner.class)
public class StubbingVoidMethods_five {
    /**
     * doThrow()方法
     * 当使用.clear()方法的时候会抛出一个RuntimeException的异常
     */

    @Test
    public void return_exception_after_use_a_method(){
        List mockedList = mock(List.class);
        doThrow(new RuntimeException()).when(mockedList).clear();
        mockedList.clear();
    }

    /**
     * @return
     * java.lang.RuntimeException
     */
}
