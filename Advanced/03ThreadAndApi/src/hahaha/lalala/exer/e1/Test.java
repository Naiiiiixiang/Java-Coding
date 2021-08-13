package hahaha.lalala.exer.e1;

//1要求两个线程，一个打印数字 一个打印字母

/**
 * 1 2A 3 4 B 5 6 C 7 8 D 9 10 E 11 12 F 13 14 G 15 16 H 17 18 I 19 20 J
 * 21 22 K 23 24 L 25 26 M 27 28 N 29 30 O 31 32 P 33 34 Q
 * 35 36 R 37 38 S 39 40 T 41 42 U 43 44 V 45 46 W 47 48 X 49 50 Y 51 52 Z
 */
public class Test {
    public static void main(String[] args) {

        //创建公共的打印对象
        Print p = new Print();

        //创建两个线程对象
        NumberThread n1 = new NumberThread(p);
        CharThread c1 = new CharThread(p);

        n1.start();
        c1.start();

    }
}
