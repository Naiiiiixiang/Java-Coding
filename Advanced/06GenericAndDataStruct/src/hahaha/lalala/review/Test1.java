package hahaha.lalala.review;

import java.util.ArrayList;
import java.util.List;

public class Test1 {

    public static void main(String[] args) {
        //将2~100内质数 存到 list 集合内

        //定义集合 存储素数
        List<Integer> list = new ArrayList<>();

        //列出2~100内的数
        l:
        for (int i = 2; i <= 100; i++) {
            for (int j = 2; j < i; j++) {
                //对所有的数进行校验
                if (i % j == 0) {
                    //如果不是质数 直接结束本次 循环 继续 lable 所在层循环
                    continue l;
                }
            }
            //如果是质数 添加到集合内
            list.add(i);
        }
        System.out.println(list);
    }
}
