package hahaha.lalala.method.m2;

public class TortoiseRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 30; i++) {
            System.out.println(Thread.currentThread().getName() + " 跑.......");
        }
    }
}
