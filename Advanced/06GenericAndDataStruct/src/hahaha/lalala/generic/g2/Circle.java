package hahaha.lalala.generic.g2;

public class Circle implements Comparable<Circle>{
    int r;
    String name;

    @Override
    public int compareTo(Circle o) {
        return this.r - o.r;
    }


   /* @Override
    public int compareTo(Object o) {
        return 0;
    }*/
}
