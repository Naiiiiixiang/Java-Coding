package hahaha.lalala.polys.poly4;
/*

instanceOf

变量 instanceOf 类型;

判断左边的变量 是否属于右边的类型；

 */
public class InstanceOfTest {

    public static void main(String[] args) {

        String s  ="你好";
        boolean b = s instanceof String;
        System.out.println("b = " + b);
        System.out.println("s instanceof Object = " + (s instanceof Object));
        Animal a = new Animal();
        Animal c = new Cat();
        Animal c1 = new Dog();
        System.out.println("a instanceof Object = " + (a instanceof Object));
        System.out.println("c instanceof Animal = " + (c instanceof Animal));
        System.out.println("c instanceof Animal = " + (c instanceof Animal));
        System.out.println("c instanceof Object = " + (c instanceof Object));
        System.out.println("c instanceof Cat = " + (c instanceof Cat));
        System.out.println("c instanceof Cat = " + (c instanceof Dog));//false
    }
}
