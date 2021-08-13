package hahaha.lalala.polys.poly5;
/*
方法的向上转型： 可以使用子类重写父类的方法 以及 子类从父类继承的资源
想要使用子类自己的属性必须完成向下转型才可以
 */
public class Test {
    public static void main(String[] args) {

        Animal ani = new Cat();
        ani.eat();
        System.out.println(ani.name);



        Cat c = (Cat)ani;
        System.out.println("c.name = " + c.name);

    }
}
