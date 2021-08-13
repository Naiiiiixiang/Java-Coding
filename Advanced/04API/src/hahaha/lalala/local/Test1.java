package hahaha.lalala.local;

import org.junit.Test;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class Test1 {
    /*
    计算日期间隔
     */
    @Test
    public void test01() {
        //获取当前时间
        LocalDate now = LocalDate.now();
        LocalDate localDate = LocalDate.of(2020, 2, 18);
        Period period = Period.between(localDate, now);
        //P1Y1M1D
        System.out.println(period);
        System.out.println("period.getYears() = " + period.getYears());
        System.out.println("period.getMonths() = " + period.getMonths());
        System.out.println("period.getDays() = " + period.getDays());
        System.out.println("period.toTotalMonths() = " + period.toTotalMonths());
    }

    //获取 时间间隔
    @Test
    public void test02() {
        //当前日期
        LocalDateTime now = LocalDateTime.now();
        //指定日期
        LocalDateTime time = LocalDateTime.of(2021, 1, 1, 0, 0, 0);
        Duration duration = Duration.between(time, now);
        //31 28  19
        //两个时间差多少天
        System.out.println("duration.toDays() = " + duration.toDays());
       //两个时间差多小时
        System.out.println("duration.toHours() = " + duration.toHours());
        //两个时间差多少分钟
        System.out.println("duration.toMinutes() = " + duration.toMinutes());
        //两个时间差多少毫秒
        System.out.println("duration.toMillis() = " + duration.toMillis());
    }
}
