package hahaha.lalala.comparator.c3;

import hahaha.lalala.comparator.c2.Person;

import java.util.Comparator;

/*
让人类按照 年龄进行排序
 */
public class SortOfAge implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Person p1 = (Person)o1;
        Person p2 = (Person)o2;

        return -(p1.getAge()-p2.getAge());
    }
}
