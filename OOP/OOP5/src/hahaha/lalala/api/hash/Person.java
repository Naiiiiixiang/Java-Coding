package hahaha.lalala.api.hash;

public class Person {

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }

    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
