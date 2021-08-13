package hahaha.lalala.abstractexer1;

public abstract class Graphic {
    abstract void getArea();
}

class Circle extends Graphic {
    int r;

    public Circle(int r) {
        this.r = r;
    }

    @Override
    void getArea() {
        System.out.println("圆的面积是：" + Math.PI * r * r);
    }
}

class JuXing extends Graphic {
    int length;
    int width;

    public JuXing(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    void getArea() {
        System.out.println("矩形面积是：" + length * width);
    }
}
