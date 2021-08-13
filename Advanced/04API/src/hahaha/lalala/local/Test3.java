package hahaha.lalala.local;
import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*
将字符串转为日期对象
如果需要将字符串转为其他对象 需要调用对用的
LocalDate.parse()
LocalTime.parse()
LocalDateTime.parse()
 */
public class Test3 {
    public static void main(String[] args) {
        String s = "2021-10-22 19:09:08";
        //DateTimeFormatter formater = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        // DateTimeFormatter formater = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime parse = LocalDateTime.parse(s, formatter);
        System.out.println(parse);


    }
}
