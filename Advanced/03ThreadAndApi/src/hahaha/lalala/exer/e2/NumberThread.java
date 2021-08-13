package hahaha.lalala.exer.e2;

/**
 * 数字线程
 */
public class NumberThread extends Thread {


    @Override
    public void run() {
        for (int i = 1; i <= 52; i++) {
            Print.printNum(i);
        }
    }
}
