package hahaha.lalala.string;

/**
 * 字符串： 不可变的字符序列
 * 只要对字符串进行更改 就会产生新的字符串对象
 * 字符串是存储在 方法区的 常量池中
 * private final char value[];
 */


public class Test1 {
    public static void main(String[] args) {
        String s = new String("你好");
        final int i;
        i = 30;
    }
}

class A {
    final int num = 30;
    final int age;

    public A() {
        age = 30;
    }

    public A(int age) {
        this.age = age;
    }
}



