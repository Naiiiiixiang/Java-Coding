package hahaha.lalala.review;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请您输入一个月份");
        int num = in.nextInt();
        Month month = Month.getByValue(num);
        System.out.println("month = " + month);


    }
}
