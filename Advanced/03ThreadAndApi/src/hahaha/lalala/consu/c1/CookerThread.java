package hahaha.lalala.consu.c1;

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

            //做菜
            bar.count++;
            System.out.println(getName() + "做了一道菜，现在 吧台上有【 " + bar.count + " 】道菜");
        }
    }
}
