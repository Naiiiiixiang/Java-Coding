package hahaha.lalala.lambda.l1;

import java.util.Comparator;

/*
函数式接口
SAM
single Abstract Method
只能有一个抽象方法  @FunctionalInterface 校验当前接口 是否为 函数式接口
Comparator
函数式接口的分类：
    消费型  只接受参数 不返回任何数据  貔貅
    供给型  雷锋  奉献自己
    判断型/断言型   无论接受什么类型参数 都会返回 boolean类型
    功能型    既接受参数 也返回数据

可以存在其他的 全局静态常量
 默认方法
 静态方法

 */
@FunctionalInterface
public interface A {
    public static final int NUM = 20;
    void a1();
    public default void cc(){
    }
    public static void show(){

    }
}
