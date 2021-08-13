package hahaha.lalala.method.m8;

/**
 * volatile:保证数据在多线程间是可见的
 * 硬盘
 * 内存
 * CPU 将频繁使用的数据读到CPU的缓存
 * volatile：修饰的资源不会放到CPU的缓存区
 * 保证每次获取的是最新的值
 */
public class Test {

    static volatile boolean flag = true;

    public static void main(String[] args) throws InterruptedException {

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (flag) {
                    //  System.out.println("666666666");
                }
            }
        }).start();

        //主线程在此睡5s
        Thread.sleep(5000);
        flag = false;
    }
}
