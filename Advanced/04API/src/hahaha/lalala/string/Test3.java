package hahaha.lalala.string;

public class Test3 {
    public static void main(String[] args) {

        String s1 = "你";
        String s2 = "好";
        String s3 = s1 + s2;
        //在进行字符串拼接时  java底层 会对  变量拼接 进行优化 使用可变的字符对象 StringBuilder进行 汇总
        System.out.println("s3 = " + s3);// 你好
    }
}
