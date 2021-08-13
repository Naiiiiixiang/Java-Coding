package hahaha.lalala.objectinit.init1;
/*
实例初始化：类中非静态成员变量赋值

实例初始化4个：
    1.super()

    2. 类中非静态成员变量显示赋值语句
    3. 非静态代码块
    4.构造器中的内容

注意：
    1.创建多次对象 实例初始化会执行多次
    2.实例初始化执行的方法 init()
 */
public class Test {

    public static void main(String[] args) {
        new Person();
        System.out.println("-----------------------");
        new Person();
    }
}
