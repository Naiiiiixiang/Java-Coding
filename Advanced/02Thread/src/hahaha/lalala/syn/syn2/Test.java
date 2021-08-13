package hahaha.lalala.syn.syn2;

public class Test {

    public static void main(String[] args) {

        //1.新建Runnable实现类对象
        AccountRunnable accountRunnable = new AccountRunnable();
        //2.新建两条线程 把 Runnable实现类对象 作为参数传递

        Thread zs = new Thread(accountRunnable, "张三");
        Thread zsW = new Thread(accountRunnable, "张三媳妇儿");

        //3.启动线程

        zs.start();
        zsW.start();


    }
}
