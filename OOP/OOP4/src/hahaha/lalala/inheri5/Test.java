package hahaha.lalala.inheri5;
//父亲的构造器不能继承
//super: 从父类继承的资源
public class Test {
    public static void main(String[] args) {
    //    Cat cat = new Cat("白色");

        Cat c1 = new Cat("小白", 2, '女', "白色");

        c1.name = "aa";
        String show = c1.show();

        System.out.println("show = " + show);
    }
}
