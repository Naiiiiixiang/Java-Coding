package hahaha.lalala.api.bigdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * BigDecimal 表示更加精确的小数
 */
public class Test {

    @org.junit.Test
    public void test04() {
        BigDecimal b1 = new BigDecimal(10);
        BigDecimal b2 = new BigDecimal(3);
        //ArithmeticException
        // System.out.println("b1.divide(b2) = " + b1.divide(b2));
        /*
        b1.divide(BigDecimal, 保留的小数位数, 舍入模式);
         */
        BigDecimal divide = b1.divide(b2, 5, RoundingMode.FLOOR);
        System.out.println(divide);

    }

    @org.junit.Test
    public void test03() {
        BigDecimal b1 = new BigDecimal(10);
        BigDecimal b2 = new BigDecimal(4);
        //减法
        System.out.println("b1.subtract(b2) = " + b1.subtract(b2));
        //加法
        System.out.println("b1.add(b2) = " + b1.add(b2));
        //乘法
        System.out.println("b1.multiply(b2) = " + b1.multiply(b2));
        //除法
        System.out.println("b1.divide(b2) = " + b1.divide(b2));
        //取余
        System.out.println("b1.remainder(b2) = " + b1.remainder(b2));


    }


    @org.junit.Test
    public void test02() {
        BigDecimal b1 = new BigDecimal("3.666666666666666666666666666666666666666666666");
        System.out.println(b1);

    }

    @org.junit.Test
    public void test01() {

        float f = 3.666666666666666666666666666666666666666666666F;

        System.out.println(f);
        double d = 3.666666666666666666666666666666666666666666666;
        System.out.println(d);

    }
}
