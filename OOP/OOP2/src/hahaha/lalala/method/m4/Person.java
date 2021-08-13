package hahaha.lalala.method.m4;

public class Person {
     String name;
     static int age;

    public static void show(){
        System.out.println("this is show()");
    }
    public static void aa(){
        show();
    }


    public void eat(){

        System.out.println("吃饭了 很开心");
    }

    public void sleep(){

        eat();
    }
}
