package hahaha.lalala.wrapper;

/*
包装类型是不可变对象
字符串 也是不可变对象

 */
public class Test5 {
    public static void main(String[] args) {

        Integer i1 = 10;
        //可以  i1 会进行自动拆箱  基本数据类型进行比较
        double d = i1;
        double d3 = 10;
        // Double 是包装类型  i1 也是引用数据类型    两个类型不一致
       //   Double d1 = i1;
        //不行  d2 是包装类型   10 基本数据类型
        //Double d2 = 10;
        Double d2 = 10.2;

        Integer i2 = new Integer(20);
        System.out.println("方法调用前：  i2 = " + i2);//20
        changValue(i2);
        System.out.println("方法调用后：  i2 = " + i2);//20
    }

    private static void changValue(Integer i2) {
        i2 = 30;
        System.out.println("方法调用中：  i2 = " + i2);//30


    }
}
