package hahaha.lalala.consu.c1;

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

            bar.count--;

            System.out.println(getName() + "端走了一道菜，现在吧台上有【 " + bar.count + " 】道菜 ");
        }
    }
}
