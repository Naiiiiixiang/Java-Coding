package hahaha.lalala.inheri2;
/*
java中实现继承：

 1.使用关键字  extends 完成继承
 2.使用继承可以实现资源复用
 3.继承后 子类也可以进行自定义功能扩展

注意：
    1.java只能单继承  但是 可以多重继承
       实现继承后 不仅可以使用父亲的资源 也可以使用爷爷的资源
    2.java中有一个根父类 Object 所有类的祖师爷
      如果一个类没有显示的继承另一个类那么 此类 默认继承自Object
 */
public class Test {
    public static void main(String[] args) {
        Object obj;
        Cat cat = new Cat();
        cat.age = 2;
        cat.name = "小花";
        cat.show();
        cat.catchMouse();
        System.out.println("-------------------------------");
        Dog dog = new Dog();
        dog.lookHome();
    }
}
