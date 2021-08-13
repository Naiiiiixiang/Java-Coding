package hahaha.lalala.consu.c1;

/**
 * 1.吧台上菜的 数量 不符合题目要求 出现了 大于10 和 小于0 的情况
 * <p>
 * 2.厨师在做菜时  服务员是不能进行端菜的
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
