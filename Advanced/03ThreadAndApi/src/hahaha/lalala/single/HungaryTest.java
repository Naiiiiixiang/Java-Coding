package hahaha.lalala.single;

import org.junit.Test;

/**
 * 饿汉式实现单例
 */
public class HungaryTest {

    @Test
    public void test01() {
        /*Hungry h1 = new Hungry();
        Hungry h2 = new Hungry();*/

        //构造器私有 直接提供 该类的对象
        Hungry h1 = Hungry.instance;
        Hungry h2 = Hungry.instance;
        System.out.println(h1 == h2);
    }

    @Test
    public void test02() {
        //枚举实现
        Hungry1 h1 = Hungry1.instance;
        Hungry1 h2 = Hungry1.instance;
        System.out.println(h1 == h2);
    }

    @Test
    public void test03() {
        //构造器私有 实例对象私有  提供 get() 供外界访问
        Hungry3 h1 = Hungry3.getInstance();
        Hungry3 h2 = Hungry3.getInstance();
        System.out.println(h1 == h2);
    }

}

class Hungry {
    public static Hungry instance = new Hungry();

    private Hungry() {
    }

}

enum Hungry1 {
    instance;
}

class Hungry3 {
    private static Hungry3 instance = new Hungry3();

    private Hungry3() {
    }

    public static Hungry3 getInstance() {
        return instance;
    }


}
