package hahaha.lalala.oop4;

/*
静态成员变量 与普通成员变量的区别
1.声明方式不同
      普通成员变量： 数据类型 变量名
      静态成员变量： static 数据类型 变量名

2.调用方式不同
     普通成员变量： 对象名.属性名
     静态成员变量： 对象名.属性名
                   类名.属性名
3.在内存中的分数不同
     普通成员变量： 每创建一个对象 就会开辟一块内存
     静态成员变量： 只会开辟一块空间 所有的对象共享

4.生命周期
     生命的开始：
           普通成员变量：需要创建对象 才会开辟空间
           静态成员变量： 随着类的加载而加载
      生命的结束：
          普通成员变量：没有对象引用时 等待垃圾回收器回收
          静态成员变量：随着类的卸载而卸载

 */


public class TestStudent {
//jvm
    public static void main(String[] args) {


       // int c

        //类名.静态成员变量
        Student.classNo="大数据002班";

        Student s1 = new Student();
        s1.name="张三";
        s1.age=18;
        s1.sex='男';
       // s1.classNo="大数据001班";
        s1.show();
        Student s2 = new Student();
        s2.name="李四";
        s2.age=18;
        s2.sex='男';
        //s2.classNo="大数据001班";
        s2.show();
        Student s3 = new Student();
        s3.name="翠花";
        s3.age=19;
        s3.sex='女';
        //s3.classNo="大数据001班";

        s3.show();
    }

}
