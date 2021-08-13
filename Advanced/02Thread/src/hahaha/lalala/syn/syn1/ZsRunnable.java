package hahaha.lalala.syn.syn1;

//张三Runnable
public class ZsRunnable implements Runnable {
    //新建一个公共的账户
    Account account;

    public ZsRunnable(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        //取400
        //对账户余额进行校验
        synchronized (Thread.class) {
            if (account.getBalance() >= 400) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //取钱
                account.withDraw(400);
                System.out.println(Thread.currentThread().getName() + "取钱成功 ，余额是：" + account.getBalance());
            } else {
                System.out.println(Thread.currentThread().getName() + "取钱失败 ，余额是：" + account.getBalance());
            }
        }


    }
}
