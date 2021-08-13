package hahaha.lalala.link.statck;

import java.util.Deque;
import java.util.LinkedList;

public class Test {

    @org.junit.Test
    public void test01(){

        LinkedList<String> list;

        //模拟栈的操作  FILO
        Deque<String> statck = new LinkedList<>();
        //入栈
        statck.push("李白");
        statck.push("杜甫");
        statck.push("王安石");
        statck.push("李商隐");
        //获取栈顶元素
        String peek = statck.peek();
        System.out.println("peek = " + peek);
    }


    @org.junit.Test
    public void test02(){
        //模拟队列操作
        Deque<String> queue = new LinkedList<>();
        //入栈
        queue.add("李白");
        queue.add("杜甫");
        queue.add("王安石");
        queue.add("李商隐");
        //获取队头
        System.out.println("queue.peek() = " + queue.peek());
    }
}
