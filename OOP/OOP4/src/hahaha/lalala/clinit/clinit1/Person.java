package hahaha.lalala.clinit.clinit1;

public class Person {

    public static int num = getNum();

    public static int getNum() {
        return 10;
    }

    static {
        System.out.println("静态代码块1");
    }
    public static int num1 = 20;

    static {
        System.out.println("静态代码块2");
    }
    Person(){
        System.out.println("无参构造器..........");
    }
}