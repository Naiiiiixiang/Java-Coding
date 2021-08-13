package hahaha.lalala.oop2;

import hahaha.lalala.oop1.Person;

/*
当一个java类中 使用了两个同名资源

一个使用导入的方式

另一个使用【全类名/全路径名】的方式 创建

全类名/全路径名:包名+类名

 */
public class Test {
    public static void main(String[] args) {

        Person p1 = new Person();
        System.out.println(p1.name);
        System.out.println("-------------------------------------");
        hahaha.lalala.oop2.Person p2 = new hahaha.lalala.oop2.Person();
        System.out.println(p2.name);

    }
}
