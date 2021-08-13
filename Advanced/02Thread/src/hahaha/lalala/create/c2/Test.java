package hahaha.lalala.create.c2;

/**
 * 实现龟兔赛跑
 * 实现接口的方式：
 * 1.创建一个类 实现 Runnable 接口
 * <p>
 * 2.重写run()
 * run内容： 多线程做的事
 * 3.创建该实现类的对象
 * <p>
 * 4.将此对象作为参数 传递给 Therad
 * <p>
 * 5.调用Thread类中的 start() 启动线程
 */
public class Test {
    public static void main(String[] args) {
        //1.新建Runnable对象
        RabbitRunnable rabbitRunnable = new RabbitRunnable();
        //2.将此对象作为参数传递给Thread
        Thread thread = new Thread(rabbitRunnable);
        // Runnable targer = rabbitRunnable;
        //3.调用thread类内的start()
        thread.start();

        //1.新建Runnable对象
        TortoiseRunnable tortoiseRunnable = new TortoiseRunnable();
        //2.将此对象作为参数传递给Thread
        Thread t2 = new Thread(tortoiseRunnable);
        //3.调用thread类内的start()
        t2.start();


    }
}
