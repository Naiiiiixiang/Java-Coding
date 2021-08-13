package hahaha.lalala.exer1.e3;

public class TicketRunnable implements Runnable {
    int num = 100;

    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                if (num <= 0) {
                    break;
                }
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "正在卖第 " + num + " 张票");
                num--;
            }
        }
    }
}
