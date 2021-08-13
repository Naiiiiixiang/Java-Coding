package hahaha.lalala.comparator.c3;

import java.util.Comparator;

/**
 * 完成使用外部比较器 比较所有引用类型的数组
 */
public class ArraysTools {

    /**
     *  使用外部比较器 比较所有引用类型的数组
     * @param arr 要比较的数组
     * @param com 任意比较规则
     *             Object[] arr = ps;
     *             Comparator com = s1;
     */
    public static void sort(Object[] arr, Comparator com){

        for (int i = 0; i < arr.length-1; i++) {

            for (int j = 0; j < arr.length-i-1; j++) {
                //表面上会执行 接口中的compare（） 实际上看 传来的对象是谁
                //就会去调用此对象重写的compare（）
                int compare = com.compare(arr[j], arr[j + 1]);
                if(compare>0){
                    Object temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

    }

}
