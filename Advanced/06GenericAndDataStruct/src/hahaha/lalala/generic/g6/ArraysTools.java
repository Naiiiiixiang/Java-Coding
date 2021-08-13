package hahaha.lalala.generic.g6;

/*
泛型方法 想要使用泛型 需要声明泛型
       在返回值前声明
 */
public class ArraysTools {
    //代表T 必须是 Comparable的孩子
    public static <T extends Comparable<T>> void sort(T[] arr) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    T temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }

            }
        }


    }

}
