package hahaha.lalala.arr;

import org.junit.Test;

import java.util.Arrays;

/**
选择排序的思路：
    每一次排序 会假设一个最小值
 第一次排序时 会 假设第一个位置的数就是最小值
 i = 0;
  70
  让假设的值 与数组中的后面的每一个元素进行比较 将找到的最小值 与第一个值进行交换

 第二次排序 给第二个位置放置最小值
 i = 1;
 minIndex = 3;
 将最小值与指定位子进行交换
 */
public class SelectSort {
    @Test
    public void test01(){
        int[] arr = {1,70,60,50,30,20};
        //给某一个位置添加最小值
        for(int i = 0;i<arr.length-1;i++){
            //假设当前位置所在的数就是最小值
            int minIndex  =i;
            //当前值要不断的和它的后一个值进行比较
            for(int j = i+1;j<arr.length;j++){
                //获取最小值下标
                if(arr[j]<arr[minIndex]){
                    minIndex = j;
                }
            }
            //当假设的最小值 与真正的最小值 不是同一个值  要进行位置交换
            if(i!=minIndex){
                int temp = arr[i];//0
                arr[i] = arr[minIndex]; //mindex= 0;
                arr[minIndex] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void test02(){
        int[] arr = {1,70,60,50,30,20};

    }
}
