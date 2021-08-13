package hahaha.lalala.annotation;

import java.util.Date;

/*
注解： 解释说明 代码
     @Override 校验当前方法是否为重写方法
     @Deprecated 标记过时
          不推荐使用 已经有了更好的实现方式
     @SuppressWarnings 抑制警告
 */
public class Test {

    @SuppressWarnings("all")
    public static void main(String[] args) {
        int num = 20;

        Date d = new Date();
        int date = d.getDate();

        System.out.println(date);

        Person person = new Person();
        person.eat();
        ;

    }
}

abstract class Animal {
    abstract void eat();
}

@Deprecated
class Person extends Animal {
    @Deprecated
    @Override
    void eat() {
        System.out.println("吃饭");
    }
}
