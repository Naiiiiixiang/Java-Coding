package hahaha.lalala.lambda.function;

import org.junit.Test;
import java.util.function.Function;
/*
数组引用：
数组类型[]::new;
 */
public class ArrayTest {
    @Test
    public void test01() {


        Function<Integer, int[]> f = new Function<Integer, int[]>() {
            @Override
            public int[] apply(Integer integer) {
                return new int[integer];
            }
        };
        int[] ints = f.apply(5);
        System.out.println(ints.length);
    }
    @Test
    public void test02() {
      /*  Function<Integer, int[]> f = (a) -> new int[a];
        int[] ints = f.apply(15);
        System.out.println(ints.length);*/
        Function<Integer, int[]> f = int[]::new;
        int[] ints = f.apply(10);
        System.out.println(ints.length);
    }
}
