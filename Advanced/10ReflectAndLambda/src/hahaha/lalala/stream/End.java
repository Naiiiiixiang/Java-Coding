package hahaha.lalala.stream;

import org.junit.Test;

import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class End {

    @Test
    public void test06() {
        //collect 手机  toList  toSet
      /*  Optional<Integer> reduce = Stream.of(1, 2, 3, 4, 5, 6).reduce(new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer + integer2;
            }
        });*/
        Optional<Integer> reduce = Stream.of(1, 2, 3, 4, 5, 6).reduce((a,b)->a+b);
        System.out.println(reduce);
    }

    @Test
    public void test05() {
        //collect 收集  toList  toSet
        List<Integer> collect = Stream.of(1, 2, 3, 4, 5, 6).filter(a -> a % 2 == 0).collect(Collectors.toList());
        System.out.println(collect);
    }

    @Test
    public void test04() {
        //查找偶数的数量 filter 过滤
        Optional<Integer> max = Stream.of(1, 2, 3, 4, 5, 6).max(Integer::compareTo);
        System.out.println(max.get());


    }

    @Test
    public void test03() {
        //查找偶数的数量 filter 过滤
        long count = Stream.of(1, 2, 3, 4, 5, 6).peek(System.out::println).filter(a -> a % 2 == 0).count();
        System.out.println("count = " + count);
    }

    @Test
    public void test02() {
        //查找第一个元素
        Optional<Integer> first = Stream.of(10, 2, 3, 4, 5).findFirst();
        System.out.println(first);
    }

    @Test
    public void test01() {

      /*  boolean b = Stream.of(1, 2, 3, 4, 5).anyMatch(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                if(integer==3){
                    return true;
                }
                return false;
            }
        });
        System.out.println(b);*/
        // peek 中间操作
        boolean b = Stream.of(1, 2, 3, 4, 5).peek(System.out::println).anyMatch((a) -> a == 2);
        System.out.println(b);
    }
}
