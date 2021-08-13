package hahaha.lalala.api.tostring;

public class Person {

    String name;
    int age;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

   /* @Override
    public String toString() {
        return "名字是："+name+"，年龄是："+age;
    }*/

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
