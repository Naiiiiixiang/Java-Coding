package hahaha.lalala.method.m1;

/**
 * 如果没有给线程设置名字 则采用默认值
 * Thread-序号 序号代表 线程是第几个  从0开始
 * 线程对象.setName(线程名);
 * 线程对象.getName();获取线程名
 */
public class Test {
    public static void main(String[] args) {
        RabbitTherad r1 = new RabbitTherad();
        r1.setName("大白兔");
        r1.start();
        RabbitTherad r2 = new RabbitTherad();
        r2.setName("小黑兔");
        r2.start();

    }
}
