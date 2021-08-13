package hahaha.lalala.string;

import org.junit.Test;

/*
正则表达式：
        正则：一门独立的语言
        js:
正则的目的：
    文本校验

 [] :代表匹配一个字符
 [ABC]:匹配单个A B C
 [A-Z]
 [0-9]
 \d:代表所有的数字
 \w:字母数字下划线

+： 一个或者多个
？：0个或者一个
*：0个或者多个
[\d]+  代表 匹配一个数字或者多个数字

n：数字：
{n}： 恰好重复n次
 [\d]{9}：
{n,} : 最少出现n次
{n,m}:  [n,m]

[^A]: 只要不是A 其他都可以

^: 代表以XXX开始
$:代表以XXX结束

^\d|\d$: 去除开头或者结尾的数字

 */
public class Method2 {

    @Test
    public void test05(){
        String str = "1Hello2World32java14atguigu5";
        //Hello2World3java4atguigu
        //去除开头和结尾的数字
        String s1 = str.replaceAll("^\\d|\\d$", "");
        System.out.println("s1 = " + s1);//Hello2World3java4atguigu
        //按照数字切割  Hello2World32java14atguigu
        String[] split = s1.split("\\d+");//无论有几个数字在一起 都只切一刀
        System.out.println(split.length);
        for (String s : split) {
            System.out.println(s);
        }
    }
    @Test
    public void test04(){
        String s1  ="B";
        boolean matches = s1.matches("[^A]");
        System.out.println("matches = " + matches);


    }



    @Test
    public void test03(){
        String s = "12699175106";
        boolean matches = s.matches("1[3587]\\d{9}");
        System.out.println("matches = " + matches);
    }

    @Test
    public void test01(){
        String s = "]";
    //    boolean b = s.matches("[a-zA-Z]");
        boolean b = s.matches("[\\w]");
        System.out.println(b);
    }

    @Test
    public void test02(){
        String s = "31";
        //boolean matches = s.matches("[0-9]");
        boolean matches = s.matches("[\\d]+");
        System.out.println("matches = " + matches);

    }


}
