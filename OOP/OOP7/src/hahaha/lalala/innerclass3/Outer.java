package hahaha.lalala.innerclass3;

/*
局部内部类：  参照 局部变量
1.如何声明局部内部类
   在方法中 新建一个类
2.局部内部类地位比较低  使用外部类的什么资源 由所在方法决定
      静态方法   可以使用外部类中的静态资源
      非静态方法  可以使用外部类中的所有资源
3.局部内部类中的不能有静态属性但是可以有静态的常量

4.使用内部类中的资源 需要先执行外部类的方法 创建内部类的对象
  通过内部类对象.相关资源

5.局部内部类也会生成独立的字节码文件  字节码文件的命名方式
  外部类名$序号内部类名  序号从1开始
  Outer$1Inner
  Outer$2Inner

6.当 局部内部类中的方法 使用 所在外部类的局部变量时  该局部变量 会自动被final修饰
  jdk1.8自动加final

 */
public class Outer {
    String name = "Outer";
    {
        name = "8888";
    }
    static int age = 20;

    public static void show() {
        int n = 10;
        class Inner {
            final static int num = 20;
            public void in() {
                System.out.println(age);
            }
        }
        Inner i1 = new Inner();
        i1.in();
    }

    public void outerMethod1() {

     final    int m = 20;
      //  m = 30;
        class Inner {
            final static int num = 20;
            public void innerMethod() {
             System.out.println(name);
                /*     System.out.println(age);*/
                System.out.println(m);
            }
        }
    }
}
