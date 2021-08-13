package hahaha.lalala.method.mexer3;

public class GraphicTools {

    /**
     * 比较圆的面积大小
     *
     * @param c1 第一个圆
     * @param c2 第二个圆
     * @return 面积较大的圆
     */
    public static Circle compareCircle(Circle c1, Circle c2) {
        double area1 = c1.radius * c1.radius * Math.PI;
        double area2 = c2.radius * c2.radius * Math.PI;
        /*if(area1>area2){
            return c1;
        }else{
            return c2;
        }*/
        return area1 > area2 ? c1 : c2;
    }

}
