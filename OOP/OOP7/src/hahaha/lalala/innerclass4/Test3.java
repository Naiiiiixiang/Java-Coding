package hahaha.lalala.innerclass4;

public class Test3 {

    public static void main(String[] args) {
       /*
        无法使用
         obj.method();
         new Object() {} 创建了匿名子类 且完成了该匿名子类对象的创建
                  此子类对象内部 新建了一个方法 method(){}
                  将  子类对象 赋值给  Object obj ;
                  是一个向上转型  所以  obj 只能使用  子类重写父类的以及从父类继承的 无法使用子类自己新增的
         */
        Object obj = new Object() {

            void method() {
                System.out.println("this is method");
            }

            @Override
            public int hashCode() {
                return 10;
            }
        };

        int i = obj.hashCode();
        System.out.println("i = " + i);

        System.out.println("---------------------------------------------");
        //向上转型
        Eat e = new Eat() {
            @Override
            public void eat() {
                System.out.println("吃了吃");
            }
            void sleep(){
                System.out.println("睡了睡");
            }
        };
        e.eat();
        new Eat() {
            @Override
            public void eat() {
                System.out.println("吃了吃");
            }
            void sleep(){
                System.out.println("睡了睡");
            }
        }.sleep();
    }
}
interface Eat {
    void eat();
}
