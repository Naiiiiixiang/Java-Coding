package hahaha.lalala.innerclass4.test;

/*
匿名内部类的实现方式一：
     new 类(){}




 */
public class Test2 {
    static String  name = "Test2";
    int age  =10;

    public static void main(String[] args) {
        int num = 10;
        //创建了一个Person的匿名子类 并且完成了该匿名子类对象的创建
        new Person() {
        }.eat();
        new Person("李白", 20) {
        }.eat();

        new Animal() {
            @Override
            void eat() {
                System.out.println(name);
                System.out.println("小猫吃饭");
                System.out.println(num);
            }
        }.eat();

        new Fly() {
            @Override
            public void fly() {
                System.out.println("超人飞");
            }
        }.fly();


    }
}

interface Fly {
    void fly();
}

abstract class Animal {

    abstract void eat();
}

class Person {

    String name;
    int age;


    public void eat() {
        System.out.println(name + "Person eat");
    }

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

