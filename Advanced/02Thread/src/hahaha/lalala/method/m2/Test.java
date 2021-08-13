package hahaha.lalala.method.m2;

/**
 * 展示线程的优先级
 * 优先级别越高 被 CPU调度(执行)的概率越大
 * <p>
 * 设置优先级
 * 线程对象.setPriority() [1,10]
 * public final static int MAX_PRIORITY = 10;
 * public final static int NORM_PRIORITY = 5;//默认的
 * public final static int MIN_PRIORITY = 1;
 * 线程默认的优先级是5
 */
public class Test {
    public static void main(String[] args) {
        //接口实现类对象
        TortoiseRunnable tortoiseRunnable = new TortoiseRunnable();
        Thread t1 = new Thread(tortoiseRunnable, "鳄龟");
        Thread t2 = new Thread(tortoiseRunnable, "绿毛龟");
        System.out.println("t1.getPriority() = " + t2.getPriority());
        //设置线程的优先级
        t1.setPriority(1);
        t2.setPriority(10);

        t1.start();
        t2.start();
    }
}
