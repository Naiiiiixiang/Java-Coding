package hahaha.lalala.syn.syn1;

/**
 * 线程安全问题：
 * 当 多个线程 操作共享数据时
 * 张三 和张三媳妇 共同拥有一个账户
 * 共同操作同一个账户 进行取钱
 * 500   400
 * 问题1：实现账户共享
 * 在共同出现的位置  新建 账户对象 将其作为参数 传递给 张三 和 它媳妇
 * <p>
 * 问题2：出现了线程安全问题 两人 都能取钱成功
 * <p>
 * 解决线程安全问题：
 * 保证在操作共享数据时 只有一条线程
 * 两种方式：1.同步代码块
 * 2.同步方法
 * 使用同步代码块解决：
 * synchronized(同步监视器对象){
 * 可能出现线程安全问题的代码
 * }
 * <p>
 * 同步监视器对象： 锁对象
 * <p>
 * 同步监视器对象：必须是对象
 * 一般是使用共享资源
 * 想要实现同步效果 必须拥有同一个同步监视器对象
 * 如果一个线程进入到同步代码块 那么其他线程不仅无法进入此同步代码块 且 无法进入
 * 拥有同一个同步监视器的其他同步代码块
 * <p>
 * <p>
 * 张三和张三媳妇 都调用了 start() 都有了被CPU调度的权利
 * 张三先被CPU调度了 进入run() 进入同步代码块 然后 将 锁关闭
 * Thread.sleep(10); 张三线程 睡 10ms 丢失CPU的执行权
 * <p>
 * 张三媳妇获得CPU的执行权 进入run() 发现有同步代码块 且
 * 同步监视器对象是相同的  锁是关闭的  张三媳妇在 同步代码块外等待
 * <p>
 * 张三重写获得CPU的执行权 完成取钱操作  出门开锁
 * <p>
 * 张三媳妇 立马进入同步代码块 对余额校验后 取钱失败
 */
public class Test {
    public static void main(String[] args) {


        Class<Thread> t1 = Thread.class;
        Class<Thread> t2 = Thread.class;


        System.out.println(t1 == t2);


        //新建账户
        Account account = new Account();


        //1.创建接口实现类对象
        ZsRunnable zs = new ZsRunnable(account);
        ZsWifeRunnable zsW = new ZsWifeRunnable();
        //调用set方法 给媳妇传值
        zsW.setAccount(account);

        //2.作为参数传递给Thread
        Thread zsThread = new Thread(zs, "张三线程");
        Thread zsWThread = new Thread(zsW, "张三媳妇");

        //3.启动线程
        zsThread.start();
        zsWThread.start();
    }
}
