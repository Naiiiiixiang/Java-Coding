package hahaha.lalala.exer.e1;

/**
 * 数字线程
 */
public class NumberThread extends Thread {

    Print print;

    public NumberThread(Print print) {
        this.print = print;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 52; i++) {
            // System.out.println(i);
            print.printNum(i);
        }
    }
}
