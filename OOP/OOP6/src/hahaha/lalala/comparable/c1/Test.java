package hahaha.lalala.comparable.c1;

/*
需求：比较两个对象谁大
    在比较对象时需要指定比较的条件  分数  年龄  薪水......

java 内部提供了一个比较的接口 Comparable接口 用于对象比较

使用方式：
    1.让比较对象的类型实现 Comparable接口

    2.重写抽象方法 制定 比较规则

    3.进行比较获取结果
        当结果是
       >0: 第一个对象大于第二个对象
        ==0： 两个对象相等
        <0: 第一个对象小于第二个对象

     Double.compare(this.score, p.score); 比较double类型的值

   新建一个 Student   名字 年龄   分数
   创建三个对象  存到 数组内  要求 按照  年龄排序
   使用 Comparable接口实现
 */
public class Test {
    public static void main(String[] args) {

        Person p1 = new Person("李白", 20, 99.6);
        Person p2 = new Person("李四", 21, 99.4);
        int c = p1.compareTo(p2);

        System.out.println("c = " + c);



    }
}
