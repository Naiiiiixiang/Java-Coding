package hahaha.lalala.runtime;

import org.junit.Test;

public class RunTimeTest {
    /**
     * 运行时对象:单例的
     */
    @Test
    public void test01() {
        Runtime r1 = Runtime.getRuntime();
        Runtime r2 = Runtime.getRuntime();
        System.out.println(r1 == r2);
    }

    @Test
    public void test02() {
        Runtime r1 = Runtime.getRuntime();
        //获取虚拟机空余内存
        System.out.println("r1.freeMemory() = " + r1.freeMemory());
        //获取虚拟机总内存
        System.out.println("r1.totalMemory() = " + r1.totalMemory());
        for (int i = 0; i < 100000; i++) {
            new RunTimeTest();
        }
        //调用垃圾回收器
        System.gc();
        //获取虚拟机空余内存
        System.out.println("r1.freeMemory() ---> " + r1.freeMemory());
        //获取虚拟机总内存
        System.out.println("r1.totalMemory() --->" + r1.totalMemory());

    }
}
