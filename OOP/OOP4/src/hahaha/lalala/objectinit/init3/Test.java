package hahaha.lalala.objectinit.init3;
//11 44 66 77 88 33 55 88 99 100

/*
类的初始化永远先于 实例初始化

类的初始化只执行一次
实例初始化调用几次构造器 就会执行几次


 */

public class Test {
    public static void main(String[] args) {
        new Son();

        System.out.println("---------------------");

        new Son();
    }
}
