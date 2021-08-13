package hahaha.lalala.reflect.other;

import org.junit.Test;

import java.lang.reflect.Array;

public class ArrayTest {
    @Test
    public void test01(){
        //动态创建了数组
        Object o = Array.newInstance(String.class, 3);
        /*
        Array.set(反射创建的数组, 下标, 值);
         */
        Array.set(o, 1, "杜甫");

        System.out.println("Array.get(o, 1) = " + Array.get(o, 1));
    }
}
