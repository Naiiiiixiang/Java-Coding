package hahaha.lalala.syn.syn4;

//账户类
public class Account {
    //余额
    private int balance = 500;

    /**
     * 取钱的方法
     *
     * @param money
     */
    public void withDraw(int money) {
        balance = balance - money;
    }

    //获取余额
    public int getBalance() {
        return balance;
    }

}
