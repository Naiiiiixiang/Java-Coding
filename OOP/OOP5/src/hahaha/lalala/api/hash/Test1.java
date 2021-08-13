package hahaha.lalala.api.hash;
/*
hashCode:返回当前对象的hash码
hashCode：可以作为对象的唯一标识

     hash码不一样 对象肯定不一样
     hash码一样 对象也可能不同

在java中 当两个对象的属性完全相同时  就认为 这两个对象为同一个对象
 重写hashcode() 让 拥有相同属性的对象 返回 相同的hash码
 集合： HashMap
 */
public class Test1 {
    public static void main(String[] args) {

        Person p1 = new Person("李白", 20);
        Person p2 = new Person("杜甫", 30);
        System.out.println("p1.hashCode() = " + p1.hashCode());
        System.out.println("p2.hashCode() = " + p2.hashCode());
        System.out.println("BB\".hashCode() = " + "BB".hashCode());
        System.out.println("\"Aa\".hashCode() = " + "Aa".hashCode());

        System.out.println("--------------------------------------------");

        Person p3 = new Person("李白", 20);

        System.out.println("p3.hashCode() = " + p3.hashCode());


    }
}
