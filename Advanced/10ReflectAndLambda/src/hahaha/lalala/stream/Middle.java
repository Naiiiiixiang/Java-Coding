package hahaha.lalala.stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Middle {
    //输出每一个字母
    @Test
    public void test07() {
        String[] arr = {"hello", "world"};
     /*   Arrays.stream(arr).flatMap(
                new Function<String, Stream<?>>() {
                    @Override
                    public Stream<?> apply(String s) {
                        return Stream.of(s.split(""));
                    }
                }
        ).forEach(System.out::println);*/
        Arrays.stream(arr).flatMap(s->Stream.of(s.split(""))).forEach(System.out::println);


    }



    @Test
    public void test06() {
        String [] arr = {"hello","world"};

        Stream<String> stream = Arrays.stream(arr);
     /*   stream.map(new Function<String, Object>() {
            @Override
            public Object apply(String s) {
              //  System.out.println(s);
                return s.toUpperCase();
            }
        }).forEach(System.out::println);*/

     stream.map(a->a.toUpperCase()).forEach(System.out::println);


    }
    @Test
    public void test05() {
        Stream<Integer> stream = Stream.of(1, 11, 22, 2, 3, 4, 5, 6, 7, 8, 9, 20);

      //  stream.sorted().forEach(System.out::println);
       // stream.sorted((a,b)->Integer.compare(b, a))
        stream.sorted(Comparator.reverseOrder()) //倒叙
                .limit(5)
                .skip(1)// 跳过一个元素
                .forEach(System.out::println);
    }
    @Test
    public void test04() {
        //最多显示数据的个数
        Stream<Integer> stream = Stream.of(1, 11, 22, 2, 3, 4, 5, 6, 7, 8, 9, 20);
        stream.limit(5).forEach(System.out::println);
    }

    @Test
    public void test03() {
        //distinct() 去重
        Stream.of(1, 1, 2, 2, 3, 4, 5, 6, 7, 8).distinct().forEach(System.out::println);


    }

    @Test
    public void test02() {
        //过滤奇数
        Stream.of(1, 2, 3, 4, 5, 6, 7, 8).filter((t) -> t % 2 == 0).forEach(System.out::println);
    }

    @Test
    public void test01() {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8);
        //中间操作
        stream = stream.filter(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                if (integer % 2 == 0) {
                    return true;
                }
                return false;
            }
        });
        //结束操作
        stream.forEach(System.out::println);
    }
}
