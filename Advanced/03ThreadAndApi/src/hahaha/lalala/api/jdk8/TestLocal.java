package hahaha.lalala.api.jdk8;

import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;


public class TestLocal {


    @Test
    public void test01() {
        //年月日
        LocalDate now = LocalDate.now();
        System.out.println(now);
        //时分秒
        LocalTime time = LocalTime.now();
        System.out.println("time = " + time);
        //年月日 时分秒
        LocalDateTime l1 = LocalDateTime.now();
        System.out.println(l1);
    }

    @Test
    public void test02() {
        //获取指定的时间
        LocalDateTime time = LocalDateTime.of(2020, 2, 2, 2, 2, 2);
        System.out.println(time);
        //对日期修改后 不会对原有日期造成影响 会生成一个新的日期
        LocalDateTime plusDays = time.plusDays(-3);
        System.out.println("plusDays = " + plusDays);
        System.out.println("time = " + time);
    }

    @Test
    public void test03() {

        LocalDateTime time = LocalDateTime.now();
        //2021
        System.out.println("time.getYear() = " + time.getYear());
        Month month = time.getMonth();
        System.out.println(month);//MARCH
        //月份从 1 开始
        int value = month.getValue();
        System.out.println("value = " + value);

    }

    @Test
    public void test04() {
        //年月日
        LocalDate l = LocalDate.now();
        //判断是否为闰年
        boolean b = l.isLeapYear();
        boolean leapYear = LocalDate.of(2020, 2, 2).isLeapYear();
        System.out.println("leapYear = " + leapYear);

        System.out.println("b = " + b);


    }
}
