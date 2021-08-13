package hahaha.lalala.syn.syn2;

/**
 * 采用同步方法解决
 * synchronized(同步监视器对象){}
 * 方法采用 synchronized修饰 即同步方法：
 * <p>
 * 普通的同步方法 同步监视器对象是this
 * 静态的同步方法 同步监视器对象Class
 * 注意：
 * 如果一条线程 进入 同步方法 其他线程 不仅不能进入此方法
 * 也不能进入拥有同一个同步监视器对象的其他同步方法
 */
public class AccountRunnable implements Runnable {
    Account account = new Account();

    @Override
    public void run() {
        this.quQian();
    }

    public synchronized void quQian() {
        if (account.getBalance() >= 400) {
            try {
                //让错误暴露的更加明显
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            account.withDraw(400);
            System.out.println(Thread.currentThread().getName() + "取钱成功 ，余额是：" + account.getBalance());
        } else {
            System.out.println(Thread.currentThread().getName() + "取钱失败，余额是 ：" + account.getBalance());
        }


    }

    public synchronized void quQian1() {
    }

    public synchronized void quQian2() {
    }

}
