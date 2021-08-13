package hahaha.lalala.comparable.c3;


public class ArraysTools {
    /**
     * 此方法用于比较【所有】引用类型数组
     * @param arr
     */
    public static void sort(Comparable[] arr) {//Comparable[] arr = ss;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                //判断根据比较规则 是否有前一个对象大于后一个对象的情况产生
                int i1 = arr[j].compareTo(arr[j + 1]);
                if (i1 > 0) {
                    Comparable temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    /**
     * 此方法用于比较【所有】引用类型数组
     * @param arr
     */
   /* public static void sort(Object[] arr){//Object[] arr = ss;
        for(int i = 0;i<arr.length-1;i++){
            for(int j = 0;j<arr.length-i-1;j++){
                //判断根据比较规则 是否有前一个对象大于后一个对象的情况产生
              //  Student s1 = (Student)arr[j];
                Comparable c1 = (Comparable)arr[j];
                int i1 = c1.compareTo(arr[j + 1]);
                if(i1>0){
                    Object temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }*/
}
