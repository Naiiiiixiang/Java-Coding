package hahaha.lalala.arr;

import org.junit.Test;

import java.util.Arrays;

/**
 * 数组扩容两种情况
 * 1.数组未满
 * 2.数组已满
 */
public class Test2 {

    @Test
    public void test01() {

        int[] arr = {1, 2, 3};
        //1.创建新数组
        //   int[] newArr = new int[arr.length * 2];
        //扩容到原来的2倍
        //int[] newArr = new int[arr.length << 1];
        //扩容到原来的1.5倍
        int[] newArr = new int[arr.length + (arr.length >> 1)];
        System.out.println(newArr.length);
        //2.将旧数组内的元素 复制到新数组内

       /* for (int i = 0; i < arr.length; i++) {
            newArr[i]=arr[i];
        }*/

        System.arraycopy(arr, 0, newArr, 0, arr.length);
        System.out.println(Arrays.toString(newArr));
        //3.将新数组的地址 赋值给旧数组的引用
        arr = newArr;
        System.out.println(Arrays.toString(arr));
    }
}
