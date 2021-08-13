package hahaha.lalala.overload;

public class TestTri {

    public static void main(String[] args) {

        Triangle t1 = new Triangle();
        t1.a = 3;
        t1.b = 4;
        t1.c = 5;

        double area = GraphicTools.getArea(t1);
        System.out.println("area = " + area);
        System.out.println("-------------------------------------");

        double area1 = GraphicTools.getArea(t1.a, t1.b, t1.c);

        System.out.println("area1 = " + area1);

    }
}
