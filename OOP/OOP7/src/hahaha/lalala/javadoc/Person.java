package hahaha.lalala.javadoc;

public class Person {

    String name;
    int age;

    /**
     * 无参构造
     */
    public Person() {
    }

    /**
     * 有参构造器
     * @param name  姓名
     * @param age   年龄
     */
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 求和的方法
     * @param a 第一个加数
     * @param b 第二个加数
     * @return 和
     */
    public static int sum(int a,int b){
        return a+b;
    }

    /**
     * 这是toString()
     * @return 属性内容的字符串
     */
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
