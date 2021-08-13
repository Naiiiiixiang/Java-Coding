package hahaha.lalala.polys.poly3;

public class Animal {
    void eat(){
        System.out.println("吃饭");
    }
}

class Cat extends Animal{

    @Override
    void eat() {
        System.out.println("小猫吃鱼");
    }
}
class Dog extends Animal{
    void eat(){
        System.out.println("小狗吃骨头");
    }
}
