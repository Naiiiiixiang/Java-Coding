package hahaha.lalala.init;

public class Person {

    String name;
    static String country;

    int age = 20;
    static String color = "白色";

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Student {
    static int age;
    String name;
    {
        System.out.println("成员代码块11111");
    }
    static {
      //  name = "";
        age = 20;
        System.out.println("静态代码块一");
    }
    {
            name = "李白";
            age = 666;
        System.out.println("成员代码块执行了2222222");
    }
    Student(){
        System.out.println("无参构造器");
    }
    static {
        age = 20;
        System.out.println("静态代码块二");
    }
}
