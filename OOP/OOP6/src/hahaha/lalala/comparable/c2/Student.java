package hahaha.lalala.comparable.c2;

/*
新建一个 Student   名字 年龄   分数
   创建三个对象  存到 数组内  要求 按照  年龄排序
   使用 Comparable接口实现
 */
public class Student implements Comparable {

    String name;
    int age;
    double score;

    public Student(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public int compareTo(Object o) {// Object o = s2;
        //使用子类自己独有的属性 需要向下转型
        Student s = (Student) o;
       // return this.age - s.age;
        return Double.compare(this.score, s.score);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}