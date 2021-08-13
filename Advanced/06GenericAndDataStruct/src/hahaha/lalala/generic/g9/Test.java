package hahaha.lalala.generic.g9;

import java.math.BigDecimal;

public class Test {

    public static void main(String[] args) {
        Person<Double> d = new Person<>();
        d.setScore(3.14);
        System.out.println("------------------------------------");
        //? 代表任意数据类型  类型很多 只能用null
        Person<?> p1 = new Person<>();
        p1.setScore(null);
        System.out.println("------------------------------------");
        /*
        Integer
        BigDecimal
        BigInteger
        ? extends Number: 上限 可以是Number 也可以是Number的孩子
         */
        Person<? extends Number> p2 = new Person<>();
      /*  p2.setScore(3.14);
        p2.setScore(3);*/
      p2.setScore(null);

        System.out.println("------------------------------------");
        /*
        多态
        ? super Number: 可以是Number 也可以是Number的父亲

        为啥可以放 Integer  30  Double 3.14  BigDecimal 20.0
        SmallDog extends Dog
        Dog   extends  BigDog
        BigDog   extends  Animal
        ? super Dog;
        ? --> Animal
        Animal a = new SmallDog();
         */
        Person<? super Number> p3 = new Person<>();
        p3.setScore(3.14);
        p3.setScore(30);
        p3.setScore(new BigDecimal(20));
    }
}

class Person<T>{

    private T score;

    public void setScore(T score) {
        this.score = score;
    }

    public Person() {
    }
}
