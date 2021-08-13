package hahaha.lalala.lambda.testlambda.consu;

import org.junit.Before;
import org.junit.Test;

import java.util.*;
import java.util.function.Consumer;

public class ListTest {

    ArrayList<String> list = new ArrayList<>();

    @Before
    public void test01() {
        list.add("李白");
        list.add("杜甫");
        list.add("王安石");
        list.add("白居易");
    }





    @Test
    public void test06() {
      /*  list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });*/
        /*list.forEach((s) -> {
            System.out.println(s);
        });*/
        //只有一个参数   方法体内 只有一行代码  可以省略括号
         list.forEach(s-> System.out.println(s));

    }


    @Test
    public void test05() {

        ListIterator<String> stringListIterator = list.listIterator();

        while (stringListIterator.hasNext()) {

            String next = stringListIterator.next();

            System.out.println("next = " + next);
        }
    }

    @Test
    public void test04() {
        for (String s : list) {
            System.out.println(s);
        }
    }

    @Test
    public void test03() {
        for (int i = 0; i < list.size(); i++) {

            System.out.println("list.get(i) = " + list.get(i));
        }
    }

    @Test
    public void test02() {
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println("next = " + next);
        }
    }
}
