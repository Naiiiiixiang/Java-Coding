package hahaha.lalala.consu.c3;

/*
1.吧台上菜的 数量 不符合题目要求 出现了 大于10 和 小于0 的情况

2.厨师在做菜时  服务员是不能进行端菜的
    添加同步代码块的原因

解决：菜的数量 不满足要求
      使用线程通信


      当菜的数量 大于等于10时  厨师线程 等待 wait()

      当菜的数量 小于等于0时  服务员线程等待

      当菜的数量小于10时  厨师可以继续做菜

      当服务员端走一道菜 就可唤醒  厨师继续做菜  notify();

      当厨师做了一道菜 就可以唤醒 服务员过来端菜


    多个服务员
    多个厨师
 */
public class Test {

    public static void main(String[] args) {

        //创建公共的吧台
        Bar bar = new Bar();

        //创建线程
        CookerThread c1 = new CookerThread("东北菜大厨");
        c1.setBar(bar);
        CookerThread c2 = new CookerThread("鲁菜大厨");
        c2.setBar(bar);

        WaiterThread w1 = new WaiterThread("翠花");
        w1.setBar(bar);
        WaiterThread w2 = new WaiterThread("秋香");
        w2.setBar(bar);
        //启动线程
        c1.start();
        c2.start();
        w1.start();
        w2.start();
    }
}
