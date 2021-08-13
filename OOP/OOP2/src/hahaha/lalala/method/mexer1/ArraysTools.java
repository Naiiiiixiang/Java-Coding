package hahaha.lalala.method.mexer1;

public class ArraysTools {

    /*
    排序数组
     */
    public static void sort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {

            for (int j = 0; j < arr.length - i - 1; j++) {

                if(arr[j]>arr[j+1]){

                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }
            }
        }
    }


    /**
     * 遍历任意整型数组
     * @param arr 数组
     * @return 数组中所有的元素
     */
    public static String forEach(int [] arr){
        //[-2, -1, 1, 3, 5, 10, 70, 90]

        String result = "[";

        for (int i = 0; i < arr.length; i++) {
            //如果是最后一个元素  没有逗号 直接拼接 ]
            if(i==arr.length-1){
                result += arr[i] +"]";
            }else{
                //如果不是最后一个元素 需要使用 , 分割
                result += arr[i] +", ";
            }

        }

        return result;

    }
}
