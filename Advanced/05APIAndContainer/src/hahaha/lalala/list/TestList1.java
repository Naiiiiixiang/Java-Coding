package hahaha.lalala.list;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestList1 {

    @Test
    public void test01(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        //list.remove(2);
        //如果泛型是Integer 删除元素时 需要将其变为 包装类型
        list.remove(new Integer(2));
        System.out.println(list);

    }
}
