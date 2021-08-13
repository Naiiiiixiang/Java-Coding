package hahaha.lalala.arr;

import org.junit.Test;

import java.util.Arrays;

/**
 * 数组元素的插入：
 * 1.在尾部插入
 * 2.在中间插入
 */
public class Test3 {


    @Test
    public void test04() {
        //0       1     2       3
        String arr[] = {"李白", "杜甫", "王安石", null};
        String ele = "李商隐";
        System.arraycopy(arr, 2, arr, 3, 1);

        System.out.println(Arrays.toString(arr));

        arr[2] = ele;
        System.out.println(Arrays.toString(arr));


    }

    @Test
    public void test03() {
        //0       1     2       3
        String arr[] = {"李白", "杜甫", "王安石", null};
        String ele = "李商隐";
        //插入的下标
        int insertIndex = 1;
        //将 杜甫 王安石 向后移动一位
        System.arraycopy(arr, 1, arr, 2, 2);

        System.out.println(Arrays.toString(arr));


        arr[insertIndex] = ele;
        System.out.println(Arrays.toString(arr));


    }

    @Test
    public void test01() {
        String arr[] = {"李白", "杜甫", "王安石", null};
        arr[3] = "安琪拉";
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void test02() {
        // 在其他位置插入
        //                0       1      2
        String arr[] = {"李白", "杜甫", "王安石", null};
        String ele = "李商隐";
        //插入的下标
        int insertIndex = 1;
        //移动原有位置的数据
        //   arr[insertIndex+1] = arr[insertIndex];
        arr[3] = arr[2];
        arr[2] = arr[1];
        //在进行插入
        arr[1] = "李商隐";

        System.out.println(Arrays.toString(arr));


    }
}
