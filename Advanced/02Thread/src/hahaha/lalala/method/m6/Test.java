package hahaha.lalala.method.m6;


public class Test {

    public static void main(String[] args) {


        RabbitThread r1 = new RabbitThread();
        TortoiseThread t1 = new TortoiseThread();

        r1.setName("小兔子");
        t1.setName("小乌龟");

        r1.start();
        t1.start();

    }
}
