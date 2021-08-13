package hahaha.lalala.comparable.c3;

import hahaha.lalala.comparable.c1.Person;

public class Test {
    public static void main(String[] args) {
        /*Student s1 = new Student("张三", 20, 99.2);
        Student s2 = new Student("李四", 22, 99.1);
        Student s3 = new Student("王五", 21, 99.4);
        Student s4 = new Student("赵六", 21, 99.3);
        //将对象存到数组内
        Student [] ss = {s1,s2,s3,s4};*/
        Person p1 = new Person("李白", 20, 99.6);
        Person p2 = new Person("李四", 19, 99.4);
        Person p3 = new Person("王五", 17, 99.4);
        Person p4 = new Person("赵六", 22, 99.4);

        Person[] ss = {p1,p2,p3,p4};

        System.out.println("排序前：");
        printStudent(ss);

        ArraysTools.sort(ss);
        System.out.println("排序后：");
        printStudent(ss);
    }

    public static void printStudent(Object[] ss) {
        for (Object s : ss) {
            System.out.println(s);
        }
    }
}
