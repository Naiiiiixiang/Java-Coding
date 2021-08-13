package hahaha.lalala.stream;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.UnaryOperator;
import java.util.stream.IntStream;
import java.util.stream.Stream;
public class CreateTest {
    @Test
    public void test01() {
        //list集合创建流
        ArrayList<String> list = new ArrayList<>();
        list.add("李白");
        list.add("杜甫");
        list.add("王安石");
        list.add("李商隐");
        list.add("杜牧");
        Stream<String> stream = list.stream();


        //  stream.forEach(System.out::println);
        //并行流
        Stream<String> parallelStream = list.parallelStream();
        parallelStream.forEach((t) -> {
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "--->" + t);
        });
    }
    @Test
    public void test02() {
        int[] arr = {1, 2, 3, 4, 5};
        //数组创建流
        IntStream stream = Arrays.stream(arr);
    }
    @Test
    public void test03() {
        //创建方式4
        Stream<Integer> stream = Stream.of(1, 2, 3, 43, 46, 7);
    }
    @Test
    public void test04() {
        //创建方式5
       // Stream<Double> stream = Stream.generate(Math::random);

        //创建方式6
        Stream.iterate(2, new UnaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                return integer+1;
            }
        }).forEach(System.out::println);

    }
}
