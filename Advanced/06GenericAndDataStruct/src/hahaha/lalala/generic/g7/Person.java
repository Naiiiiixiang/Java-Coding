package hahaha.lalala.generic.g7;

class Person<T> {
    String name;
    T score;

    public Person() {
    }

    public Person(String name, T score) {
        this.name = name;
        this.score = score;
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}