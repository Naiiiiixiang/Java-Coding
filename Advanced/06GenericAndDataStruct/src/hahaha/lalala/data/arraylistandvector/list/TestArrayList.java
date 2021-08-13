package hahaha.lalala.data.arraylistandvector.list;

import org.junit.Test;

import java.util.Iterator;

public class TestArrayList {

    @Test
    public void test05() {
        ArrayList<String> arr = new ArrayList<>(10);//4
        arr.add("李白");
        arr.add("杜甫");
        arr.add("王安石");
        arr.add("李商隐");
        Iterator<String> iterator = arr.iterator();
        while (iterator.hasNext()){
            String ele = iterator.next();
            System.out.println("ele = " + ele);
        }
    }
    @Test
    public void test04() {
        ArrayList<String> arr = new ArrayList<>(10);//4
        arr.add("李白");
        arr.add("杜甫");
        arr.add("王安石");
        arr.add("李商隐");
        System.out.println("arr.size() = " + arr.size());
        arr.delete("杜甫");
        System.out.println(arr);
        System.out.println("arr.size() = " + arr.size());
    }
    @Test
    public void test03() {

        ArrayList<String> arr = new ArrayList<>(10);//4
        arr.add("李白");
        arr.add(null);
        arr.add("杜甫");
        arr.add("李白");
        arr.isContain("杜甫");

        arr.delete(21);
        System.out.println(arr);

    }
    @Test
    public void test02() {

        ArrayList<String> arr = new ArrayList<>(10);//4
        arr.add("李白");
        arr.add(null);
        arr.add("杜甫");
        arr.add("李白");

        int index = arr.indexOf("李白");

        System.out.println("index = " + index);


    }

    @Test
    public void test01() {

        ArrayList<String> arr = new ArrayList<>(2);//4
        arr.add("李白");
        arr.add("杜甫");
        arr.add("王安石");
        arr.add("王维");
        arr.add("苏轼");
        int size = arr.size();

        System.out.println("size = " + size);
        //  com.atguigu.data.arraylistandvector.list.ArrayList@5d6f64b1
        System.out.println(arr);
        //[李白, 杜甫, 王安石]
    }
}
