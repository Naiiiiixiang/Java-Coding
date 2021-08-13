package hahaha.lalala.generic.g4;

import org.junit.Test;

import java.math.BigDecimal;

public class SumToolsTest {

    @Test
    public void test01(){
        //Integer 类的和
        SumTools<Integer> sumTools = new SumTools<>(10, 20);
        Integer sum = sumTools.getSum();
        System.out.println("sum = " + sum);
    }
    @Test
    public void test02(){
        //规定泛型是BigDecimal类型
        SumTools<BigDecimal> sumTools = new SumTools<>(new BigDecimal(10), new BigDecimal(20));
        BigDecimal sum = sumTools.getSum();
        System.out.println("sum = " + sum);


        Double d;
    }

    @Test
    public void test03(){

        SumTools<A> sumTools =new SumTools<>(new A(), new A());

    }
}
