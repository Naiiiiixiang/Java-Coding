package hahaha.lalala.review;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*

学生类型是 Student
一班 有 3个 学生
二班 有 2个 学生


将两个班的学生都存到Map内 ，

使用 班级作为key
String  一班
        二班


 */
public class Test3 {

    @Test
    public void test01() {

        Map<String, ArrayList<Student>> map = new HashMap<>();

        //新建一班的数据
        Student lb = new Student("lb", 20);
        Student df = new Student("df", 20);
        Student was = new Student("王安石", 20);

        ArrayList<Student> list1 = new ArrayList<>();
        list1.add(lb);
        list1.add(df);
        list1.add(was);
        //将一班数据添加到map集合内
        map.put("一班", list1);

        //新建二班的数据
        Student aql = new Student("安琪拉", 20);
        Student yz = new Student("嬴政", 20);

        ArrayList<Student> list2 = new ArrayList<>();
        list2.add(aql);
        list2.add(yz);

        //将二班数据添加到map集合内
        map.put("二班", list2);


        System.out.println(map.size());
        System.out.println("map = " + map);

    }


}
