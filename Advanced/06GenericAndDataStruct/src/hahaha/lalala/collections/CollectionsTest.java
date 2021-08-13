package hahaha.lalala.collections;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
Collection： 单列集合的顶级接口
Collections:是操作集合的工具类
 */
public class CollectionsTest {


    @Test
    public void test05() {
        ArrayList<String> list = new ArrayList<>();
        list.add("你好");
        Collections.addAll(list, "李白", "杜甫", "王安石", "李商隐");
        //将线程不安全的集合 变为 线程安全的集合
        List<String> list1 = Collections.synchronizedList(list);
    }


    @Test
    public void test04() {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "李白", "杜甫", "王安石", "李商隐");

        //将此集合变为 不能修改的集合
        List<String> strings = Collections.unmodifiableList(list);
        //strings.add("666");
        System.out.println(strings);

        System.out.println("--------------------------------");

        List<Integer> asList = Arrays.asList(10, 20, 30);
        asList.add(20);


    }

    @Test
    public void test03() {

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "李白", "杜甫", "王安石", "李商隐");

        ArrayList<String> newArrayList = new ArrayList<>();

        Collections.addAll(newArrayList, "", "", "", "");
        /*
        dest:目标集合
        src:数据源集合
        copy(dest, src)
        dest.size()>= src.size();
         if (srcSize > dest.size())
            throw new IndexOutOfBoundsException("Source does not fit in dest");
         */
        Collections.copy(newArrayList, list);


        System.out.println("newArrayList = " + newArrayList);

    }

    @Test
    public void test02() {

        ArrayList<String> list = new ArrayList<>();

        Collections.addAll(list, "李白", "杜甫", "王安石", "李商隐", "李白");
        System.out.println(list);
        //交换集合内指定位置的元素
        Collections.swap(list, 0, 2);
        System.out.println("list = " + list);
        //集合内指定元素出现的次数
        int frequency = Collections.frequency(list, "李白");
        System.out.println("frequency = " + frequency);


    }


    @Test
    public void test01() {

        ArrayList<Integer> list = new ArrayList<>();
        //批量新增
        Collections.addAll(list, 10, 20, 30, 1, 9, 6);
        System.out.println(list);
      /*  list.add(10);
        list.add(3);
        list.add(4);*/
        //排序
        Collections.sort(list);
        System.out.println(list);
        /*
        二分查找：
              有序
         */
        int i = Collections.binarySearch(list, 20);
        System.out.println("i = " + i);
        /*
        打乱顺序
        洗牌
         */
        Collections.shuffle(list);
        System.out.println("list = " + list);//[1, 10, 20, 9, 6, 30] [10, 20, 30, 9, 6, 1]
    }

}
