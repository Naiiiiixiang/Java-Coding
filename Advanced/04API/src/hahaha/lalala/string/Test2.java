package hahaha.lalala.string;

import org.junit.Test;

/**
 * 创建字符串对象的方式
 * 1.构造器
 * 2.静态方法
 * 3. +
 */
public class Test2 {
    @Test
    public void test03() {
        int a = 10;
        int b = 20;
        System.out.println(a + "+" + b);
    }

    @Test
    public void test02() {
        int i = 1;
        //重载的方法
        String s = String.valueOf(i);
        System.out.println("s = " + s);
        char[] cs = {'A', 'B', 'C'};
        String s1 = String.copyValueOf(cs);
        System.out.println("s1 = " + s1);
    }

    @Test
    public void test01() {

        String s = new String();
        String s2 = new String("你好");
        byte[] bs = {97, 98, 99, 100};
        String s3 = new String(bs);
        System.out.println("s3 = " + s3);//s3 = abcd
        /*
        new String(字节数组, 开始下标, 长度);
         */
        String s6 = new String(bs, 2, 2);
        System.out.println(s6);//cd

        char[] cs = {'A', 'B', 'C'};
        String s4 = new String(cs);
        /*
        new String(char[], 开始下标, 数量)
         */
        System.out.println("new String(cs, 2, 2) = " + new String(cs, 1, 2));
        System.out.println("s4 = " + s4);//s4 = ABC

    }
}
