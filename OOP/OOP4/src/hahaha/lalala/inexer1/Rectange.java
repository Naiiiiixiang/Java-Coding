package hahaha.lalala.inexer1;

public class Rectange  extends Graphic{

    int length;
    int width;
    public Rectange(int length,int width){
        this.length = length;
        this.width = width;
    }

    public Rectange(String name,int length,int width){
        super(name);
        this.length = length;
        this.width = width;
    }

    public double getArea(){
        return length*width;
    }
    public double getPerimeter() {
        return 2*(length+width);
    }
}
