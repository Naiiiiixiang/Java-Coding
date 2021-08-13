package hahaha.lalala.clinit.clinit2;

/*
<clinit>:类的初始化 编译器自动调用的方法
        会将 静态成员变量的显示赋值语句
            静态代码块中的 内容进行合并
 哪些操作会触发类的初始化：
     1.在当前类中调用main（）
     2.调用本类中的静态资源
     3.创建该类对象会触发
     4.调用子类中的静态资源 会导致父类初识化

 注意：
    1.子类使用从父类继续的静态资源时 不会导致子类初始化
    2.父子类进行类的初始化 也只是调用一个 <clinit>方法
       将父子类中的 静态成员变量的显示赋值语句
        静态代码块中的 内容进行合并

 */
public class Test {
    public static void main(String[] args) {
      //  System.out.println("Person.num = " + Person.num);
    //    Son.getNum();
        Son.getNum1();
        System.out.println("-------------------");
        //Son.getNum1();
    }
}
