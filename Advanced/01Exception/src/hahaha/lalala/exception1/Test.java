package hahaha.lalala.exception1;
/**
    Throwable
       -- Error
          错误  不需要程序员处理
             StackOverflowError
             OutOfMemoryError
       --Exception
            运行时异常：
                  程序真正跑起来 才会发生的异常
            检查异常/受检异常/编译异常
                 写完代码后 就报错
 */
public class Test {

    public static void main(String[] args) throws InterruptedException {

        int[] arr = new int[4];

        try {
            System.out.println("arr[2] = " + arr[22]);
        } catch (ArrayIndexOutOfBoundsException a) {
            //打印异常的堆栈信息
            /*
            java.lang.ArrayIndexOutOfBoundsException: 22
	            at com.atguigu.exception1.Test.main(Test.java:22)
             */
            //a.printStackTrace();
            //发生异常的原因
            // a.getMessage()；
            System.out.println("a.getMessage() = " + a.getMessage());


        }

        System.out.println("Game Over");



        Thread.sleep(20);


    }
}
