package hahaha.lalala.method.m7;

/**
 * 守护线程:
 * 守护其他线程
 * 当 主线程结束后  守护线程 也会自动结束
 * 游戏的背景音乐
 * 注意： 位置
 * 在 start()之前
 * 线程对象.setDaemon(true);
 * stop();
 * 线程对象.stop()
 * 结束线程
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        A a = new A();
        //a.setDaemon(true);
        a.start();

        for (int i = 0; i <= 30; i++) {
            Thread.sleep(1);
            System.out.println(Thread.currentThread().getName() + "\t跑\t" + (i + 1));
        }


    }
}

class A extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 30; i++) {
            if (i == 10) {
                this.stop();
            }
            System.out.println("AAAA" + (i + 1));
        }
    }
}
