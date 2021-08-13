package hahaha.lalala.exception2;

/**
 * 注意：
 * 1.try语句块内 发生异常下面的代码 是不能执行的  直接执行catch内的内容
 * 2. 只有发生了匹配的异常 才可以捕获 否则 程序 也会停止运行
 * 3.在try语句块内声明的变量 仅仅在 try语句块内有效
 * 4.如果想要捕获多个异常 可以使用 | 运算符连接
 * 异常类型1 | 异常类型2 | 异常类型2  变量名
 * 5. 在 catch内 只声明变量类型 即等价于 创建了 该异常类型的对象
 * NumberFormatException a
 * 6.多重catch 对异常进行捕获
 * 先 父亲 再孩子 异常类型
 */
public class Test2 {

    public static void main(String[] args) {

        int[] arr = null;
        try {
            Integer.parseInt("1a");
            arr = new int[4];
            System.out.println("你好世界");
            System.out.println(arr[5]);
            int i = 10 / 0;
            System.out.println("世界你好");
        } catch (ArithmeticException a) {
            System.out.println("a.getMessage() = " + a.getMessage());
            //   a.printStackTrace();
            System.out.println("除数为0啦");
        } catch (ArrayIndexOutOfBoundsException a) {
            System.out.println("数组下标越界啦");

        } catch (NumberFormatException a) {
            System.out.println("数字格式化异常啦");
        } catch (Exception e) {
            System.out.println("发生了其他的异常");
        }
        System.out.println("game over");


    }
}
