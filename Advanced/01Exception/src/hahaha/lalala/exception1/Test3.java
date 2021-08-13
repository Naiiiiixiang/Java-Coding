package hahaha.lalala.exception1;

import org.junit.Test;

/**
 * 1.当程序发生异常后 直接 结束 不再向下执行
 * 2. 发生异常后  如果没有处理 就向上抛给  方法的调用者
 * 如果处理了 就不再继续向上抛出
 */
public class Test3 {
    //jvm
    @Test
    public void test01() {
        test1();
    }

    private void test1() {
        test2();
    }

    private void test2() {

        try {
            test3();
        } catch (Exception e) {
            System.out.println("666666");
        }

    }

    private void test3() {

        int[] arr = {10, 20};

        System.out.println(arr[2]);

        System.out.println("Game Over");

    }
}
