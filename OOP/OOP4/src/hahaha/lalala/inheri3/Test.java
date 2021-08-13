package hahaha.lalala.inheri3;
/*
1.父类的私有属性是可以继承但是 不能直接访问
2.子类调用资源时 优先在本类中查找  当 本类中没有时去上一层查找 如果都没有 报错
 */
public class Test {

    public static void main(String[] args) {

        Cat cat = new Cat();

        System.out.println("cat.age = " + cat.age);

        cat.eat();

    }
}
