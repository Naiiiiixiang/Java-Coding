package hahaha.lalala.super1;

public class Cat extends Animal {
    String color;
    String sex;

    public Cat(int age, String name, String color, String sex) {
        this(color, sex);
    }


    public static void test(){

        //System.out.println(super.name);
    }


    public Cat(String color, String sex) {
        super();
        this.color = color;
        this.sex = sex;
    }

    public Cat() {
        super();
        System.out.println("Cat()");
    }
}
