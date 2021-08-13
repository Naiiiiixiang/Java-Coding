package hahaha.lalala.generic.g8;

import java.util.Comparator;
/*

? extends Comparable
          上限
? super T 下限
   最小是T类型  也可以是 T类型的父类 爷爷类.....
 */
public class ArraysTools {


    /**
     * 排序所有引用类型数据的方法
     * @param arr 数组
     * @param com 排序规则
     * @param <T> 类型
     */
    public static <T>  void sort(T[] arr, Comparator<? super T> com){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if(com.compare(arr[j],arr[j+1])>0){
                    T temp  =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
