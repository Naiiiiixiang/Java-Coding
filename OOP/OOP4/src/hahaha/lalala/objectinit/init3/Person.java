package hahaha.lalala.objectinit.init3;

public class Person {
   static int num = getNum();
    public static int getNum() {
        System.out.println("Person static getNum()  11");
        return 10;
    }
    String name =getName();

    public String getName() {
        System.out.println("Person getName()  22");
        return "李白";
    }
    {
        System.out.println("Person 成员代码块1  33");
    }
    static {
        System.out.println("Person static 静态成员代码块1  44");
    }
    Person(){
        super();
        System.out.println("Person   无参构造器  55");
    }
}
class Son extends Person{
    static int num = getNum();
    public static int getNum() {
        System.out.println("Son static getNum() 66");
        return 10;
    }
    static {
        System.out.println("son static 静态成员代码块 77");
    }
    String name = getName();
    public String getName() {
        System.out.println("Son getName() 88");
        return name;
    }
    {
        System.out.println("Son 成员代码块1 99");
    }
    Son(){
        super();
        System.out.println(this);
        System.out.println("Son  无参构造器  100");
    }
    //11 44 66 88 33 55 66 77 66 88 99 100
    //44 11 33 11 22 55 100 77 66 99 88
    //11 44 66 77 88 33 55 88 99 100  3
    //11 44 66 77 88 33 55 88 99 100
}
