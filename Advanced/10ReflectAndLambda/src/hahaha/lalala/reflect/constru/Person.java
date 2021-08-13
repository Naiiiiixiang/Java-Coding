package hahaha.lalala.reflect.constru;

public class Person {
    String name;
    int age;

    public Person() {

        System.out.println("无参被调用了");
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
