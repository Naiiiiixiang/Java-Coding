package hahaha.lalala.enum1;

import hahaha.lalala.enum2.Season;

/*
枚举： 类型
        表示 某些类型的值仅有有限的几个
        性别：男  女
        月份：12
        星期： 星期一  到 星期日
枚举：jdk1.5新特性

jdk1.5之前


jdk1.5之后



 */
public class Test {
    public static void main(String[] args) {
        Gender man = Gender.MAN;
        Gender man1 = Gender.MAN;
        System.out.println(man==man1);


        Season spring = Season.SPRING;
        Season spring2 = Season.SPRING;

        System.out.println(spring==spring2);

        new Person();



    }
}
