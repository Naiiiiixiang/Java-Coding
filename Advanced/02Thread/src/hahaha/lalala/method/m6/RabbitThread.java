package hahaha.lalala.method.m6;

class RabbitThread extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            //线程的礼让
            Thread.yield();
            System.err.println(this.getName() + "跑  " + i);
        }
    }
}

class TortoiseThread extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(this.getName() + "跑  " + i);
        }
    }
}