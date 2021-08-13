package hahaha.lalala.innerclass1;

/*
普通成员内部类：
1.外部类 只能使用 public default 修饰
2.内部类可以被四种权限修饰符修饰
3.内部类中不能有静态的属性 但是可以存在 静态的常量
4.内部类中不能有静态的方法
5.内部类中可以直接使用外部类中的资源 属性 方法  静态非静态都可以
6.外部使用内部类的资源
      非静态资源  创建内部类对象才能访问
      静态资源  内部类名.属性名
7.在外部类的静态方法内 不能直接创建内部类对象

8.在外部直接创建内部类对象的方式
 外部类名.内部类名  变量名 =   外部类对象.new 内部类对象();
   Person.Inner inner = new Person().new Inner();

9.内部类编译后 产生的字节码文件 命名规则
  外部类名$内部类名
   Person$Inner
  内部类也会生成独立的字节码文件

内部类的作用：
    1.可以对外部类的功能进行拓展 且 可以不被外界访问
    2.间接实现多继承  内部类与外部类都去继承一个类

 */
class Person extends A{
    String name = "Person";
    static int age = 20;

    class Inner2{
    }

    class Inner extends B {
        String sex = "男";
        String name = "inner";
        final static int num = 20;

        public void showName(){
            String name = "showName";
            //就近一致
            System.out.println(name);
            System.out.println(this.name);
            //每一个类中都会有一个this
            System.out.println(Person.this.name);
        }


        public void show(){
            System.out.println("this is inner show()");
            System.out.println("name="+name+",age = "+age);
           /* outerMether();
            outerMether1();*/

        }
    }
    public  void outerMether1(){
        System.out.println(Inner.num);
        Inner inner = new Inner();
        System.out.println("inner.sex = " + inner.sex);
    }
    public static void outerMether(){
        System.out.println(Inner.num);
        //Inner inner = new Inner();
       // System.out.println("inner.sex = " + inner.sex);

    }
}
class A{
    public void aa(){

    }
}
class B {
    public void bb(){

    }
}