package hahaha.lalala.method.m3;

/**
 * isAlive(): 查看线程是否处于活动状态
 * 注意位置：
 * start(): 后 会处于活动状态
 * 线程 执行完毕 就会结束活动状态
 */

public class Test {
    public static void main(String[] args) throws InterruptedException {
        RabbitThread r1 = new RabbitThread();
        boolean alive = r1.isAlive();
        System.out.println("alive = " + alive);

        r1.setName("大白兔");
        r1.start();
        Thread.sleep(5000); //主线程 睡 5s
        alive = r1.isAlive();
        System.out.println("alive ----> " + alive);

    }
}

class RabbitThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 30; i++) {
            System.out.println(this.getName() + "\t 跑..........");
        }
    }
}