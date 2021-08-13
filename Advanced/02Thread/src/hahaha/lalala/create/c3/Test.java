package hahaha.lalala.create.c3;

public class Test {
    public static void main(String[] args) {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                while (true) {
                    System.out.println("兔子跑.......");
                }
            }
        };
        Thread t1 = new Thread(r);
        t1.start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    System.err.println("乌龟跑.......");
                }
            }
        }).start();
    }
}
