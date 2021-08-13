package hahaha.lalala.polys.poly4;

public class Animal {
    void eat(){
        System.out.println("动物吃饭");
    }
}

class Cat extends Animal{
    void catchMouse(){
        System.out.println("小猫抓老鼠");
    }
    @Override
    void eat() {
        System.out.println("小猫吃鱼");
    }
}
class Dog extends Animal{
    void lookHome(){
        System.out.println("小狗看家");
    }
    @Override
    void eat() {
        System.out.println("小狗吃肉");
    }
}