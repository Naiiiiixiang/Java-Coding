package hahaha.lalala.other;

/**
 * sleep()  wait()
 * <p>
 * 1. sleep() 不会释放锁  wait() 释放锁
 * <p>
 * 2. 线程类调用sleep()
 * wait() 是Object类中的方法  同步监视器对象调用 wait();
 * <p>
 * 3. sleep() 等待时间结束  重写回到运行状态
 * <p>
 * wait();
 * wait(时间); 等待时间结束 会回到运行状态
 * wait(); 直到拥有同一个同步监视器对象的其他线程 调用了 notify() 或者 notifyAll()
 * 才能唤醒它回到运行状态
 * <p>
 * <p>
 * sleep() yield();
 * <p>
 * sleep():从运行到阻塞
 * <p>
 * yield(): 从运行到就绪
 * 从运行到准备
 * <p>
 * sleep()：调用后会抛出异常
 * yield():没有异常
 * <p>
 * 同：
 * 都是通过 Thread类调用
 * Thread.sleep(1);
 * Thread.yield();
 * 1. 创建 2种方式
 * 2.线程安全  2种方式
 * 3.线程通信  三个方法
 */
public class Test3 {
    public static void main(String[] args) {


    }
}
