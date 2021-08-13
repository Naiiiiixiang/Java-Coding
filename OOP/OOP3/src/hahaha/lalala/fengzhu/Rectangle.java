package hahaha.lalala.fengzhu;

public class Rectangle {

    private static int sides = 4;
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }
    public int getSides(){
        return sides;
    }

    public void show(){
        System.out.println("长是:"+length+" ,宽是:"+width+" 边长数量是"+sides);
    }

    //设置宽度
    public void setWidth(int width){
        this.width = width;
    }
    //获取宽度
    public int getWidth(){
        return width;
    }
    //设置长度
    public void setLength(int length){
        this.length = length;
    }
    //获取长度
    public int getLength(){
        return length;
    }


}
