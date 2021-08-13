package hahaha.lalala.clinit.clinit1;
/*
<clinit>:类的初始化 编译器自动调用的方法
        会将 静态成员变量的显示赋值语句
            静态代码块中的 内容进行合并
 哪些操作会触发类的初始化：
     1.在当前类中调用main（）
     2.调用本类中的静态资源
     3.创建该类对象会触发
 */
public class Test {
    public static void main(String[] args) {
      //  System.out.println("Person.num = " + Person.num);


        new Person();
        Person.getNum();
    }
}
