package hahaha.lalala.innerclass2;
/*
静态成员内部类：
1.声明方式  在外部类中 写 static class 类名{
}
2.内部类中可以存在静态的属性
3.内部类中 不能直接使用外部类中的 非静态资源 需要创建外部类对象才能使用
4.在外部类的静态方法内 可以创建内部类对象
   可以通过 内部类对象 调用内部类中 非静态资源
           内部类名 调用  内部类中 静态资源
5.在外部类中直接创建内部类对象
   外部类名.内部类名 变量名 =  new 外部类名.内部类名();
   变量名：内部类对象
    Outer.Inner inner = new Outer.Inner();
6.内部类会生成独立的字节码文件  命名方式
  外部类名$内部类名
7.直接创建外部类对象 是否会引发 静态内部类的初始化?
    如果没有使用内部类中的资源 那不会进行内部类的初识化
    如果只是使用内部类中的资源  也不会触发外部类的初始化
 */
public class Outer {
    String name  ="Outer";
    static int age = 20;
    static class Inner{
        String name1 = "Inner";
        static int age1 = 40;

        public void innerMethod1(){
           /* System.out.println(name);
            System.out.println(age);*/
            System.out.println(new Outer().name);
            System.out.println(Outer.age);
        }
        public static void innerMehtod2(){
        }
    }
    public  void outerMethod12(){
    }
    public static void outerMethod1(){
        Inner inner = new Inner();
        System.out.println("new Inner().name1 = " + inner.name1);

        inner.innerMethod1();

        System.out.println("Inner.age1 = " + Inner.age1);

        Inner.innerMehtod2();

    }

}
