package hahaha.lalala.init;
/*
成员变量的初识化方式：
1.默认初始化
    byte short int long 0
    float double  0.0
    boolean false
    char \u0000
    引用类型数据  null  String  数组  类
2.显示赋值
    成员变量后直接写值
    int age  =20;
3.构造器赋值
     public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
4.代码块
      {}：代码块
    静态代码块： *****
     static {}
     作用： 给静态成员变量赋值
           可以将进行初始化内容放到静态代码块内
      注意： 无论创建几次对象 静态代码块都只执行一次

   成员代码块: *
      类中方法外  成员变量位置一致
      给成员变量赋值
      注意： 创建几次对象 成员代码块就会执行几次

 */
public class TestPerson {
    public static void main(String[] args) {
        new Student();
        System.out.println("---------------------");
        new Student();
        System.out.println("---------------------");
        new Student();

    }
}
