package hahaha.lalala.deadlock;

/**
 * 供货商线程
 */
public class GoodsThread extends Thread {
    Object goods;
    Object money;

    public GoodsThread(Object goods, Object money) {
        this.goods = goods;
        this.money = money;
    }

    @Override
    public void run() {
        synchronized (money) {
            System.out.println("先给钱");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (goods) {
                System.out.println("再给货");
            }
        }
    }
}
