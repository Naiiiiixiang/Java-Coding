package hahaha.lalala.review;

public class Test {

    public static void main(String[] args) {


      //  Thread.State;



        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("6666666666666");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("你好世界");

            }
        });

        thread.start();
    }
}
