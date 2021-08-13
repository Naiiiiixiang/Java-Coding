package hahaha.lalala.api.jdk1;

import org.junit.Test;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/**
 * Calendar 日历类
 */
public class CalendarTest {

    @Test
    public void test01() {
        //1.创建日历类对象
        /**
         time=1615968875652,areFieldsSet=true,areAllFieldsSet=true,
         lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Shanghai",
         offset=28800000,dstSavings=0,useDaylight=false,transitions=19,lastRule=null],
         firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2021,MONTH=2,
         WEEK_OF_YEAR=12,WEEK_OF_MONTH=3,DAY_OF_MONTH=17,DAY_OF_YEAR=76,
         DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=4,
         HOUR_OF_DAY=16,MINUTE=14,SECOND=35,MILLISECOND=652,ZONE_OFFSET=28800000,DST_OFFSET=0
         */
        //创建日历子类
        GregorianCalendar g = new GregorianCalendar();
        System.out.println(g);

        //2.创建日历类对象的方式二
        Calendar instance = Calendar.getInstance();
        System.out.println(instance);

    }

    /**
     * instance.get(属性);
     * 年
     * 月
     * 日
     */
    @Test
    public void test02() {
        Calendar instance = Calendar.getInstance();
        //获取相关的时间日期信息
        int i = instance.get(Calendar.YEAR);
        System.out.println(i);
        //月份从0开始
        int i1 = instance.get(Calendar.MONTH);
        System.out.println("i1 = " + i1);

        int i2 = instance.get(Calendar.HOUR);
        System.out.println("i2 = " + i2);


    }

    @Test
    public void test03() {

        Calendar instance = Calendar.getInstance();

        System.out.println("instance.get(Calendar.YEAR) = " + instance.get(Calendar.YEAR));
        System.out.println("instance.get(Calendar.MONTH) = " + instance.get(Calendar.MONTH));
        //设置当前时间
        /*
        日历对象.set(属性, 值);
         */
        instance.set(Calendar.YEAR, 2020);
        instance.set(Calendar.MONTH, 4);
        System.out.println("instance.get(Calendar.YEAR) = " + instance.get(Calendar.YEAR));
        System.out.println("instance.get(Calendar.MONTH) = " + instance.get(Calendar.MONTH));


    }

    @Test
    public void test04() {
        Calendar instance = Calendar.getInstance();
        System.out.println("instance.get(Calendar.DATE) = " + instance.get(Calendar.DATE));
        System.out.println("instance.get(Calendar.MONTH) = " + instance.get(Calendar.MONTH));
        /*
         instance.add(属性, 值);
         */
        instance.add(Calendar.DATE, 15);
        System.out.println("instance.get(Calendar.DATE) = " + instance.get(Calendar.DATE));
        System.out.println("instance.get(Calendar.MONTH) = " + instance.get(Calendar.MONTH));
    }


    @Test
    public void test05() {
        //获取全球时区
        String[] iDs = TimeZone.getAvailableIDs();
        for (String iD : iDs) {
            System.out.println(iD);
        }

    }

}
