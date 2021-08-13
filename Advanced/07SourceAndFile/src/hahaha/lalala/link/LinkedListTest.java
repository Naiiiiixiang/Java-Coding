package hahaha.lalala.link;

import org.junit.Test;

import java.util.LinkedList;

public class LinkedListTest {

    @Test
    public void test01(){
        //创建双链表对象
        LinkedList<String> list = new LinkedList<>();

        list.add("李白");
        list.add("杜甫");
        list.add("王安石");

        System.out.println(list);


       // System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName());

    }


}
