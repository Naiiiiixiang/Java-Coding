package hahaha.lalala.local;

import org.junit.Test;

import java.security.acl.LastOwnerException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/*
对jdk1.8之后的日期进行格式化
日期对象-->字符串
预定义格式化
本地格式化
自定义格式化
 */
public class Test2 {
    @Test
    public void test03(){
        //获取当前时间
        LocalDateTime l = LocalDateTime.of(2020, 2, 2, 20, 2, 2);
        //自定义格式化
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss E");
        String format = formatter.format(l);
        System.out.println("format = " + format);

    }

    @Test
    public void test02(){

        //获取当前时间
        LocalDateTime l = LocalDateTime.now();
        //本地格式化
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);

        String format = formatter.format(l);

        System.out.println("format = " + format);


    }

    @Test
    public void test01(){
        //获取当前时间
        LocalDateTime l = LocalDateTime.now();
        //预定义格式化
        DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE;
        String format = formatter.format(l);
        System.out.println("format = " + format);


    }
}
