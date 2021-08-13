package hahaha.lalala.super1;

public class TestFather {
    public static void main(String[] args) {

        Father f = new Father();
        System.out.println("f.getNum() = " + f.getNum());// 10

        Son son = new Son();
        System.out.println("son.getNum() = " + son.getNum());//10  20


        Daughter d = new Daughter();
        System.out.println("d.getNum() = " + d.getNum());//30



    }
}
