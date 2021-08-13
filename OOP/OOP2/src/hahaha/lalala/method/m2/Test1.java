package hahaha.lalala.method.m2;
/*
方法的形参和实参

位置：
    形参：方法的声明处
    实参：方法的调用处
作用：
    形参：
       1.调用本方法时需要传递指定数量的值
       2.类型要进行匹配
     实参： 用于给形参传递值
        既可以传递 实际的值
        也可以传递 变量
声明方法 输出两个数的和；
 */
public class Test1 {
    /**
     * 求最大值方法
     * @param l1  第一个参数
     * @param l2  第二个参数
     */
    public static void printMaxNum(long l1,long l2){//long l1 = 80;
        long maxNum = l1>l2?l1:l2;
        System.out.println("maxNum = " + maxNum);
    }
    /**
     * 打印自定义矩形
     * @param h 行数
     * @param l 列数
     */
    public static void show(int h,int l){

        for(int i  =1;i<=h;i++){

            for(int j = 1;j<=l;j++){

                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        show(5, 10);
      //  printMaxNum(80L, 90L);
     //   printMaxNum(80, 90);

        //printSum(20,30);
      /*  int a = 30;
        int c = 50;
        printSum(a, c);*/


    }
    //定义方法
    public static void printSum(int a1,int b1){
        System.out.println("a1 = " + a1);
        System.out.println("b1 = " + b1);
        int sum = a1+b1;
        System.out.println("sum = " + sum);
    }
    /*
    定义一个方法  有两个参数
    第一个参数 代表 行数
    第二个参数代表 列数
    test(5,10)
     */


}
