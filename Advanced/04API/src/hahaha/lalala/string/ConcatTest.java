package hahaha.lalala.string;

import org.junit.Test;

public class ConcatTest {
    /**
     * 字符串拼接：
     * 常量 + 常量 = 常量
     * 变量 + 变量 = 变量
     * 变量 + 常量 = 变量
     */
    @Test
    public void test01() {
        String s1 = "Hello";
        String s2 = "World";
        String s3 = "Hello" + "World";
        String s4 = s1 + s2;
        String s5 = "HelloWorld";
        String s6 = s1 + "World";
        System.out.println(s3 == s5);// true
        System.out.println(s4 == s5);// false
        System.out.println(s6 == s5);// false
    }

    /**
     * 字符串拼接：
     * 常量 + 常量 = 常量
     */
    @Test
    public void test02() {
        final String s1 = "Hello";
        final String s2 = "World";
        String s3 = "Hello" + "World";
        String s4 = s1 + s2;
        String s5 = "HelloWorld";
        String s6 = s1 + "World";
        System.out.println(s3 == s5);// true
        System.out.println(s4 == s5);// true
        System.out.println(s6 == s5);// true
    }

    @Test
    public void test03() {
        String s1 = "Hello";
        String s2 = "World";
        String s3 = "Hello" + "World";
        String s4 = s1 + s2;
        String s5 = "HelloWorld";
        String s6 = s1 + "World";
        System.out.println(s3 == s5);// true
        System.out.println(s4 == s5);// false
        System.out.println(s6 == s5);// false
        //将拼接的结果放到常量池内
        String intern = s4.intern();
        System.out.println("--->" + (intern == s5));
    }

    @Test
    public void test04() {
        String s = "你";

        for (int i = 0; i < 30; i++) {
            s += i;
            System.out.println(s);
        }
    }
}
