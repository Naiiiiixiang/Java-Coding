package hahaha.lalala.value;
public class ChangValue2 {
//引用数据类型传递的是地址值
    //String Integer
    public static void main(String[] args) {
        String[] arr = {"迪丽热巴","古力娜扎","马尔扎哈"};
        arr[1] = "范冰冰";
        System.out.println("方法调用前arr[1]:"+arr[1]);//范冰冰
        changeValue(arr);
        System.out.println("方法调用后arr[1]:"+arr[1]);//范冰冰   李冰冰
    }
    public static void changeValue(String[] arr){
        arr = new String[]{"李白","王安石"};
        arr[1] = "李冰冰";
        System.out.println("方法调用中arr[1]:"+arr[1]);//李冰冰
    }
}
