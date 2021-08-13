package hahaha.lalala.abstract2;

/*
抽象类：
    abstract class Animal();
抽象方法：
     abstract void eat();
    1.抽象类不能创建自己的对象
    2.抽象方法 规定子类必须做的行为
      一个类 继承了 抽象类 必须 重写抽象方法
                               或者 此类 也变为抽象类
    3.一个类继承了抽象类 那么 必须重写 所有的抽象方法 （父类的 爷爷类的...）
    4.抽象类中可以存在普通的方法 普通的变量 普通的构造器
    5.抽象方法 必须存在于抽象类中

 */
public abstract class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Animal() {
    }
    public void show(){
        System.out.println("this is Animal show()");
    }

    abstract void eat();
}

class Cat extends Animal{

    @Override
    void eat() {
        System.out.println("小猫吃鱼");
    }
}

abstract class Dog extends Animal{
    abstract void lookHome();
}

class SmallDog extends Dog{


    @Override
    void eat() {

    }

    @Override
    void lookHome() {

    }
}
