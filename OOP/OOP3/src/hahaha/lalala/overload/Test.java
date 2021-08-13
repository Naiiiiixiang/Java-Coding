package hahaha.lalala.overload;
/*
方法重载： 使用相同的方法名 表示 不同的方法

方法命名规范： 见名之意

方法重载注意点：
    同一类中同一方法名 不同形参列表
                          数量
                          顺序
                          类型

  特别注意： 方法的修饰符 与 返回值类型 不是构成重载的条件
 */
public class Test {

    public static void main(String[] args) {

       /* getSum(10,20);

        getSum(20,3.14);*/

       getSum(10,20,30);
    }

    public static void getSum(int i, int i1) {
        System.out.println("int + int"+(i+i1));
    }
    public static void getSum(int num,double d){
        System.out.println("int + double："+(num+d));
    }

    public static void getSum(double num,int d){
        System.out.println("double + int："+(num+d));
    }

    public static void getSum(){
        System.out.println("空参 ");
    }
  /*  public static int getSum(){
        System.out.println("空参 ");
        return 10;
    }*/

    public static void getSum(int i, int i1,int i3) {
        System.out.println("int + int+ int :");
    }



}
