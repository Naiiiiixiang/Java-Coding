package hahaha.lalala.polys.poly3;

import java.util.Scanner;

/*
其他国家的HR来招聘
     中国
     日本
     印度

     南非

 创建一个方法 按需生产程序元

 多态应用在返回值类型
 */
public class Test3 {
    public static void main(String[] args) {
        //1.创建键盘输入对象
        Scanner in = new Scanner(System.in);
        //2.给出提示语句
        System.out.println("请问 您需要那个国家的程序员");
        //3.调用方法  给出对用国家的程度员
        String mess = in.next();//中国  日本

        Programmer programmer = GuiGuSchool.createProgrammer(mess);
        //4.输出内容
        if(programmer!=null){
            programmer.progrmming();
        }else{
            System.out.println("还没有此国家程序员");
        }

    }
}
