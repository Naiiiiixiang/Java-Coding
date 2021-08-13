package hahaha.lalala.super1;

public class Animal {
    int age = 10;
    String name = "旺财";
    public Animal(){
        System.out.println("Animal()");
    }

    public Animal(int age, String name) {
        System.out.println("Animal(int age, String name)");
        this.age = age;
        this.name = name;
    }

    public String getInfo() {
        return "名字是：" + name + "，年龄是：" + age;
    }
}

class Dog extends Animal {


    String name = "花花";
    String color = "花色";

    public void show() {
        System.out.println("name = " + super.name + ", age = " + age);
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ",颜色是：" + color;
    }
}
