package hahaha.lalala.lambda.testlambda.sup;

import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Test {
    @org.junit.Test
    public void test05() {
        Stream.generate(()->Math.random()).forEach(a-> System.out.println(a));
    }
    @org.junit.Test
    public void test04() {

        Stream.generate(new Supplier<Double>() {
            @Override
            public Double get() {
                return Math.random();
            }
        }).forEach(new Consumer<Double>() {
            @Override
            public void accept(Double aDouble) {
                System.out.println(aDouble);
            }
        });



    }



    @org.junit.Test
    public void test03() {
        Supplier<String> s = ()->"王安石";
        String s1 = s.get();
        System.out.println("s1 = " + s1);
    }

    @org.junit.Test
    public void test02() {

        Supplier<String> s = () -> {
            return "杜甫";
        };
        String s1 = s.get();

        System.out.println("s1 = " + s1);


    }

    @org.junit.Test
    public void test01() {

        Supplier<String> supplier = new Supplier<String>() {
            @Override
            public String get() {
                return "李白";
            }
        };
        String s = supplier.get();
        System.out.println(s);
    }
}
