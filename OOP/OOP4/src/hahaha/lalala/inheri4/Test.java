package hahaha.lalala.inheri4;
/*
方法重写：
 为什么进行方法重写？
   当父类的方法 不能满足子类的需求 要对父类方法进行重写
方法重写的要求？
    子类重写父类方法时 子类方法
  1. 访问权限 不能比父类更加严格
             >=父类访问权限
  2.返回值类型
            基本数据类型  必须与父亲一致
            引用类型数据 与父类返回值类型一致
                         或者是该父类的子类
 3.形参列表  必须与父类完全一致
 4.异常  子类不能抛出比父类更大的异常 （了解）*****


注意：
    静态方法 没有重写
 */
public class Test {

    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.name = "小花";
        cat.age = 20;
        cat.color = "花色";

        cat.show();



    }
}
