package hahaha.lalala.generic.g4;
/*
有一个学生类型  不同的任课老师

数学老师   99 97.5  98.8
语文老师  优秀  良好
英语老师  A  B   C  D
泛型 ： 类型化参数
   Student<T> T 形参
   Student<String>  String 实参
 */
public class Student<T> implements Comparable<Student>{
    String name;
    T score;//分数

    public Student(String name, T score) {
        this.name = name;
        this.score = score;
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return 0;
    }
}
