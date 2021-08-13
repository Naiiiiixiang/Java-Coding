package hahaha.lalala.arr;

import org.junit.Test;
/**
二分查找：
    前提： 数组必须有序  从小到大排序
    分而治之
    目的：快速确定查找元素的位置
如何进行二分查找：
    1.数组必须有序
    2.找开始下标
      找结束下标
      找中间下标
    3.让  查找的元素 与中间下标对用的元素进行对比
        进行数据的舍取
        更改 开始下标 与结束下标的位置
 */
public class BinarySearchTest {
    @Test
    public void test01() {
        int[] arr = {2, 10,  30, 40, 50, 60};
        //查找60
        int index = binarySearch2(arr, 2);
        System.out.println("index = " + index);
    }
    /**
     * 二分查找的方法
     *
     * @param arr 要查找的数组
     * @param ele 要查找的元素
     * @return 指定元素的下标
     */
    private int binarySearch2(int[] arr, int ele) {
        //开始下标
        int startIndex = 0;
        //结束下标
        int endIndex = arr.length - 1;
        while (startIndex <= endIndex) {
            //中间下标
            int midIndex = (startIndex + endIndex) / 2;
            //获取中间下标对应的值
            int value = arr[midIndex];
            //当要查找元素> 中间下标元素
            if (ele > value) {
                //开始下标发生改变
                startIndex = midIndex + 1;
            } else if (ele < value) {
                //当要查找元素< 中间下标元素
                endIndex = midIndex - 1;
            } else {
                //当要查找元素== 中间下标元素
                return midIndex;
            }

        }
        return -1;
    }

    /**
     * 二分查找的方法
     * @param arr 要查找的数组
     * @param ele 要查找的元素
     * @return 指定元素的下标
     */
    private int binarySearch1(int[] arr, int ele) {
        //开始下标
        int startIndex = 0;
        //结束下标
        int endIndex = arr.length - 1;
        //中间下标
        int midIndex = (startIndex + endIndex) / 2;

        while (startIndex <= endIndex) {
            //获取中间下标对应的值
            int value = arr[midIndex];
            //当要查找元素> 中间下标元素
            if (ele > value) {
                //开始下标发生改变
                startIndex = midIndex + 1;
            } else if (ele < value) {
                //当要查找元素< 中间下标元素
                endIndex = midIndex - 1;
            } else {
                //当要查找元素== 中间下标元素
                return midIndex;
            }
            //改变了开始下标 或者结束下标
            midIndex = (startIndex + endIndex) / 2;
        }
        return -1;
    }
}
