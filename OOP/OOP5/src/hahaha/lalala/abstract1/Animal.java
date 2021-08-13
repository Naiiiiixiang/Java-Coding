package hahaha.lalala.abstract1;

public class Animal {

    String name;
    int age;

    void eat(){
        System.out.println("动物吃饭");
    }
}
class Cat extends Animal{

    @Override
    void eat() {
        System.out.println("吃鱼。。。。。");
    }
}
class Dog extends Animal{
    @Override
    void eat() {
        System.out.println("吃肉。。。。");
    }
}
