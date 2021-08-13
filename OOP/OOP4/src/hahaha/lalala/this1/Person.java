package hahaha.lalala.this1;

import java.sql.SQLOutput;

public class Person {

    String name;
    int age;
    String sex;

    public Person(){
        this("安琪拉",20);
    }

    public Person(String name, int age, String sex) {
      /*  this.name = name;
        this.age = age;*/
        this(name,age);
        System.out.println(666);
        this.sex = sex;
    }
    public Person(String name, int age){
       // System.out.println("构造器内："+this);
        this.age = age;
        this.name = name;
    }

    public void eat(){
        System.out.println(this.name);
    }
    public void show(){
        System.out.println("名字是："+name+"，年龄是："+this.age+"，性别是"+sex);

       // this.eat();
    }
}
