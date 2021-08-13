package hahaha.lalala.object;
/*
Object类是所有类的根父类

数组 的父类也是Object
如果一个类没有显示的继承另一个类 那么 此类默认继承自Object类
如何判断一个变量是否为对象？
    用变量名.数据
         出现了Object中的方法
 */
public class Test {
    public static void main(String[] args) {

        int num = 10;

        System.out.println("num = " + num);

        Person n1 = new Person();
        int[] arr = {};
        arr.hashCode();
        arr.toString();


    }
}
class Person{

}
