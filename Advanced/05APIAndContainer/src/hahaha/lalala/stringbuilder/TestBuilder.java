package hahaha.lalala.stringbuilder;

import org.junit.Test;

/*
可变的字符序列
    StringBuilder
            父类是 AbstractStringBuilder
            底层采用char[] 数组存储数据  默认长度是 16
    StringBuffer
             父类是 AbstractStringBuilder
              底层采用char[] 数组存储数据  默认长度是 16

    区别：
        StringBuffer 线程安全的 所有的方法都是同步方法
                        效率低
                        jdk1.0
        StringBuilder 线程不安全的  效率高
                       jdk1.5



 */
public class TestBuilder {

    @Test
    public void test09() {
        StringBuilder builder = new StringBuilder("今天真开心啊明天放假了");

        builder.append("世界你好");

        System.out.println(builder);

    }
    @Test
    public void test08() {
        StringBuilder builder = new StringBuilder("今天真开心啊明天放假了");
        System.out.println("builder = " + builder);
        //内容反转
        builder.reverse();
        System.out.println("builder = " + builder);
    }
    @Test
    public void test07() {
        StringBuilder builder = new StringBuilder("今天真开心啊明天放假了");
        System.out.println("builder = " + builder);
        /*
        [startIndex,endIndex)
         builder.replace(startIndex, endIndex, "替换内容");
         */
        builder.replace(0, 5, "666");
        System.out.println("builder = " + builder);
    }

    @Test
    public void test06() {
        StringBuilder builder = new StringBuilder("今天真开心啊明天放假了");
        System.out.println("builder = " + builder);
        //设置指定位置的字符
        builder.setCharAt(0, '好');
        System.out.println("builder = " + builder);
    }


    @Test
    public void test05() {
        StringBuilder builder = new StringBuilder("今天真开心啊明天放假天了");
        /*
        存在返回下标
        不存在返回-1
         */
        int index = builder.indexOf("明天");
        System.out.println("index = " + index);
        /*
        存在返回下标
        不存在返回-1
         */
        int lastIndexOf = builder.lastIndexOf("天");

        System.out.println("lastIndexOf = " + lastIndexOf);
    }

    @Test
    public void test04() {
        StringBuilder builder = new StringBuilder("今天真开心啊明天放假了");
        System.out.println(builder);
        //在指定位置新增字符串
        builder.insert(6, "床前明月光");
        System.out.println(builder);
    }

    @Test
    public void test03() {
        StringBuilder builder = new StringBuilder("今天真开心啊明天放假了");
        System.out.println("builder = " + builder);
        //删除指定下标的字符
        // builder.deleteCharAt(2);
        // builder.delete(开始下标, 结束下标);[开始下标,结束下标)
        builder.delete(1, 5);
        System.out.println("builder = " + builder);


    }

    @Test
    public void test02() {
        StringBuilder builder = new StringBuilder("你好世界");
        int length = builder.length();
        System.out.println("length = " + length);
        System.out.println("--->" + builder);
        //改变builder的长度
        builder.setLength(20);
        length = builder.length();
        System.out.println("length = " + length);
        System.out.println("--->" + builder);
    }

    @Test
    public void test01() {

        StringBuilder builder = new StringBuilder();
    }
}
