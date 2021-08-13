package hahaha.lalala.lambda;

import org.junit.Test;

public class TestLambda {
    @Test
    public void test01() {

        RabbitRunnable ra = new RabbitRunnable();
        Thread th = new Thread(ra);
        th.start();
    }

    @Test
    public void test02() {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("兔子跑.....");
            }
        });
        thread.start();
    }
    public static void main(String[] args) {
        Thread thread = new Thread(() -> System.out.println("兔子跑"));
        thread.start();
    }
}

class RabbitRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("兔子跑.......");
    }
}
