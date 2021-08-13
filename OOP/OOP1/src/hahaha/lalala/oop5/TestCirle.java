package hahaha.lalala.oop5;

public class TestCirle {

    public static void main(String[] args) {

        //创建对象
        Circle c1 = new Circle();
        //给半径赋值
        c1.r = 5;
        System.out.println(Math.PI);

        double area = c1.r*Math.PI*c1.r;

        System.out.println("area = " + area);
    }
}
