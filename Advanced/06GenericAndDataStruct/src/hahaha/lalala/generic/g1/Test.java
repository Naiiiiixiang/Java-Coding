package hahaha.lalala.generic.g1;

import java.util.ArrayList;

/*
泛型： 类型化参数
        将类型 作为参数进行传递

方法：
    形参： 接收方法调用处传递的实参
          规定实参的类型
    实参：将值传给 形参

 */
public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList();
        ArrayList<Double> l1 = new ArrayList();
        ArrayList<String> l2 = new ArrayList();


        show(3.0, 20);
    }

    public static void show(double d,int a){//形参：
        System.out.println( d+ a);
    }

}
