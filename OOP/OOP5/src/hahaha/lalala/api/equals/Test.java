package hahaha.lalala.api.equals;
/*
比较两个对象：
    ==： 比较的是两个对象的地址值

equals():
    没有重写，调用的是Object类中的equals() 比较的是地址值
    想要实现 对象的属性值完全一样 返回true 那么需要重写 equals()
 */
public class Test {

    public static void main(String[] args) {

        //创建一个对象
        Person p1 = new Person("李白", 20);
        Person p4 = new Person("李白", 20);

        Person p2 = null;

        Person p3 = p1;

        p1.equals(p3);

        System.out.println(p1 == p2);//false
        System.out.println(p1 == p3);//true
        System.out.println(p1 == p4);//false

        boolean b = p1.equals(p4);

        System.out.println("b = " + b);//flase


    }
}
