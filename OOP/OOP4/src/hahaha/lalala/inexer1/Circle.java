package hahaha.lalala.inexer1;

public class Circle extends Graphic{

    int radius;

    public double getArea() {
        return Math.PI*radius*radius;
    }

    public double getPerimeter() {
        return 2*Math.PI*radius;
    }

    public String getInfo() {
        return super.getInfo()+"半径是："+radius;
    }
}
