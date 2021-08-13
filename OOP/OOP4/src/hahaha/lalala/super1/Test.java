package hahaha.lalala.super1;
/*
super: 从父亲继承过来的资源

  super: 调用父类的属性
  super: 调用父类的方法
  super: 调用父类的构造器
    每一个构造器的首行都会有一个默认的 隐藏的 无参的 super()调用父类无参的构造器
    也可以指定参数个数 调用父类构造器
    一个构造器只能存在this 或者super调用另一个构造器
注意：
    super 不能存在于静态方法内的
 */
public class Test {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.show();
        String info = dog.getInfo();
        System.out.println("info = " + info);

    }
}
