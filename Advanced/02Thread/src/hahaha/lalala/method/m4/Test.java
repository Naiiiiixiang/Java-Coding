package hahaha.lalala.method.m4;

/**
 * Thread.sleep(毫秒);
 * 1s = 1000ms
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 3; i >= 1; i--) {
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("跑");
    }
}
