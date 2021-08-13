package hahaha.lalala.exer1.e4;

/**
 * 三个
 * 1.创建线程  2种方式
 * 2.线程安全
 * 同步代码块
 * 同步方法
 */
public class Test {
    public static void main(String[] args) {

        //新建Runnable实现类对象

        AccountRunnable accountRunnable = new AccountRunnable();
        Thread t1 = new Thread(accountRunnable, "窗口一");
        Thread t2 = new Thread(accountRunnable, "窗口二");
        Thread t3 = new Thread(accountRunnable, "窗口三");
        Thread t4 = new Thread(accountRunnable, "窗口四");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
