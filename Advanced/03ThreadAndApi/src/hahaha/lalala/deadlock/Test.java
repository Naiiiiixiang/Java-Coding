package hahaha.lalala.deadlock;

/**
 * 死锁：
 * 两条线程 共同持有对方的锁资源  不放弃
 * <p>
 * 账期
 * 供货商：
 * 先给钱   再给货
 * <p>
 * 消费者：
 * 先给货  再给钱
 * <p>
 * 一条线程是供货商
 * 一条线程是消费者
 * 货资源
 * 钱资源
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {

        Object goods = new Object();
        Object money = new Object();

        GoodsThread g1 = new GoodsThread(goods, money);

        ConsumerThread c1 = new ConsumerThread(goods, money);

        g1.start();

        //主线程睡3s
        Thread.sleep(3000);

        c1.start();


    }
}
