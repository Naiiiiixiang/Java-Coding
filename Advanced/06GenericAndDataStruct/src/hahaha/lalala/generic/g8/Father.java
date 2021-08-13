package hahaha.lalala.generic.g8;

public class Father {
    String name;
    int age;

    public Father() {
    }
    public Father(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Father{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
