package hahaha.lalala.clone;
/*
如何克隆

1.实现接口 Cloneable

2.重写 Object类中的  clone();

3.用想要克隆的对象 调用 clone();
 */
public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {

        Person p1 = new Person("李白", 20);
        System.out.println("p1 = " + p1);

        Person p3 = p1;
        p3.name = "王安石";

        System.out.println("p1 = " + p1);
        System.out.println("p3 = " + p3);

        System.out.println("--------------------------------");

        Person p2 = new Person("李白", 20);
        System.out.println("p2 = " + p2);
        Object clone = p2.clone();
        System.out.println(p2==clone);
        System.out.println("clone = " + clone);


    }

}
