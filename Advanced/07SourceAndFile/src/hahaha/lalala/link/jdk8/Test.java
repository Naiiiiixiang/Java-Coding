package hahaha.lalala.link.jdk8;

import java.util.HashMap;

public class Test {

    public static void main(String[] args) {

        HashMap<A, String> map = new HashMap<>();

        map.put(null, "aaa");


        for (int i = 0; i < 100; i++) {
            map.put(new A(i, "A"+i), "值"+i);
        }

    }
}

class A {
    int num;
    String name;

    public A(int num, String name) {
        this.num = num;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        A a = (A) o;

        if (num != a.num) return false;
        return name != null ? name.equals(a.name) : a.name == null;
    }

    @Override
    public int hashCode() {
        if (num % 2 == 0) {
            return 1;
        }
        return num;
    }

    @Override
    public String toString() {
        return "A{" +
                "num=" + num +
                ", name='" + name + '\'' +
                '}';
    }
}
