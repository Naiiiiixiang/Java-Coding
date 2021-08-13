package hahaha.lalala.overload;

public class GraphicTools {




    //根据底边和高，求三角形面积
    public static double getArea(Triangle t){// 3  4 5

       double area =  t.a*t.b/2;
       return area;
    }

    public static double getArea(int a,int b,int c){
        //获取半周长
        double p = (a+b+c)/2;
        //临时被开根号的值
        double tempValue = p*(p-a)*(p-b)*(p-c);
        //求面积
        double area = Math.sqrt(tempValue);
        return area;

    }


}
