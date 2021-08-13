package hahaha.lalala.wrapper;

import java.util.ArrayList;
import java.util.List;

/*
两种数据类型：
    1.基本类型数据
    2.引用类型数据  对象
如何判断变量是不是对象？
     int num = 10;
        new Test().
   使用变量名. 能够调用出 Object中的相关内容 就是对象

为甚么学习包装类？
    基本类型的使用有局限性 有些位置不能使用
       1.泛型时不能使用
       2.不行的  jdk1.5 之后 jdk的新特性  自动装箱

包装类型： 将基本类型数据 包装为对用的引用数据类型
     byte   Byte
     short  Short
     int    Integer
     long   Long
     float Float
     double Double
     char   Character
     boolean  Boolean
 */
public class Test {
    public static void main(String[] args) {
       // List<Double> lits= new ArrayList<>();
     int b = 20;
     show(b);
    }
    public static void show(Object obj){
        System.out.println("6666666");
    }
}
