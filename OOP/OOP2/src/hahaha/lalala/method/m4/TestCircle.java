package hahaha.lalala.method.m4;

public class TestCircle {

    public static void main(String[] args) {

        Circle.r = 6;

        Circle c1 = new Circle();
        c1.name = "圆圆";
        c1.introduce();
        double area = Circle.getArea();
        System.out.println("area = " + area);
    }
}
