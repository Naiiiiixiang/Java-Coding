package hahaha.lalala.exception1;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Error:
 * OutOfMemoryError
 * StackOverflowError
 * 演示常见异常 Exception
 * 运行时异常：
 * ArrayIndexOutOfBoundsException 数组下标越界
 * ArithmeticException  算数/数学异常异常  除数为0
 * NullPointerException 空指针异常
 * NumberFormatException  数字格式化异常
 * ClassCastException  类型转换异常
 * InputMismatchException  输入不匹配异常
 * 编译异常：  写完代码就报错
 * IOException io流异常
 * InterruptedException  线程被打断异常
 */
public class Test2 {

    public static void main(String[] args) throws InterruptedException {


        Thread.sleep(20);

    }

    @Test
    public void test09() {
        //-Deditable.java.test.console=true
        Scanner in = new Scanner(System.in);
        System.out.println("请您输入一个数字");
        int i = in.nextInt();
        System.out.println(i);

    }

    @Test
    public void test08() throws FileNotFoundException {

        new FileInputStream("\"C:\\Users\\user\\Desktop\\exception.png\"");


    }

    @Test
    public void test07() {
        Animal a = new Dog();

        Cat c = (Cat) a;


    }

    @Test
    public void test06() {

        String s = "1a";
        int i = Integer.parseInt(s);


    }

    @Test
    public void test05() {

        String s = null;
        String s1 = "你好";
        boolean equals = s.equals(s1);
        System.out.println(equals);
    }

    @Test
    public void test03() {
        int[] arr = {10, 20};
        System.out.println(arr[3]);
    }

    @Test
    public void test04() {
        int s = 10 / 0;
        System.out.println(s);
    }


    @Test
    public void test01() {
        //com.atguigu.exception1.Test2
        int[] arr = new int[Integer.MAX_VALUE];

    }

    @Test
    public void test02() {

        int sum = getSum(10000);

        System.out.println("sum = " + sum);

    }

    private int getSum(int i) {
        if (i == 1) {
            return 1;
        }
        return i + getSum(i - 1);
    }


}

class Animal {
}

class Dog extends Animal {

}

class Cat extends Animal {

}