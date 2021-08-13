package hahaha.lalala.method.m3;

import java.util.Arrays;

public class Test3 {
    public static void main(String[] args) {
        int[] t = test();
        String s = Arrays.toString(t);
        System.out.println("s = " + s);
        System.out.println("Arrays.toString(t) = " + Arrays.toString(t));
    }
    public static int[] test(){
        int [] arr = {10,20,30};
        return arr;
    }
    /*
    判断一个数是否为质数  是  true
                         否  false
     */
}
