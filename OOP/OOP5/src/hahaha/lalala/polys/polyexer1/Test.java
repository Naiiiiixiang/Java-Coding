package hahaha.lalala.polys.polyexer1;

public class Test {

    public static void main(String[] args) {
        //创建数组
        Traffic[] ts = new Traffic[2];

        //给数组赋值
        ts[0] = new Car();
        ts[1] = new Bicyle();

        //遍历数组
        for (Traffic t : ts) {
            //使用对象调用  driver();
            t.drive();
        }


    }
}
