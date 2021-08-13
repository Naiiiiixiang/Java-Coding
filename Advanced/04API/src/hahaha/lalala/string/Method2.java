package hahaha.lalala.string;

import org.junit.Test;

public class Method2 {

    @Test
    public void test01() {
        //  String s;
        String s1 = null;
        String s2 = " ";
        //  System.out.println(s1.equals(""));
        System.out.println(s2.equals(""));
        System.out.println(s2.isEmpty());
    }

    @Test
    public void test02() {
        String s1 = "AB CD";
        System.out.println(s1);
        //length() 字符串内元素的个数
        System.out.println(s1.length());
    }

    @Test
    public void test03() {
        String s1 = "ABC";
        String s2 = "DEF";
        //字符串拼接
        String concat = s1.concat(s2);
        System.out.println("concat = " + concat);

    }

    @Test
    public void test04() {
        String s = "abcDefGh你好";
        //将所有的字母变为大写  只对字母有效
        String s1 = s.toUpperCase();
        System.out.println("s1 = " + s1);
        System.out.println("s = " + s);
        //将所有的字母变为小写  只对字母有效
        String s2 = s.toLowerCase();
        System.out.println("s2 = " + s2);

    }

    @Test
    public void test05() {
        String s1 = " AB   CD  ";
        System.out.println("--->" + s1 + "<---");
        //trim() 去除字符串两端的空格
        System.out.println("--->" + s1.trim() + "<---");

    }
}
