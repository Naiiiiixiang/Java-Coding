package hahaha.lalala.string;

import org.junit.Test;

public class Method1 {


    @Test
    public void test01(){
        String s = "ABCDA";
        //替换指定内容
        String replace = s.replace("A", "你好");
        System.out.println("replace = " + replace);
    }

    @Test
    public void test02(){
        String s  ="A,B,C,D,E";
        String[] split = s.split(",");
        for (String s1 : split) {
            System.out.println(s1);
        }
    }

    @Test
    public void test03(){
        String s = "A1BB2Cc3DD4YY";
        String[] split = s.split("\\d");
        for (String s1 : split) {
            System.out.println(s1);
        }
    }
}
