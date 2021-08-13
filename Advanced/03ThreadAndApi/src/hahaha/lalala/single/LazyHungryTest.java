package hahaha.lalala.single;

import org.junit.Test;

/**
 * 懒汉式：实现方式一 存在线程安全问题
 */
public class LazyHungryTest {
    @Test
    public void test01() {
        LazyHungry l1 = LazyHungry.getInstance();
        LazyHungry l2 = LazyHungry.getInstance();
        System.out.println(l1 == l2);
    }

    @Test
    public void test02() {
        LazyHungry1 lazyHungry1 = LazyHungry1.getInstance();
        LazyHungry1 lazyHungry2 = LazyHungry1.getInstance();
        System.out.println(lazyHungry1 == lazyHungry2);
    }

    @Test
    public void test03() {
        LazyHungry1 lazyHungry1 = LazyHungry1.getInstance();
        LazyHungry1 lazyHungry2 = LazyHungry1.getInstance();
        System.out.println(lazyHungry1 == lazyHungry2);
    }
}

class LazyHungry2 {
    private static LazyHungry2 instance;

    private LazyHungry2() {
    }

    public static LazyHungry2 getInstance() {
        if (instance == null) {
            //采用同步代码块 控制线程安全
            synchronized (LazyHungry2.class) {
                if (instance == null) {
                    instance = new LazyHungry2();
                }
            }
        }
        return instance;
    }
}


class LazyHungry1 {
    //只是对变量声明
    private static LazyHungry1 instance;

    //构造器私有
    private LazyHungry1() {
    }

    //使用同步方法解决线程安全问题
    public synchronized static LazyHungry1 getInstance() {
        //当没有创建对象时 去创建

        if (instance == null) {

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            instance = new LazyHungry1();// 0x11
        }
        //当对象已经创建完毕时  直接返回已经创建的对象  不再创建新的对象
        return instance;
    }

}


class LazyHungry {
    //只是对变量声明
    private static LazyHungry instance;

    //构造器私有
    private LazyHungry() {
    }

    public static LazyHungry getInstance() {
        //当没有创建对象时 去创建
        if (instance == null) {
            instance = new LazyHungry();// 0x11
        }
        //当对象已经创建完毕时  直接返回已经创建的对象  不再创建新的对象
        return instance;
    }

}
