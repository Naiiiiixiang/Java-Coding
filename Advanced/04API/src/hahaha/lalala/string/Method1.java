package hahaha.lalala.string;

import org.junit.Test;

public class Method1 {

    @Test
    public void test01() {
        String s = "你好";
        String s1 = "你好";
        System.out.println(s == s1);
        String s2 = new String("你好");
        System.out.println(s1 == s2);
        //比较字符串内容
        boolean equals = s.equals(s2);
        System.out.println("equals = " + equals);
    }

    @Test
    public void test02() {
        String a = "Ab";
        String b = "aB";
        boolean b2 = a.equals(b);
        System.out.println("b2 = " + b2);
        //忽略大小写的比较
        boolean b1 = a.equalsIgnoreCase(b);
        System.out.println("b1 = " + b1);
    }

    @Test
    public void test03() {
        String s1 = "A";// 65
        String s2 = "C";// 67
        int i = s1.compareTo(s2);
        System.out.println(i);
        String s3 = "c";
        //比较的是 编码值
        int i1 = s3.compareTo(s2);
        System.out.println("i1 = " + i1);
        int i2 = s3.compareToIgnoreCase(s2);
        System.out.println("i2 = " + i2);
    }
}
