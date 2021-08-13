package hahaha.lalala.argment;
/*
可变形参：可以变化的形式参数


   注意：
     0.声明可变形参  数据类型... 变量名

     1.使用可变形参 类型必须一致  个数可以随意
       参数个数 是 [0,n]
     2.可变形参采用一维数组进行数据存储

     3.可变形参 在使用时 必须位于参数列表的最后
       因此 一个方法只能有一个可变形参

 */
public class Test {

    public static void main(String[] args) {
/*
        sum();
    sum(10, 20);
    sum(3,4,5);
    sum(1,2,3,4,5,6);*/
    sum(1,2,3,4,5,6,9,100);
    add(3.14,"你好","世界");
}

public static void add(double d,String...s){

}

    public static void sum(int...d){
        int sum = 0;
        for (int i : d) {
            sum+=i;
        }
        System.out.println(sum);
    }
/*
    private static void sum(int i, int i1, int i2, int i3, int i4, int i5, int i6, int i7) {
    }

    private static void sum(int i, int i1, int i2, int i3, int i4, int i5) {

    }

    private static void sum(int i, int i1, int i2) {

    }

    public  static void sum(int a,int b){
        System.out.println(a+b);
    }*/
}
