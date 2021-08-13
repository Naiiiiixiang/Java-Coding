package hahaha.lalala.syn.syn3;

public class Test {
    public static void main(String[] args) {

        //新建共享账户
        Account account = new Account();

        AccountThread zs = new AccountThread("张三", account);
        AccountThread zsW = new AccountThread("张三媳妇", account);


        zs.start();
        zsW.start();


    }
}
