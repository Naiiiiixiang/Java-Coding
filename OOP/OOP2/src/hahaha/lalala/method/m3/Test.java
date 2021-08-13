package hahaha.lalala.method.m3;

import java.util.Scanner;

/*

修饰符 返回值类型 方法名(形式参数){
}
返回值类型:
        void 当前方法没有返回值
        数据类型： 当前方法要返回该数据类型匹配的值
         int    10
         double   3.14  10 20
注意：
    当一个方法定义了返回值类型那么必须返回一个值

返回值类型
    键盘输入两个值 将 最大值在main中输出
 */
public class Test {


    public static void main(String[] args) {
        //创建键盘输入对象
        Scanner in = new Scanner(System.in);

        System.out.println("请您输入第一个数");
        int num1 = in.nextInt();
        System.out.println("请您输入第二个数");
        int num2 = in.nextInt();

        int max =  maxNum(num1 ,num2);
        System.out.println("max = " + max);

    }

    public static int maxNum(int a,int b){
        int maxNum = a>b?a:b;
     //   System.out.println("maxNum = " + maxNum);
        return maxNum;
    }

}
