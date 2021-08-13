package hahaha.lalala.inexer2;

public class Test {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.setScore(99);
        s1.setAge(18);
        s1.setName("小明");
        s1.setSex('男');
        String info = s1.getInfo();
        System.out.println("info = " + info);
        System.out.println("--------------------------------------");
        Teacher t1 = new Teacher(6000, "小明", 29, '女');
        String info1 = t1.getInfo();
        System.out.println("info1 = " + info1);
    }
}
