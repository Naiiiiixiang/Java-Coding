package hahaha.lalala.comparator.c2;

import java.util.Comparator;

public class SortOfScore implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        //向下转型才能获取子类独有的属性
        Person p1 = (Person) o1;
        Person p2 = (Person) o2;
        return Double.compare(p1.getScore(), p2.getScore());
    }
}
