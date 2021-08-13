package hahaha.lalala.method.m5;

/**
 * join（）： 强行插队
 * A
 * B
 * 线程对象.join();
 * 线程对象的线程 会进行 插队 直到 完成任务后 被插队线程 才能继续执行
 * <p>
 * 线程对象.join(ms);
 * 线程对象的线程 会进行 插队  被插队线程 会等待指定的ms数   如果 时间到达
 * 插队线程 任务么有结束 那么也不会再进行等待 两者一起执行
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {


        RabbitThread r1 = new RabbitThread();
        r1.setName("小白兔");
        r1.start();

        for (int i = 1; i <= 30; i++) {
            if (i == 10) {
                //  r1.join();
                // r1.join(2000);
            }
            System.out.println(Thread.currentThread().getName() + "\t跑 \t" + i);
        }
    }
}


