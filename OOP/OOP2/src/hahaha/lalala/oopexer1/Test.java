package hahaha.lalala.oopexer1;

public class Test {
    public static void main(String[] args) {
        System.out.println("Account.rate = " + Account.rate);
        Account.rate = 0.035;
        Account a1 = new Account();
        a1.id="001";
        a1.balance=100_0000_0000.0;
        System.out.println("账户是："+a1.id+"，余额是："+a1.balance+"利率是："+a1.rate);

        System.out.println("----------------------------------------");

        Account a2 = new Account();

        a2.id="002";
        a2.balance=123456234562345.78;

        System.out.println("账户是："+a2.id+"，余额是："+a2.balance+"利率是："+a2.rate);


    }
}

class Account {

    static double rate;//利率
    String id;//账户
    double balance;//余额

}