package hahaha.lalala.interfa.interface2;

/*
接口中的成员：
    1.抽象方法 可以省略 public abstract
    2.接口中的变量 是全局 静态 常量
      默认被 public static final 修饰
      ctrl + shift + U  将字母变为 大小写
    3.接口中可以存在静态方法
    public 也是可以省略的
    4.接口中可以存在默认方法   哪一个子类需要 那么 哪一个子类进行重写即可
    public default 返回值类型 方法名(形参列表){
    }
    public 是可以省略的
 */
public interface Fly {
    //public abstract    void fly();
    void fly();

    public static final int NUM = 20;

     static void cc(){
        System.out.println("this is cc()");
    }
    default void aAndc(){
       System.out.println("a and c");
   }
}

class A implements Fly {
    @Override
    public void fly() {
        System.out.println("A  飞 了  ");
    }
   public void aAndc(){
       System.out.println("A 类实现了功能拓展");
    }
}

class B implements Fly {
    public void fly() {
        System.out.println("B  飞 了......");
    }
}
class  C implements Fly{

    @Override
    public void aAndc() {
        System.out.println("C 类实现了功能拓展");
    }

    @Override
    public void fly() {

    }
}
