package hahaha.lalala.value;
/*
基本数据类型 传递的是值的副本  在其他方法操作后不会对原有数据造成影响
基本数据类型的值存储在栈中；
 */
public class ChangValue1 {

    public static void main(String[] args) {
        int m = 20;
        int n = 10;
        System.out.println("方法调用前：m = "+m+",n = "+n);// 20 10
        changValue(m, n);
        System.out.println("方法调用后：m = "+m+",n = "+n);//10 20  20 10
    }
    public static void changValue(int m,int n){
        int temp = n;
        n = m;
        m = temp;
        System.out.println("方法调用中：m = "+m+",n = "+n);// 10 20 // 不输出
    }
}
