package hahaha.lalala.data.arraylistandvector.linkedList;

import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();


        list.add("李白");

        list.add("杜甫");
        list.add("王安石");
        System.out.println(list);
        //添加到开头
        list.addFirst("辛弃疾");
        //添加到结尾
        list.addLast("白居易");
        System.out.println(list);


        System.out.println("list.getFirst() = " + list.getFirst());

        System.out.println("list.getLast() = " + list.getLast());
        //会将删除的值返回
        System.out.println("list.removeFirst() = " + list.removeFirst());
        System.out.println("list.removeLast() = " + list.removeLast());
        System.out.println(list);


    }
}
