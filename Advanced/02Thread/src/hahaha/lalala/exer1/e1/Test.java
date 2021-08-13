package hahaha.lalala.exer1.e1;

/**
 * 卖票
 * 四个窗口卖100张票 卖到最后一张票结束  且 不能出现 重票
 * <p>
 * 每一个窗口是一个线程
 * 采用继承 方式
 * 同步代码块
 * 同步代方法
 * 实现方式
 * 同步代码块
 * 同步代方法
 * 注意：
 * 锁的范围不能太大  否则 就只有一个线程执行
 * 锁的范围不能太小  否则 没有同步效果
 */
public class Test {
    public static void main(String[] args) {


        //创建四个窗口
        Window w1 = new Window("窗口一");
        Window w2 = new Window("窗口二");
        Window w3 = new Window("窗口三");
        Window w4 = new Window("窗口四");

        // 启动线程
        w1.start();
        w2.start();
        w3.start();
        w4.start();


    }
}
