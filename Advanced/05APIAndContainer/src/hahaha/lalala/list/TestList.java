package hahaha.lalala.list;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/*
Collection
  -- List  有序  按照元素添加的顺序进行存储
           不唯一 数据可以重复

     相较于Collection 新增了 操作下标相关的方法
     将元素添加到指定的位置
     add(index,Element);
     获取指定位置的元素
     list.get(index);
     set(idnex,ele);
     remove(index);
     subList(s,e);
 */
public class TestList {
    @Test
    public void test04() {
        List<String> list = new ArrayList<>();
        list.add("李白");
        list.add("杜甫");
        list.add("王安石");
        list.add("李白");

        list.clear();
        list.contains("");
        list.size();

    }


    @Test
    public void test03() {
        List<String> list = new ArrayList<>();
        list.add("李白");
        list.add("杜甫");
        list.add("王安石");
        list.add("李白");
        /*
        获取一段集合
        list.subList(startIndex, endIndex);
        [startIndex,endIndex)
         */
        List<String> subList = list.subList(0, 2);

        System.out.println("subList = " + subList);

    }


    @Test
    public void test02() {
        List<String> list = new ArrayList<>();
        list.add("李白");
        list.add("杜甫");
        list.add("王安石");
        list.add("李白");
        System.out.println(list);
        //删除指定位置的元素
        list.remove(1);
        System.out.println(list);
        //获取指定元素第一次出现的下标
        int indexOf = list.indexOf("李白");
        System.out.println("indexOf = " + indexOf);
        int lastIndexOf = list.lastIndexOf("李白");
        System.out.println("lastIndexOf = " + lastIndexOf);
    }

    @Test
    public void test01(){
        List<String> list = new ArrayList<>();

        list.add("李白");
        list.add("杜甫");
        list.add("王安石");

        list.add(1, "米莱迪");
        list.add(0, "米莱迪");

        System.out.println(list);

        String s = list.get(2);

        System.out.println("s = " + s);
        //设置指定位置的元素
        list.set(2, "嬴政");
        System.out.println(list);




    }


}
