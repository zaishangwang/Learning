package com.Mockito.com.Offidal_doc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.LinkedList;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class WhenMethod {
    @Test
    public void should_test_find_return(){
        LinkedList mockedList = mock(LinkedList.class);

        //为创建的链表赋值
        when(mockedList.get(0)).thenReturn("first");
        mockedList.add("second");
        when(mockedList.get(2)).thenReturn(new RuntimeException());

        //查看存了什么东西
        System.out.println(mockedList.get(0));
        System.out.println(mockedList.get(1));
        System.out.println(mockedList.get(2));

        //判断get方法是否被调用
        verify(mockedList).get(0);

        /**
         * @return
         * first
         * null
         * java.lang.RuntimeException
         */
    }
}
