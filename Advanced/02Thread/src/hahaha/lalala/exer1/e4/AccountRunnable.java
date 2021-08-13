package hahaha.lalala.exer1.e4;

public class AccountRunnable implements Runnable {

    int num = 100;


    @Override
    public void run() {
        while (true) {
            if (num <= 0) {
                break;
            }
            //调用卖票操作
            sal();
        }

    }

    //窗口二 四 一
    private synchronized void sal() {//this
        if (num <= 0) {
            return;
        }
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName() + "正在卖第【 " + num + " 】张票");

        num--;


    }
}
