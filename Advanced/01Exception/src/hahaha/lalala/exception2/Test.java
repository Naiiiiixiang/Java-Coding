package hahaha.lalala.exception2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 异常处理 两种方式
 * <p>
 * 1.try{}catch(){}finally
 * 手动处理
 * 即使程序发生异常 也不影响 程序向下执行
 * <p>
 * <p>
 * try{
 * 可能发生异常的代码
 * }catch(异常类型 变量名){
 * 发生异常后 做的事情
 * }
 * <p>
 * <p>
 * <p>
 * 2.throw  throws
 * 手动抛出异常
 */

/**
 * 键盘输入3个成绩 求总和以及平均分
 */

public class Test {
    public static void main(String[] args) {

        //创建键盘输入对象
        Scanner in = new Scanner(System.in);
        //创建数组
        int[] arr = new int[3];
        //定义一个变量 记录总和
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.println("请您输入第 " + (i + 1) + " 个学生成绩");
            try {
                arr[i] = in.nextInt();
            } catch (InputMismatchException e) {
                //打印堆栈信息
                e.printStackTrace();
            }
            sum += arr[i];
        }
        System.out.println("总成绩是：" + sum + "，平均分是" + sum / arr.length);

    }
}
