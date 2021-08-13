package hahaha.lalala.innerclass1;
/*
类的成员：
属性
    普通属性
    静态属性
方法
    普通方法
    静态方法
构造器

代码块
    普通代码块
    静态代码块

内部类：
    在一个类的内部在写一个类 内部类
    1.普通成员内部类  普通属性  ***

    2.静态成员内部类  静态属性  *****  查看源码

    3.局部内部类    局部变量

    4.匿名内部类   匿名对象 参照  ******
 */
public class Test {
    public static void main(String[] args) {

       /* new Person().outerMether1();

        Integer.valueOf(20);*/

        Person.Inner inner = new Person().new Inner();
        inner.show();
        //创建外部类对象
        Person p1 = new Person();
        //再通过外部类对象new  内部类对象
        Person.Inner inner1 = p1.new Inner();

        inner1.showName();

    }
}
