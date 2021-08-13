package hahaha.lalala.objectinit.init2;

public class Person {
    {
        System.out.println("Person 成员代码块1  11");
    }
    String name = getName();
    public String getName() {
        System.out.println("Person getName() 22");
        return "李白";
    }
    String name1 = getName();
    {
        System.out.println("Person 成员代码块2 33");
    }
    Person(){
        super();
        System.out.println("无参构造器执行了 44");
    }
}
class Son extends Person{
    String name = getName();
    @Override
    public String getName() {
        System.out.println("Son getName() 55");
        return name;
    }
    {
        System.out.println("Son 成员代码块1 66");
    }
    int num = getNum();

    private int getNum() {
        System.out.println("Son getNum() 77");
        return 10;
    }
    public Son(){
        super();
        System.out.println("this is Son() 88");
    }
}
