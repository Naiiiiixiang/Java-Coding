package hahaha.lalala.consu;

/**
 * wait(): 让线程进入等待状态
 * wait()会释放锁
 * notify(): 唤醒等待的线程
 * 如果有多条线程 处于等待状态 则   随机唤醒一条
 * notifyAll()：唤醒所有等待的线程
 * 都是Object类中的方法
 * <p>
 * 厨师 与  服务员
 * 厨师做完菜将菜放到吧台上
 * 服务员 将菜 从吧台上取走
 * 吧台 最多能放10道菜   如果厨师已经做够10道菜  厨师要进行等待
 * 当 吧台上菜的数量 不足10道时  继续做菜
 * 吧台上 就没有菜了    服务员线程等待
 * 当吧台上有菜时  服务员进行端菜
 * <p>
 * 厨师线程
 * <p>
 * 服务员线程
 * <p>
 * 吧台
 */
public class Test {
    public static void main(String[] args) {

        new Test().notify();

    }
}
