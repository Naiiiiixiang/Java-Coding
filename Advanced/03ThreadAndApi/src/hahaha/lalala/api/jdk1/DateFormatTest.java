package hahaha.lalala.api.jdk1;

import org.junit.Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日期格式化：
 * DateFormat
 * 日期对象 ---> 字符串
 * <p>
 * 将字符串---->日期对象
 */
public class DateFormatTest {
    @Test
    public void test04() throws ParseException {
        String s = "2080-1-1 0-0-0";

        String s1 = "2000-1-1 0-0-0";
        //先将 字符串--> Date
        DateFormat df = new SimpleDateFormat("yyyy-MM-DD hh-mm-ss");
        Date d1 = df.parse(s);
        Date d2 = df.parse(s1);
        //将日期转为毫秒数
        long l = d1.getTime() - d2.getTime();
        //2080 -2000 拿到毫秒的差值
        //将毫秒转为天
        long l1 = l / 1000 / 60 / 60 / 24;
        System.out.println(l1);
    }

    /**
     * 解析字符串时 保证 字符串的书写格式 与  日期格式化格式一致
     */
    @Test
    public void test03() throws ParseException {
        String s = "2021-11-1 10:2:23";
        //创建格式化对象
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

        //开始解析字符串
        Date date = df.parse(s);
        System.out.println(date.toLocaleString());
    }

    @Test
    public void test02() {
        //创建日期对象
        Date d = new Date();

        //创建日期格式化对象
        //  DateFormat df = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss E");
        DateFormat df = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        //对日期对象进行格式化
        String format = df.format(d);
        System.out.println("format = " + format);
    }

    @Test
    public void test01() {
        Date date = new Date();
        //2021年3月17日 16:31:31
        System.out.println("date.toLocaleString() = " + date.toLocaleString());


    }

}
