package hahaha.lalala.arr;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 使用Arrays比较自定义类型 有两种方式
 * 方式一：
 * Arrays.sort(自定义类型数组); 该类型 必须实现Comparable接口 定义比较规则
 * 方式二：
 * Arrays.sort(自定义类型数组，Comparator);
 */

public class ArraysToosTest {


    @Test
    public void test09() {
        Student p1 = new Student("李白", 20, 9999.9);
        Student p2 = new Student("杜甫", 19, 9999.7);
        Student p3 = new Student("王安石", 22, 9999.1);
        Student p4 = new Student("李商隐", 17, 9999.6);
        Student[] ps = {p1, p2, p3, p4};
        System.out.println("排序前");
        printObject(ps);
        //匿名内部类实现
        Arrays.sort(ps, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Student s1 = (Student) o1;
                Student s2 = (Student) o2;
                return Double.compare(s1.salary, s2.salary);
            }
        });
        System.out.println("排序后");
        printObject(ps);

    }

    @Test
    public void test08() {
        Student p1 = new Student("李白", 20, 9999.9);
        Student p2 = new Student("杜甫", 19, 9999.7);
        Student p3 = new Student("王安石", 22, 9999.1);
        Student p4 = new Student("李商隐", 17, 9999.6);
        Student[] ps = {p1, p2, p3, p4};

        System.out.println("排序前");
        printObject(ps);
        //新建比较规则对象
        SortOfAge sortOfAge = new SortOfAge();
        //将比较规则对象作为参数进行传递
        Arrays.sort(ps, sortOfAge);//多态
        System.out.println("排序后");
        printObject(ps);


    }


    @Test
    public void test07() {
        Person p1 = new Person("李白", 20, 9999.9);
        Person p2 = new Person("杜甫", 19, 9999.7);
        Person p3 = new Person("王安石", 22, 9999.1);
        Person p4 = new Person("李商隐", 17, 9999.6);
        Person[] ps = {p1, p2, p3, p4};

        System.out.println("排序前");
        printObject(ps);
        Arrays.sort(ps);
        System.out.println("排序后");
        printObject(ps);
    }

    //遍历数组
    public void printObject(Object[] ps) {
        for (Object p : ps) {
            System.out.println(p);
        }
    }


    @Test
    public void test06() {
        int[] arr = {10, 20, 30, 40, -9, -1};
        System.out.println(Arrays.toString(arr));
        //快速排序
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        //前提是 数组有序
        int i = Arrays.binarySearch(arr, 40);
        System.out.println("i = " + i);
        //使用二分查找 如果没有此元素 会返回负数
        i = Arrays.binarySearch(arr, 400);
        System.out.println("i = " + i);
    }


    @Test
    public void test05() {
        int[] arr = {10, 20, 30, 40};
        System.out.println(arr);//[I@5d6f64b1
        System.out.println(Arrays.toString(arr));//[I@5d6f64b1

        int[][] arr1 = {{10, 20, 30, 40}, {66, 88}};
        // System.out.println(Arrays.toString(arr1));//[I@5d6f64b1
        // deepToString： 快速遍历二维数组
        System.out.println("Arrays.deepToString(arr1) = " + Arrays.deepToString(arr1));
    }


    @Test
    public void test04() {
        String[] arr = {"李白", "杜甫", "张三", "李四"};
        String[] arr1 = {"李白", "杜甫", "李四", "张三"};
        System.out.println(arr == arr1);
        //比较数组内容是否一致 对应下标的元素是否一致
        boolean equals = Arrays.equals(arr, arr1);
        System.out.println("equals = " + equals);
    }


    @Test
    public void test03() {
        String[] arr = {"李白", "杜甫", "张三", "李四"};
        /**
         按照下标范围复制数组元素
         [开始下标,结束下标)
         Arrays.copyOfRange(数组名, 开始下标, 结束下标);
         */
        String[] strings = Arrays.copyOfRange(arr, 1, 3);
        System.out.println("Arrays.toString(strings) = " + Arrays.toString(strings));
    }

    @Test
    public void test02() {
        String[] arr = {"李白", "杜甫", "张三", "李四"};
        //Arrays.copyOf(数组名,新的长度)
        String[] newArr = Arrays.copyOf(arr, arr.length * 2);
        System.out.println(Arrays.toString(newArr));


    }


    @Test
    public void test01() {
        int[] arr = new int[10];
        System.out.println(Arrays.toString(arr));
        //数据元素快速填充
        //Arrays.fill(arr, 66);
        /**
         [开始下标,结束下标)
         Arrays.fill(数组名, 开始下标, 结束下标, 添加的值);
         */
        Arrays.fill(arr, 1, 5, 88);
        System.out.println(Arrays.toString(arr));
    }
}
