package hahaha.lalala.optional;

import org.junit.Test;

import java.util.Optional;
import java.util.function.Supplier;

public class OptionalTest {

    @Test
    public void test04() throws Throwable {

        String s = "shuju";
        Optional<String> s1 = Optional.ofNullable(s);
        String s2 = s1.get();
        System.out.println(s2);

    }

    @Test
    public void test03() throws Throwable {

        String s = null;
        Optional<String> s1 = Optional.ofNullable(s);

       /* String a = s1.orElseThrow(new Supplier<Throwable>() {
            @Override
            public Throwable get() {
                return new IndexOutOfBoundsException("越界了");
            }
        });*/
        String a = s1.orElseThrow(()->new IndexOutOfBoundsException("越界了"));
        System.out.println(a);


    }


    @Test
    public void test02() {

        String s = null;
        Optional<String> s1 = Optional.ofNullable(s);

        /*String s2 = s1.orElseGet(new Supplier<String>() {
            @Override
            public String get() {
                return "李白";
            }
        });*/
        String s2 = s1.orElseGet(()->"李白");
        System.out.println(s2);

    }

        @Test
    public void test01(){

        String s = "数据";

        Optional<String> s1 = Optional.ofNullable(s);

        //如果数据是null 使用  orElse 中的值
        //如果数据不是null 使用 原始数据
        String s2 = s1.orElse("你好世界");
        System.out.println(s2);
    }
}
