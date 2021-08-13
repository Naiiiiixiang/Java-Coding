package hahaha.lalala.generic.g8;

import java.util.Comparator;

public class Test {

    @org.junit.Test
    public void test02() {
        //创建数组
        Son[] ss = new Son[4];
        //向数组内添加元素
        ss[0] = new Son("李白", 20, 99.7);
        ss[1] = new Son("杜甫", 19, 99.6);
        ss[2] = new Son("王安石", 18, 99.9);
        ss[3] = new Son("李商隐", 21, 99.4);

        //排序前
        System.out.println("排序前");
        for (Son s : ss) {
            System.out.println(s);
        }
        ArraysTools.sort(ss, new Comparator<Father>() {
            @Override
            public int compare(Father o1, Father o2) {
                return o1.age-o2.age;
            }
        });
        //排序后
        System.out.println("排序后");
        for (Son s : ss) {
            System.out.println(s);
        }


    }

    @org.junit.Test
    public void test01() {
        //创建数组
        Son[] ss = new Son[4];
        //向数组内添加元素
        ss[0] = new Son("李白", 20, 99.7);
        ss[1] = new Son("杜甫", 19, 99.6);
        ss[2] = new Son("王安石", 18, 99.9);
        ss[3] = new Son("李商隐", 21, 99.4);

        //排序前
        System.out.println("排序前");
        for (Son s : ss) {
            System.out.println(s);
        }
        ArraysTools.sort(ss, new Comparator<Son>() {
            @Override
            public int compare(Son o1, Son o2) {
                return Double.compare(o1.score, o2.score);
            }
        });
        //排序后
        System.out.println("排序后");
        for (Son s : ss) {
            System.out.println(s);
        }

    }
}
