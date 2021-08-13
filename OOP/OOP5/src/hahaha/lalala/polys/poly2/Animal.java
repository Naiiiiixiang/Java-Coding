package hahaha.lalala.polys.poly2;

public class Animal {

    void eat(){
        System.out.println("动物吃饭");
    }

    void show(){
        System.out.println("this is Animal show()");
    }
}

class Cat extends Animal{
    @Override
    void eat() {
        System.out.println("小猫爱吃鱼");
    }

    void catchMouse(){
        System.out.println("小猫 爱抓老鼠.......");
    }
}

class Dog extends Animal{
    @Override
    void eat() {
        System.out.println("小狗爱吃骨头.....");
    }
    void lookHome(){
        System.out.println("小狗爱拆家......");
    }
}
