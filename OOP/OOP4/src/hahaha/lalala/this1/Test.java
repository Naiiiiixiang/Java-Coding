package hahaha.lalala.this1;
/*
this:代指当前对象  当前对象是谁
                   谁调用就是谁
      可以调用成员变量
      可以调用成员方法
      this()调用本类中的构造器
          一般是多参调少参
          少参调用多参 常见于 源码
           当使用this调用构造器时 必须 放在 构造器首行
 */
public class Test {
    public static void main(String[] args) {
        Person p2 = new Person();

        p2.show();
        System.out.println("---------------------------");

        Person p1 = new Person("李白", 20);
      //  System.out.println("main():"+p1);
        p1.show();

       /* Person p2 = new Person("杜甫", 30);

        p2.show();*/

        Person person = new Person("王安石", 20, "男");

        person.show();

    }
}
