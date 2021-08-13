package hahaha.lalala.review;

public class Test {

    public static void main(String[] args) {
        RabbitThread thread = new RabbitThread("小兔子");

        thread.getName();


    }
}

class RabbitThread extends Thread {

    RabbitThread(String name) {
        super(name);
    }


    @Override
    public void run() {
        System.out.println(this.getName() + "跑");
    }
}
