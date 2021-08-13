package hahaha.lalala.method.mexer2;

public class JuXing {

    int length;//长
    int width;//宽

    //求面积
    public int getArea(){
        return length*width;
    }
    //求周长
    public int getZhouChang(){
       return (length+width)*2;
      //  System.out.println(length);
    }

    public String getInfo(){
        return "长："+length+"，宽："+width+"，面积是："+getArea()+"，周长是："+getZhouChang();
    }


}
