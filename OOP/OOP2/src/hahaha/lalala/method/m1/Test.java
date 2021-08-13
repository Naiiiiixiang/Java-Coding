package hahaha.lalala.method.m1;
/*
方法： 实现功能的封装








 */
public class Test {
    public static void main(String[] args) {

        printHelloWorld(10);

        printHelloWorld(5);
        printHelloWorld(3);

    }

    public static void printHelloWorld(int count){

        for (int i = 0; i < count; i++) {

            System.out.println("HelloWorld\t"+(i+1));

        }


    }

}
