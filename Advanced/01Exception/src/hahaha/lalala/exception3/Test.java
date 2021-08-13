package hahaha.lalala.exception3;

import java.io.FileNotFoundException;

/**
 * 异常处理的方式二：
 * 向上抛出异常
 * throws:
 * 在方法的声明处
 * 告诉方法调用者 调用本方法 可能发生的异常类型
 * 可以放多个异常类型
 * throws ArithmeticException,ArrayIndexOutOfBoundsException
 * throw:
 * 在方法内
 * 向方法调用者抛出异常对象
 * 一次只能抛出一个异常对象
 * <p>
 * 如果是 运行时异常  即使 方法内抛出了异常 方法的声明处也可以不声明
 * 如果是 编译时异常  方法内抛出了编译异常 方法的声明处必须声明
 * <p>
 * 处理异常的方式：
 * 1.try{}catch(){}
 * 2.向上抛  工作中 基本不用
 */
public class Test {
    @org.junit.Test
    public void test02() throws FileNotFoundException {
        show();
    }

    private void show() throws FileNotFoundException {
        int a = 20;
        if (a == 10) {
            throw new FileNotFoundException("文件找不到了");
        }
    }

    @org.junit.Test
    public void test01() {
        //测试运行时异常
        int n = getDivide(10, 2);
        System.out.println(n);
    }

    private static int getDivide(int i, int i1) throws ArithmeticException, ArrayIndexOutOfBoundsException {

        if (i1 == 0) {
            throw new ArithmeticException("上过学没有 小伙子");
        }
        int[] arr = {};
        if (arr.length == 0) {
            throw new ArrayIndexOutOfBoundsException("数组下标越界");
        }
        int n = i / i1;
        return n;
    }
}
