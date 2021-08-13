package hahaha.lalala.method.m1;

import java.security.PublicKey;

/*
方法的声明：
  权限修饰符  静态  返回值类型 方法名（形式参数）{


  }
  {}：方法的范围

    [public static] void     main(String[] args){

    }



方法的调用：

注意：
    1.方法执行的顺序 与声明顺序无关 与调用顺序有关
      谁先调用 谁先执行
      不调用 不执行

     2.方法与方法之间是兄弟关系
方法的执行顺序：
    1.按调用顺序执行

    2.方法结束后会回到方法调用处
 */
public class Test2 {
    //方法的声明
    public static void showMessage() {
        System.out.println("this is showMessage() ");
        test1();
    }

    public static void test1(){
        System.out.println("this is test1()");
    }

    //jvm
    public static void main(String[] args) {
        System.out.println("====main=====");
        printHelloWorld();
        showMessage();
        System.out.println("----------------main结束--------------");
    }

    //方法的声明
    public static void printHelloWorld() {
        System.out.println("HelloWorld");
    }
}
