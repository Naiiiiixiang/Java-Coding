package hahaha.lalala.create.c1;

/**
 * 创建多线程方式有两种
 * -- 继承Thread类
 * -- 实现Runnable接口
 * <p>
 * 龟兔赛跑：
 * 一条线程代表兔子线程
 * 一条线程代表乌龟线程
 * <p>
 * 继承方式如何创建多线程：
 * <p>
 * 1.新建一个类 （类名自定义） 继承Thead类
 * 2.重写run()
 * 使用多线程做的主要内容
 * 3.创建该线程类的对象
 * 4.启动线程
 * 线程对象.strat(); 启动线程
 * <p>
 * 只要启动main() java就会自动开启一个线程  main()
 * Thread.currentThread().getName(); 获取当前线程的名字
 */
public class Test {
    public static void main(String[] args) {

        //创建兔子线程对象
        RabbitThread r = new RabbitThread();
        //启动线程
        r.start();
        System.out.println(Thread.currentThread().getName());

        while (true) {
            System.out.println("乌龟线程...... 加油  加油。。。。。。");
        }


    }
}
