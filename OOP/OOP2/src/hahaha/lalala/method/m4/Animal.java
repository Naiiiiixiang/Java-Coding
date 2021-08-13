package hahaha.lalala.method.m4;

/*
    静态方法不能【直接】用用非静态的方法
    静态方法不能【直接】用用非静态的属性

   资源：属性和方法
    非静态方法可以直接使用 静态资源和非静态资源

    静态变量：类变量
    静态方法：类方法
    随着类的加载 会开辟空间



    普通方法： 实例（对象）方法
    普通变量： 实例（对象）变量

    创建对象后才会开辟空间



 */
public class Animal {

    String name = "Animal";
    static int age = 2;

    public static void s1() {
        // s2();
        // n1();
        //System.out.println(name);

        Animal animal = new Animal();
        //animal.name
        animal.n1();

    }

    public static void s2() {
    }

    public void n1() {
        s1();
        n2();
        System.out.println(name);
        System.out.println(age);

    }

    public void n2() {


    }
}
