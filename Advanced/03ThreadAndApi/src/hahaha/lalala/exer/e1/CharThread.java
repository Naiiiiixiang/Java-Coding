package hahaha.lalala.exer.e1;

/**
 * 字母线程
 */
public class CharThread extends Thread {


    Print print;

    public CharThread(Print print) {
        this.print = print;
    }

    @Override
    public void run() {
        for (char i = 'A'; i <= 'Z'; i++) {
            //System.out.println(i);
            print.printChar(i);
        }
    }
}
