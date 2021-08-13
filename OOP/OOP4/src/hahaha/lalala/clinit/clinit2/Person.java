package hahaha.lalala.clinit.clinit2;

public class Person {
    public static int num = getNum();
    public static int getNum()
    {
        System.out.println("Person  getNum()");
        return 10;
    }
    static {
        System.out.println("Person 静态代码块1");
    }
    public static int num1 = getNum();
    static {
        System.out.println("Person 静态代码块2");
    }
    Person(){
        System.out.println("无参构造器..........");
    }
}
class Son extends Person{
    public static int num = getNum1();
    static {
        System.out.println("Son 静态代码块1");
    }
    public static int getNum1() {
        System.out.println("Son  getNum1()");
        return 10;
    }
    static {
        System.out.println("Son 静态代码块2");
    }
}
