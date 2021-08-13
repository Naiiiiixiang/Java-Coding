package hahaha.lalala.objectinit.init1;

public class Person {

    {
        System.out.println("Person 成员代码块1");
    }

    String name = getName();
    private String getName() {
        System.out.println("Person getName()");
        return "李白";
    }

    String name1 = getName();
    {
        System.out.println("Person 成员代码块2");
    }
    Person(){
        super();
        System.out.println("无参构造器执行了");
    }

}
