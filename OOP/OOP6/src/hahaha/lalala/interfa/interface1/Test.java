package hahaha.lalala.interfa.interface1;
/*
接口：用来表示 不同的事物 有着相同的功能/行为  是一种has a的关系

模拟超人  飞
小鸟  飞

如何声明接口？
    interface 接口的名字{}
如何实现接口？
新建一个类 implemens  接口的名字{
    重写 接口内的抽象方法
}
如何使用？
创建该类对象  通过对象调用方法即可

父类的引用  =  子类对象();
Fly f2 = new SuperMan();
注意：
    1.当一个类 实现了 一个接口 那么此类 可以看做是此接口的孩子

    2.在java中 继承关系 使用 实现  实现关系 使用的虚线
 */
public class Test {
    public static void main(String[] args) {
        Bird b = new Bird();
        b.flyAble();
        SuperMan superMan  = new SuperMan();
        superMan.flyAble();
        System.out.println("-------------------------------------------------------");
        Fly f1 = new Bird();
        f1.flyAble();
        Fly f2 = new SuperMan();
        f2.flyAble();
    }
}
