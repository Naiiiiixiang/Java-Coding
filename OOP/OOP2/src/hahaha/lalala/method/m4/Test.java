package hahaha.lalala.method.m4;
/*
方法根据静态修饰符分为两类：
  1.静态方法
     不同类中 通过类名.方法名调用
     在本类中 可以省略类名直接调用
  2.非静态方法
    不同类中 必须通过对象名.方法名调用
    在本类中 可以省略对象名直接调用



 */
public class Test {
    public static void main(String[] args) {
        Person.show();
        Person.age = 20;
        System.out.println("------------------------------");
        Person p1 = new Person();
        p1.eat();
    }
}
