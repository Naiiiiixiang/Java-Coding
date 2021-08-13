package hahaha.lalala.innerclass4;
class SuperMan implements Fly{
    @Override
    public void fly() {
        System.out.println("超人 拯救世界 飞飞");
    }
}
public class Test4 {
    public static void main(String[] args) {
        //创建超人对象
     //   SuperMan s = new SuperMan();
        // 多态
       /* Fly fly = new Fly() {
            @Override
            public void fly() {
                System.out.println("超人 拯救世界 飞a飞a");
            }
        };
        //把对象作为实参
        showFly(fly);*/
       showFly(new Fly() {
           @Override
           public void fly() {
               System.out.println("超人 拯救世界 飞a飞a .......");
           }
       });

       showFly(new Fly() {
           @Override
           public void fly() {
               System.out.println("小鸟飞");
           }
       });
    }
    public static void showFly(Fly f){// Fly f = 匿名子类对象;
        f.fly();
    }
}
interface Fly{
    void fly();
}
