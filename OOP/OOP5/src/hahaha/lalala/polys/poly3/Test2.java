package hahaha.lalala.polys.poly3;

import hahaha.lalala.polys.poly.Japan;
//多态应用在数组

public class Test2 {
    public static void main(String[] args) {

      /*  int[] arr = {1,2,3,4};

        String[] arr1 = {"你好","世界"};
        Cat[] cs = {new Cat(),new Cat()};
        Dog[] cs1 = {new Dog(),new Dog(),new Cat()};*/

        //一种数据类型的数组 存放多种类型的对象

        Animal [] as = new Animal[3];
        as[0] = new Animal();
        as[1] = new Cat();
        as[2] = new Dog();

        for (Animal a : as) {
            a.eat();
        }
        //人和动物 放到一个数组内
        Object [] os = new Object[3];
        os[0] = new Japan();
        os[1] = new Cat();
        os[2] = new Dog();

    }
}
