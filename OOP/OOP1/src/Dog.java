/*

属性：
  毛色
  昵称
行为：
  看家
 */


public class Dog {

    String color;//毛色

    String nickName;//昵称

    public void lookHome(){

        System.out.println("看家");
    }

    public static void main(String[] args) {
        //类名  对象名 = 类名();
        Dog dog = new Dog();
        dog.color="黄色";
        dog.nickName="旺财";

        System.out.println("昵称是："+dog.nickName+",颜色是："+dog.color);
        dog.lookHome();
        System.out.println("-------------------------------------");

        Dog dog1 = new Dog();

        dog1.color="白色";
        dog1.nickName="小白";
        System.out.println("昵称是："+dog1.nickName+",颜色是："+dog1.color);
        dog1.lookHome();
    }
}
