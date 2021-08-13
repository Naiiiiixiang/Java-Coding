package hahaha.lalala.comparable.c2;


/*
1.让比较对象的类型 实现 Comparable

2.重写 comparabto 方法

3.指定比较规则
    年龄比较

创建三个对象  存到 数组内  要求 按照  年龄排序
        num > 0 :s1 > s2
        num ==0 :s1 == s2
        num < 0 :s1 < s2
 */
public class Test {

    public static void main(String[] args) {
        Student s1 = new Student("张三", 20, 99.2);
        Student s2 = new Student("李四", 22, 99.1);
        Student s3 = new Student("王五", 21, 99.3);
        //将对象存到数组内
        Student [] ss = new Student[3];
        ss[0] = s1;
        ss[1] = s2;
        ss[2] = s3;

        //排序前：
        printStudent(ss, "排序前");
        sort1(ss);
        printStudent(ss, "排序后");


    }

    /**
     * 遍历数组
     * @param ss 数组名
     * @param message 遍历的信息
     */
    public static void printStudent(Student[] ss, String message) {
        System.out.println(message);
        for (Student s : ss) {
            System.out.println(s);
        }
    }

    /**
     * 完成数组元素的排序
     * 冒泡排序完成
     * @param ss
     */
    private static void sort1(Student[] ss) {

        for (int i = 0; i < ss.length-1; i++) {

            for(int j = 0;j<ss.length-i-1;j++){

                //当前一个对象的分数 大于 后一个对象的分数 俩数交换位置
                if(ss[j].compareTo(ss[j+1])>0){

                    Student temp = ss[j];
                    ss[j] = ss[j+1];
                    ss[j+1] = temp;
                }
            }

        }
    }
}
