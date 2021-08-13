package hahaha.lalala.generic.g8;

public class Son extends Father {

    double score;

    public Son(String name, int age, double score) {
        super(name, age);
        this.score = score;
    }

    public Son() {
    }

    @Override
    public String toString() {
        return "Son{" +
                "score=" + score +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
