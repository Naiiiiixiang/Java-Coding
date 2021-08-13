package hahaha.lalala.exer1.e1;

/**
 * 创建线程类
 */
public class Window extends Thread {

    public Window(String name) {
        super(name);
    }

    //代表总票数
    static int num = 100;
    static Object o = new Object();

    @Override
    public synchronized void run() {
        while (true) {
            synchronized (o) {
                if (num <= 0) {
                    break;
                }
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(this.getName() + "卖了 第" + num + "张票");
                num--;
            }
        }
    }
}
