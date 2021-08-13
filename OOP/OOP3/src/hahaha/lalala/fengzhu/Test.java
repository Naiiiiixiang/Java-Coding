package hahaha.lalala.fengzhu;
/*
当下的封装是对象属性的封装

public     所有的地方都可以访问
protected  本包下 以及 不同包下的子类可见 ****
default    本包下
private     本类下

 */
public class Test {
    public static void main(String[] args) {

        Person p1 = new Person();
        System.out.println(p1.sex);
        System.out.println(p1.age);
        System.out.println(p1.name);
    }
}
