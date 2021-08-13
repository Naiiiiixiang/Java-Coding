package hahaha.lalala.comparator.c3;

import hahaha.lalala.comparator.c2.Person;

public class Test {
    public static void main(String[] args) {
        Person p1 = new Person("李白", 20, 99.6);
        Person p3 = new Person("王安石", 22, 99.9);
        Person p2 = new Person("杜甫", 22, 99.5);
        Person p4 = new Person("李商隐", 19, 99.1);

        Person[] ps= {p1,p2,p3,p4};

        System.out.println("排序前");
        printArr(ps);

        //创建排序规则
      //  SortOfScore s1 = new SortOfScore();
        SortOfAge s1 = new SortOfAge();
        ArraysTools.sort(ps, s1);

        System.out.println("排序后");

        printArr(ps);

    }

    //数组的遍历
    public static void printArr(Object[] ps) {
        for (Object p : ps) {
            System.out.println(p);
        }
    }
}
