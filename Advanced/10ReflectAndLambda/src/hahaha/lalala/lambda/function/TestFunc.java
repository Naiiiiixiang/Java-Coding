package hahaha.lalala.lambda.function;

import org.junit.Test;
import org.omg.CORBA.INTERNAL;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

/*
输入的参数 刚好 与 方法调用者调用的参数 契合
可以使用 方法引用

调用方法的对象::方法名
 */
public class TestFunc {

    @Test
    public void test03() {

        ArrayList<Integer> list = new ArrayList();

        Collections.addAll(list, 3,2,1,10);

    /*    Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });*/
     /*   Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1, o2);
            }
        });*/
      //  Collections.sort(list, (a,b)->Integer.compare(a, b));
        Collections.sort(list, Integer::compareTo);
        System.out.println(list);
    }
    @Test
    public void test02() {


     /*   Stream.generate(new Supplier<Double>() {
            @Override
            public Double get() {
                return Math.random();
            }
        }).forEach(System.out::println);*/
        //Stream.generate(()->Math.random()).forEach(System.out::println);
        Stream.generate(Math::random).forEach(System.out::println);

    }

    @Test
    public void test01() {
        ArrayList<String> list = new ArrayList<>();
        list.add("李白");
        list.add("杜甫");
        list.add("王安石");
        list.add("白居易");

        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                //    System.out.println(s);
            }
        });
        list.forEach(System.out::println);

        // list.forEach((t)-> System.out.println(t));

    }
}
