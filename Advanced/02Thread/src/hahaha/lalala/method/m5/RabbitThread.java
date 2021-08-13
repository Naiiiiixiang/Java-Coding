package hahaha.lalala.method.m5;

class RabbitThread extends Thread {

    @Override
    public void run() {

        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(this.getName() + "跑  " + i);
        }
    }
}