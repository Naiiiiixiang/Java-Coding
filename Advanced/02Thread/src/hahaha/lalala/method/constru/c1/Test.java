package hahaha.lalala.method.constru.c1;

/**
 * 调用父类的  有参 构造 设置 线程的名字
 */
public class Test {
    public static void main(String[] args) {
        RabbitThread r1 = new RabbitThread("大白兔");
        r1.start();
        RabbitThread r2 = new RabbitThread("小黑兔");
        r2.start();

    }
}
