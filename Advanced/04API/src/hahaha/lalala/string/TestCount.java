package hahaha.lalala.string;

import org.junit.Test;

public class TestCount {

    @Test
    public void test01() {
        //  String s1 = "你好";
        String s2 = new String("世界");
    }

    @Test
    public void test02() {
//        String s;
//
//        String s = null;
//
//        String s = "";
//
//        String s = new String();
//
//        String s = new String("");
//
//        String s = "abc";
//
//        String s = new String("abc");
//
//        char[] arr = {'a','b'};
//        String s = new String(arr);
        char[] arr = {'a', 'b', 'c', 'd', 'e'};
        String s = new String(arr, 0, 3);


        System.out.println(s);


    }
}
