package hahaha.lalala.wrapper;
/*
包装类型 相较于基本数据类型 提供了更多的方法  方便编程
 */
public class Test1 {
    public static void main(String[] args) {
        Integer i1 = new Integer(20);
        System.out.println(i1);
        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);
        //将10进制数转为 二进制数
        String s = Integer.toBinaryString(5);
        System.out.println("s = " + s);
        //将10进制数转为  8进制数
        String s1 = Integer.toOctalString(9);
        System.out.println("s1 = " + s1);
        //将10进制数转为  16进制数
        String s2 = Integer.toHexString(12);
        System.out.println("s2 = " + s2);
        System.out.println("--------------------------------------------");
        //将二进制数转为10进制数 0B/b
        System.out.println(0b101);
        //将8进制数转为 10进制数 0
        System.out.println(011);
        //将16进制数 转为 10进制数 0x/X
        System.out.println(0x11);
        System.out.println("--------------------------------------------");
        //比较两个整数的大小
        int compare = Integer.compare(33, 30);
        System.out.println("compare = " + compare);
    }
}
