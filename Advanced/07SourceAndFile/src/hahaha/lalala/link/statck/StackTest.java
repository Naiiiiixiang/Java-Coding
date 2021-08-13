package hahaha.lalala.link.statck;

import org.junit.Test;

import java.util.Stack;
/*
FILO
 */

public class StackTest {
    @Test
    public void test01(){

        //模拟栈的操作
        Stack<String> s = new Stack<>();
        //入栈
        s.add("李白");
        s.add("杜甫");
        s.add("王安石");
        s.add("李商隐");
        //获取栈顶元素
        System.out.println("s.peek() = " + s.peek());
        //弹栈
        s.pop();
        //获取栈顶元素
        System.out.println("s.peek() = " + s.peek());


    }



    //jvm
    public static void main(String[] args) {
        show();
    }
    private static void show() {
        test();
    }
    private static void test() {
        test1();
    }
    private static void test1() {
    }
}
