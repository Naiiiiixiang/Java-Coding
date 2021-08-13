package hahaha.lalala.deadlock;

/**
 * 消费者线程
 */
public class ConsumerThread extends Thread {
    Object goods;
    Object money;

    public ConsumerThread(Object goods, Object money) {
        this.goods = goods;
        this.money = money;
    }

    @Override
    public void run() {

        synchronized (goods) {
            System.out.println("先给货");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (money) {
                System.out.println("再给钱");
            }
        }
    }
}
