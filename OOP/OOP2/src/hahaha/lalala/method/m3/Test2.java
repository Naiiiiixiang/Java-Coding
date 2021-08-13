package hahaha.lalala.method.m3;
/*
涉及到  返回数据时 如果有校验
   循环  分支判断
   需要返回一个兜底的值

有返回值的方法可以直接进行输出

没有返回值的方法 不能直接输出

 */
public class Test2 {

    public static void main(String[] args) {

       /* int a =   returnValue(20);

        System.out.println("a = " + a);*/
        //有返回值的方法可以直接进行输出
        System.out.println(returnValue(30));

       /* 没有返回值的方法 不能直接输出
        System.out.println(  show());
*/

    }

    public static void show(){
        System.out.println("HelloWorld");
    }

    public static  double returnValue(int num){
        if(num>10){
            return num;
        }
        return 0;
    }
}
