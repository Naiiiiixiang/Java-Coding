package hahaha.lalala.reflect.field;

public class Person  extends Man{
    String name;
    private int age;
    private double salary;
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}

class Man{

    public String sex;
}
