package hahaha.lalala.exer.e2;

/**
 * 字母线程
 */
public class CharThread extends Thread {


    @Override
    public void run() {
        for (char i = 'A'; i <= 'Z'; i++) {

            Print.printChar(i);


        }
    }
}
