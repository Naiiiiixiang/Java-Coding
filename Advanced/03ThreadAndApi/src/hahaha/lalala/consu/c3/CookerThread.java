package hahaha.lalala.consu.c3;

public class CookerThread extends Thread {

    private Bar bar;

    public void setBar(Bar bar) {
        this.bar = bar;
    }

    public CookerThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        while (true) {
            synchronized (bar){
                //做菜前对菜的数量进行校验 如果大于10  立马等待
                while (bar.count>= Bar.MAX_COUNT){
                    try {
                        bar.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //做菜
                bar.count++;
                System.out.println(getName() + "做了一道菜，现在 吧台上有【 "+bar.count+" 】道菜");
                //做完菜后通知服务员 端菜
                bar.notifyAll();
            }

        }
    }
}
