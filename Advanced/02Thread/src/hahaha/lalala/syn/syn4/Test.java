package hahaha.lalala.syn.syn4;

public class Test {

    public static void main(String[] args) {


        Account account = new Account();
        //创建了两个对象
        AccountThread lsThread = new AccountThread("李四", account);
        AccountThread lsW = new AccountThread("李四媳妇", account);

        lsThread.start();
        lsW.start();


    }
}
