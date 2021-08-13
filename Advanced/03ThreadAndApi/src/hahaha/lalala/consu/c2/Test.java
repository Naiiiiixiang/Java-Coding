package hahaha.lalala.consu.c2;

/**
 * 1.吧台上菜的 数量 不符合题目要求 出现了 大于10 和 小于0 的情况
 * <p>
 * 2.厨师在做菜时  服务员是不能进行端菜的
 * 添加同步代码块的原因
 * <p>
 * 解决：菜的数量 不满足要求
 * 使用线程通信
 * <p>
 * <p>
 * 当菜的数量 大于等于10时  厨师线程 等待 wait()
 * <p>
 * 当菜的数量 小于等于0时  服务员线程等待
 * <p>
 * 当菜的数量小于10时  厨师可以继续做菜
 * <p>
 * 当服务员端走一道菜 就可唤醒  厨师继续做菜  notify();
 * <p>
 * 当厨师做了一道菜 就可以唤醒 服务员过来端菜
 * <p>
 * <p>
 * 使用同步监视器对象调用线程通信方法
 * <p>
 * <p>
 * <p>
 * 厨师与服务员线程 同时 start()
 * <p>
 * wait() 会释放锁 且 会丢失CPU的执行权
 * notify(); 会唤醒  同一个同步监视器对象上等待的线程
 */
public class Test {

    public static void main(String[] args) {

        //创建公共的吧台
        Bar bar = new Bar();

        //创建线程
        CookerThread c1 = new CookerThread("东北菜大厨");
        c1.setBar(bar);

        WaiterThread w1 = new WaiterThread("翠花");

        w1.setBar(bar);

        //启动线程

        c1.start();
        w1.start();


    }
}
