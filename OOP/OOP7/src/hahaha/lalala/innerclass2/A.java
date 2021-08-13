package hahaha.lalala.innerclass2;

public class A {
    static int age = 20;
    static {
        System.out.println("A 执行了");
    }
    public static void showA() {
        System.out.println("this is showA()");
    }
    static class B {
        static {
            System.out.println("B 执行了");
        }
    }
}
