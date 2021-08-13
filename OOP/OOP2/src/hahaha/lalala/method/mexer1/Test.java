package hahaha.lalala.method.mexer1;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        int[] arr = {70,5,3,1,90,10,-1,-2};
        //int[] arr = {70,5,3,1,90};
        ArraysTools.sort(arr);
       System.out.println(Arrays.toString(arr));
//[-2, -1, 1, 3, 5, 10, 70, 90]


        String s = ArraysTools.forEach(arr);
        System.out.println(s);


    }
}
