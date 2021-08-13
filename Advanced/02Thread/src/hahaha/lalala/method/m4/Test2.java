package hahaha.lalala.method.m4;

/**
 * run() 方法内 不能抛出异常
 * 方法重写时 子类不能排除比父类更大的异常
 * Thread类 run() 没有跑异常  因此 重写方法的子类 也不能抛
 * <p>
 * 睡眠后 会丢失 CPU的执行权
 */

public class Test2 {
    public static void main(String[] args) {

        RabbitThread r1 = new RabbitThread();
        r1.setName("大白兔");
        TortoiseThread t1 = new TortoiseThread();
        t1.setName("小乌龟");

        r1.start();
        t1.start();
    }
}
