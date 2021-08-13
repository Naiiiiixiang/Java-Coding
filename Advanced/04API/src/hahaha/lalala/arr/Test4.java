package hahaha.lalala.arr;

import org.junit.Test;

import java.util.Arrays;

public class Test4 {
    @Test
    public void test03() {
        //  0         1        2       3
        String[] arr = {"安琪拉", "米莱迪", "嬴政", "马尔扎哈"};

        //删除安琪拉
        System.arraycopy(arr, 1, arr, 0, 3);

        //将最后一个元素设置为null
        arr[arr.length - 1] = null;

        System.out.println(Arrays.toString(arr));
    }


    @Test
    public void test02() {
        //  0         1        2       3
        String[] arr = {"安琪拉", "米莱迪", "嬴政", "马尔扎哈"};
        //完成数组内元素的移动

        System.arraycopy(arr, 2, arr, 1, 2);

        //将最后一个元素设置为默认值
        arr[arr.length - 1] = null;
        System.out.println(Arrays.toString(arr));

    }

    @Test
    public void test01() {
        //  0         1        2       3
        String[] arr = {"安琪拉", "米莱迪", "嬴政", "马尔扎哈"};
        //确定删除元素的下标
        int deleteIndex = 1;
        //将删除后的元素向前移动
        //-1 防止数组越界
        for (int i = deleteIndex; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        //将最后一个元素设置为默认值
        arr[arr.length - 1] = null;
        System.out.println(Arrays.toString(arr));
    }
}
