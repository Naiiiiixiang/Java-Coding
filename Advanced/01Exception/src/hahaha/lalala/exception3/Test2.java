package hahaha.lalala.exception3;

import java.io.FileNotFoundException;

/**
 * 方法重写：
 * <p>
 * 子类不能抛出比父类更大的异常  适用 编译时异常
 * 如果是运行时异常 无所谓
 */
public class Test2 {
    public static void main(String[] args) {

    }

    public void test() throws Exception {

        if (10 == 1) {

            // throw new ArrayIndexOutOfBoundsException("");
            throw new Exception("");
        }
    }
}

class Animal {


    public void eat() throws FileNotFoundException {
        System.out.println("动物吃饭");
    }


}

class Dog extends Animal {
    @Override
    public void eat() throws FileNotFoundException {
        System.out.println("小狗吃饭");
    }


}
