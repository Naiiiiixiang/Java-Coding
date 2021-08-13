package hahaha.lalala.syn.syn4;

/**
 * 使用静态方法解决线程安全问题
 * 静态方法的同步监视器对象 是  Class
 * AccountThread.class
 */
public class AccountThread extends Thread {
    static Account account;

    public AccountThread(String name, Account account) {
        super(name);
        this.account = account;
    }

    @Override
    public void run() {
        try {
            //肯定是不同的this
            quQian();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //普通同步方法 同步监视器对象是this  李四 和李四媳妇是不同的对象 所以是不同的this
    public synchronized static void quQian() throws InterruptedException {//AccountThread.class
        if (account.getBalance() >= 400) {
            Thread.sleep(10);
            account.withDraw(400);
            System.out.println(Thread.currentThread().getName() + "取钱成功,余额是：" + account.getBalance());
        } else {
            System.out.println(Thread.currentThread().getName() + "取钱失败,余额是：" + account.getBalance());
        }
    }
}
