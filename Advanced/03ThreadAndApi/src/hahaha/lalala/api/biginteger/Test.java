package hahaha.lalala.api.biginteger;
/**
 * Integer int
 * <p>
 * BigInteger 表示过大的整数
 */


import java.math.BigInteger;

public class Test {

    @org.junit.Test
    public void test01() {

        long maxValue = Long.MAX_VALUE;
        System.out.println(maxValue);
        long m = 9223372036854775807L;

    }

    @org.junit.Test
    public void test02() {

        BigInteger i1 = new BigInteger("111119223372036854775808");

        System.out.println("i1 = " + i1);

    }

    @org.junit.Test
    public void test03() {
        BigInteger b1 = new BigInteger("30");
        BigInteger b2 = new BigInteger("20");
        //加法
        BigInteger sum = b1.add(b2);
        System.out.println(sum);
        //乘法
        System.out.println("b1.multiply(b2) = " + b1.multiply(b2));
        //除法
        System.out.println("b1.divide(b2) = " + b1.divide(b2));
        //减法
        System.out.println("b1.subtract(b2) = " + b1.subtract(b2));
        //取模
        System.out.println("b1.remainder(b2) = " + b1.remainder(b2));
    /*    int num = 10;
        int num1 = 20;

        System.out.println(num+num1);*/


    }

}
