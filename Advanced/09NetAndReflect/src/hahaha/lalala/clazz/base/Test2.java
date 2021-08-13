package hahaha.lalala.clazz.base;

public class Test2 {

    public static void main(String[] args) throws ClassNotFoundException {
      //  Class<?> aClass = Class.forName("com.atguigu.clazz.base.Person");
       // new Son();
      //  Son.show();

       // System.out.println(Son.num);
        Person[] ps = new Person[3];

    }
}

class Person{
    static {
        System.out.println("Person被加载了");
    }

    public static void show(){

        System.out.println("Person show()");
    }
}

class Son extends Person{
    final  static int  num = 200;

    static {
        System.out.println("Son 被加载了");
    }
}