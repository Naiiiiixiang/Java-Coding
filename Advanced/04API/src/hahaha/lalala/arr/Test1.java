package hahaha.lalala.arr;

import org.junit.Test;

import java.util.Arrays;

public class Test1 {


    @Test
    public void test01() {
        //数组元素反转
        int[] arr = {8, 7, 6, 5, 4, 3, 2, 1};

        //从头开始向后遍历
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

        System.out.println();
        //从后开始向前遍历
        //1
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + "\t");
        }
    }

    @Test
    public void test02() {
        int[] arr = {8, 7, 6, 5, 4, 3, 2, 1};

        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length / 2; i++) {
            //第一个元素
            int temp = arr[i];
            //最后一个元素
            arr[i] = arr[arr.length - 1 - i];
            //完成交换
            arr[arr.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(arr));


    }
}
