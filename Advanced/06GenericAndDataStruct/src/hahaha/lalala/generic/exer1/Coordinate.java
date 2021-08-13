package hahaha.lalala.generic.exer1;

public class Coordinate<T> {
    T x;
    T y;

    public Coordinate(T x, T y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString() {
        return "Coordinate{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
