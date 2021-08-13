package hahaha.lalala.polys.poly2;
/*
多态：一个对象的多种形态
向上转型：
        1.有继承
        2.有方法重写
        3.父类的引用执向子类的对象(实例)

向上转型 对象能够调用的资源 分为 运行时 与 编译时：
         编译看左边  运行看右边    参照物是 =
          编译时   = 运行时
         编译时： 写完代码后
         运行时: 代码执行时
弊端：
        向上转型无法使用子类自己新增的方法

向下转型：





 */
public class Test {

    public static void main(String[] args) {
        // 动物      小猫
        Animal a = new Cat();
        a.eat();


        System.out.println("-----------------------------");

        Animal d = new Dog();
        d.eat();
        d.show();




    }
}
