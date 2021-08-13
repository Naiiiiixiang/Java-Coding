package hahaha.lalala.wrapper;
/*
装箱：
    将基本类型数据 --->对应的包装类型

    自定装箱： 直接将基本数据类型  ---> 对应的包装类型
               Integer i3 = num;
               Double d = 3.14;
               Boolean b = false;
与
拆箱
   包装类型---->对应的基本数据类型
        int i6 = new Integer(30);
 */
public class Test2 {

    public static void main(String[] args) {
        int num = 20;
        //调用 Integer中的构造方法 将 基本数据类型 包装为引用类型数据
        Integer i1 = new Integer(num);
        //调用 Integer中的 valueOf()可以 将 基本数据类型 包装为引用类型数据
        Integer i2 = Integer.valueOf(num);
        //自动装箱
        Integer i3 = num;
        System.out.println(i3);

        System.out.println("-------------------------------------------------");
        Integer i4 = new Integer(20);
        //使用包装对象调用intValue() 将包装类型 转为 基本数据类型
        int i = i4.intValue();
        //自动拆箱
        int i5 = i4;
        int i6 = new Integer(30);
        Double aDouble = new Double(3.14);
        double d = aDouble;
    }
}
