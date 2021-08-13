package hahaha.lalala.exer1.e2;

public class Window extends Thread {

    public Window(String name) {
        super(name);
    }

    //代表总票数
    static int num = 100;

    @Override
    public void run() {
        while (true) {
            if (num <= 0) {
                break;
            }
            //卖票方法
            sal();
        }
    }

    //  窗口一三四 在此等待
    public static synchronized void sal() {

        if (num <= 0) {
            return;
        }
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "卖了 第" + num + "张票");
        num--;
    }

}