package hahaha.lalala.method.constru.c1;

public class RabbitThread extends Thread {


    public RabbitThread(String name) {
        super(name);
    }

    @Override
    public void run() {

        while (true) {
            //大白兔  小黑兔
            System.out.println(this.getName() + " 跑.....");
        }
    }
}
