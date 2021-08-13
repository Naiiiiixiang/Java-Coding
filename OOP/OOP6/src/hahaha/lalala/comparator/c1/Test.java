package hahaha.lalala.comparator.c1;
/*
使用外部比较器完成 对象的比较

1.创建一个类用于制定比较规则  此类 需要实现 Comparator

2.重写接口中的抽象方法 compare(Object o1,Object o2)

3.制定比较规则

4.创建比较规则对象
5.通过比较规则对象 调用 compare方法 进行比较
6.会返回一个int值 进行判断对象大小
           >0  前一个对象 > 后一个对象
          ==0  前一个对象 = 后一个对象
          <0   前一个对象 < 后一个对象


 */
public class Test {
    public static void main(String[] args) {

        //创建学生对象
        Student s1 = new Student("李白", 20, 99.7);
        Student s2 = new Student("杜甫", 21, 99.6);

        //创建比较规则对象
        SortOfAge sortOfAge = new SortOfAge();

        int compare = sortOfAge.compare(s1, s2);

        System.out.println(compare);



    }
}
