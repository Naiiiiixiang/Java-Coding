package hahaha.lalala.method.constru.c2;

public class RabbitRunnable implements Runnable {
    @Override
    public void run() {
        while (true) {
            //小黑兔  大白兔
            System.out.println(Thread.currentThread().getName() + "跑........");
        }
    }
}
