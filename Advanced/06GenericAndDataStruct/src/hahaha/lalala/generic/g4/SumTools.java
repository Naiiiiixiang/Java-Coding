package hahaha.lalala.generic.g4;

import java.math.BigDecimal;

/*
求所有的数字类型的和
Integer
Double
Byte
Short
Float
BigInteger
BigDecimal
extends  规定 泛型是该类型的孩子
 & 也必须满足另一个条件
T extends Number & Comparable
T 必须是   Number Comparable

extends 上限： T 只能是上限或者上限的孩子
 */
public class SumTools<T extends Number & Comparable> {

    T a;
    T b;

    public SumTools(T a, T b) {
        this.a = a;
        this.b = b;
    }

    public T getSum() {

        if (a instanceof Integer) {
            Integer a1 = (Integer) a;
            Integer b1 = (Integer) b;
            //自动装箱
            Integer i = a1 + b1;

            return (T) i;
            //如果是BigDecimal
        } else if (a instanceof BigDecimal) {
            BigDecimal a1 = (BigDecimal) a;
            BigDecimal b1 = (BigDecimal) b;

            BigDecimal bigDecimal = a1.add(b1);
            return (T) bigDecimal;

        }

        return null;

    }
}
