package hahaha.lalala.syn.syn1;

//张三媳妇 Runnable
public class ZsWifeRunnable implements Runnable {

    Account account;

    public void setAccount(Account account) {
        this.account = account;
    }


    @Override
    public void run() {
        synchronized (Thread.class) {
            if (account.getBalance() >= 400) {

                account.withDraw(400);

                System.out.println(Thread.currentThread().getName() + "取钱成功 ，余额是：" + account.getBalance());

            } else {
                System.out.println(Thread.currentThread().getName() + "取钱失败 ，余额是：" + account.getBalance());

            }
        }
    }
}
