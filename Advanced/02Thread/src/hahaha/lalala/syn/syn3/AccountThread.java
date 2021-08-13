package hahaha.lalala.syn.syn3;

public class AccountThread extends Thread {

    Account account;


    // 在创建线程对象时  就指定线程名字
    public AccountThread(String name, Account account) {
        super(name);
        this.account = account;
    }

    static Object o = new Object();

    @Override
    public void run() {
        synchronized (o) {
            if (account.getBalance() >= 400) {
                try {
                    //让错误暴露的更加明显
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                account.withDraw(400);
                System.out.println(this.getName() + "取钱成功, 余额是：" + account.getBalance());
            } else {
                System.out.println(this.getName() + "取钱失败, 余额是：--》" + account.getBalance());
            }
        }


    }
}
