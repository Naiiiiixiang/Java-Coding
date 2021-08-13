package hahaha.lalala.oop1;

import java.util.Arrays;
import java.util.Scanner;

/*
包名：
  作用：
      1.可以不同包下实现相同文件的存储
      2.实现功能的区分
  注意：
    1.如果想要使用不同包下的资源  需要导包
      在类的外面 借助 import关键字进行导入
      import com.atguigu.oop1.Person;

    2.如果类在包中 那么 java文件的首行 必须是 包的声明
     package com.atguigu.oop1;

    3.包名的定义方式 所有字母都小写（规范）
      包名 是公司网址倒叙
      www.atguigu.com;
      com.atguigu.项目名.模块名.

    4.当出现同名资源 采用全类名的方式 导入
    全类名/全路径名： 包名+类名；
  java.util.工具包
  java.net 网络编程相关
  java.io io流相关
 */
public class Test {


    public static void main(String[] args) {
        Person p1 = new Person();

        System.out.println(p1.name);

        int[] arr  ={20,30,40};

        System.out.println(arr);

        System.out.println(Arrays.toString(arr));

        //java.util.Scanner in = new java.util.Scanner(System.in);
        Scanner in = new Scanner(System.in);
        System.out.println("请输入一个数字");

        int i = in.nextInt();

        System.out.println("i = " + i);
    }


}
