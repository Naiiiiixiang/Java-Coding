package hahaha.lalala.method.constru.c2;

/**
 * public Thread(Runnable target,String name) :
 * 分配一个带有指定目标新的线程对象并指定名字。
 * 在run() 方法内 获取线程的名字 只能使用  Thrad.currentTherad().getName();
 */
public class Test {

    public static void main(String[] args) {
        RabbitRunnable r1 = new RabbitRunnable();
        Thread t1 = new Thread(r1, "大白兔");
        t1.start();
        Thread t2 = new Thread(r1, "小肥兔");
        t2.start();


    }
}
