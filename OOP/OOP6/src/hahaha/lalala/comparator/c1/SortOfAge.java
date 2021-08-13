package hahaha.lalala.comparator.c1;

import java.util.Comparator;

public class SortOfAge implements Comparator {

    /*
    多态 向上转型
    Object o1 = s1;
    Object o2 = s2;

    返回值是一个int值
          >0  前一个对象 > 后一个对象
          ==0 前一个对象 = 后一个对象
          <   0 前一个对象 < 后一个对象
     */
    @Override
    public int compare(Object o1, Object o2) {
        //使用Studnet自己独有的属性  需要向下转型
        Student s1 = (Student)o1;
        Student s2 = (Student)o2;

        //return s1.age - s2.age;

        return Double.compare(s1.score, s2.score);
    }
}
