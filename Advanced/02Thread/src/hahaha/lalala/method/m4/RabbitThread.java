package hahaha.lalala.method.m4;

class RabbitThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 30; i++) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(this.getName() + "\t 跑..........");
        }
    }
}

class TortoiseThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 30; i++) {
            System.out.println(this.getName() + "\t 跑..........");
        }
    }
}