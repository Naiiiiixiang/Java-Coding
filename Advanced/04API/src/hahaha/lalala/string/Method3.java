package hahaha.lalala.string;

import org.junit.Test;

import java.util.Arrays;

public class Method3 {

    @Test
    public void test08() {
        String ss = "AAAAAAAAAABBBBBBBBCCCCCCDDDDDccD";
        //获取所有可能出现的字母

        for (char a = 'A'; a <= 'z'; a++) {
            //记录每一个字母出现的次数
            int count = 0;
            for (int i = 0; i < ss.length(); i++) {
                if (a == ss.charAt(i)) {
                    //出现一次 次数+1
                    count++;
                }
            }
            //次数不为0才能出现
            if (count != 0) {
                System.out.println(a + "出现了 " + count + " 次");
            }
        }
        //所有的字母 范围  65A  122z
        //System.out.println((int) 'z');
    }

    @Test
    public void test07() {
        //将出现一次的字符添加到字符串内  indexOf  lastIndexOf
        String s4 = "";
        String s3 = "ABCD";
        String ss = "AAAAAAAAAABBBBBBBBCCCCCCDDDDDD";
        // String ss1 = "ery7udusajd90sajd你好sa9uokdsadc,mdsalkm你好pwqopekopwqe";
    }

    @Test
    public void test06() {
        String s = "ABCDEFGH";
        // 判断字符串以XXX开始
        boolean a = s.startsWith("A1");
        System.out.println("a = " + a);
        // 判断字符串以XXX结束
        boolean gh = s.endsWith("GH");
        System.out.println("gh = " + gh);
    }

    @Test
    public void test05() {
        String s = "ABCDEFGH";
        //将字符串转为数组
        char[] chars = s.toCharArray();
        System.out.println(Arrays.toString(chars));

    }


    @Test
    public void test04() {
        String s = "ABCDEFGH";
        //截取从指定下标一直到字符串末尾的所有内容
        String substring = s.substring(1);
        System.out.println("substring = " + substring);
        /*
        [开始下标，结束下标)
        s.substring(开始下标, 结束下标);
         */
        String substring1 = s.substring(1, 4);
        System.out.println("substring1 = " + substring1);
    }


    @Test
    public void test03() {
        String s = "ABCDEFGH";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            System.out.println(c);
        }
    }

    @Test
    public void test02() {
        String s = "ABCDEFGH";
        //获取指定位置的字符
        char c = s.charAt(0);
        System.out.println("c = " + c);


    }


    @Test
    public void test01() {


        String s = "ABCDCECF";
        //判断指定的字符串 是否在原有字符串内出现过
        boolean b = s.contains("B1");
        System.out.println("b = " + b);
        //字符串存在下标 从 0开始
        //查看指定字符第一次出现的下标
        //当不存在此字符串时返回-1
        int c = s.indexOf("C111");
        System.out.println(c);

        //查看指定字符最后一次出现的下标
        //当不存在此字符串时返回-1
        int c1 = s.lastIndexOf("C2222");
        System.out.println("c1 = " + c1);
    }


}
