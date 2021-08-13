package hahaha.lalala.api.jdk1;

import org.junit.Test;

import java.util.Date;

/**
 * Date : 日期 时间
 */
public class DateTest {
    @Test
    public void test01() {
        //当前时间
        Date date = new Date();
        System.out.println(date);
        //距离1900年的整年数
        int year = date.getYear();
        System.out.println(year + 1900);
        //0 代表一月
        System.out.println("date.getMonth() = " + date.getMonth());
        //0 是星期日
        System.out.println("date.getDay() = " + date.getDay());
    }

    @Test
    public void test02() {

        long l = System.currentTimeMillis();

        System.out.println(l);//1615968416563
        //记住
        Date date = new Date(1615968416563L);

        System.out.println("date = " + date);
        Date date1 = new Date();
        System.out.println("date1 = " + date1);

    }

    @Test
    public void test03() {

        Date d = new Date();
        System.out.println("d = " + d);
        //将日期 使用喜欢的格式输出
        String s = d.toLocaleString();//2021-3-17 16:09:49
        System.out.println("s = " + s);
        //将时间转为 毫秒值
        long time = d.getTime();
        System.out.println(time);//1615968657067
    }

}
