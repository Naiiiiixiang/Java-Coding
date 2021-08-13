package hahaha.lalala.api.math;

import org.junit.Test;

import static java.lang.Math.*;

public class TestMath {

    @Test
    public void test01() {

        System.out.println("Math.sqrt(4) = " + sqrt(4));
        System.out.println("Math.PI = " + PI);
        System.out.println("Math.pow(3, 3) = " + pow(3, 3));
        System.out.println("Math.abs(10) = " + Math.abs(10));
        //绝对值
        System.out.println("Math.abs(-10) = " + Math.abs(-10));
        //向下取整
        System.out.println("Math.floor(1.9) = " + Math.floor(1.9));
        System.out.println("Math.floor(1.1) = " + Math.floor(1.1));
        //向上取整
        System.out.println("Math.ceil(1.1) = " + Math.ceil(1.1));
        System.out.println("Math.ceil(2.1) = " + Math.ceil(2.1));
    }

    @Test
    public void test02() {
        // round() 四舍五入
        System.out.println("Math.round(3.4) = " + Math.round(3.4));
        System.out.println("Math.round(3.5) = " + Math.round(3.5));
        System.out.println("Math.round(3.6) = " + Math.round(3.6));
        //开立方
        System.out.println("Math.cbrt(27) = " + Math.cbrt(27));
        System.out.println("Math.max(10, 20) = " + Math.max(10, 20));
        System.out.println("Math.min(10, 20) = " + Math.min(10, 20));

    }

    @Test
    public void test03() {
        //22 -33
    /*
        n:较大的数
        m：较小的数
    (int)(Math.random()*(n-m+1)+m);
      Math.random()  [0,1)
     */
        for (int i = 0; i < 30; i++) {
            int i1 = (int) (Math.random() * (33 - 22 + 1) + 22);
            System.out.println("i1 = " + i1);
        }


    }

}
