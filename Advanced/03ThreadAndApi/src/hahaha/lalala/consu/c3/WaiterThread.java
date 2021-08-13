package hahaha.lalala.consu.c3;

public class WaiterThread extends Thread {
    private Bar bar;

    public void setBar(Bar bar) {
        this.bar = bar;
    }

    public WaiterThread(String name) {
        super(name);
    }
    @Override
    public void run() {
        while (true) {
            synchronized (bar) {
                //循环校验 当 菜的数量 不满足要求时 即使唤醒了 服务员线程 也要再次进入睡眠
                while (bar.count <= Bar.MIN_COUNT) {
                    try {
                        bar.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //端菜
                bar.count--;
                System.out.println(getName() + "端走了一道菜，现在吧台上有【 " + bar.count + " 】道菜 ");
                //通知厨师做菜
                bar.notifyAll();
            }
        }
    }
}
