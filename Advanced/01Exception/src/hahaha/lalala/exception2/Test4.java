package hahaha.lalala.exception2;

import org.junit.Test;

/**
 * 1.如果finally中存在return  那肯定执行finally中的return
 * 2. 当 finally中没有return时  返回 try 或者 catch内 有return的 当下值
 * 3.快捷方式 ctrl + alt + t
 */
public class Test4 {

    public static void main(String[] args) {


        int num = getNum();

        System.out.println("num = " + num);


        int[] arr = {};


    }

    @Test
    public void test01() {

        try {

        } finally {
            System.out.println(6666);
        }
    }

    private static int getNum() {
        int num = 10;

        int[] arr = new int[4];
        try {
            System.out.println("---->" + arr[6]);
            return num;
        } catch (Exception e) {
            num = 20;
            return num;
        } finally {
            num = 30;
            System.out.println("finally:--> " + num);
            // return 30;
        }
    }
}
