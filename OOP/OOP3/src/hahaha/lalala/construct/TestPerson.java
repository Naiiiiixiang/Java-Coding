package hahaha.lalala.construct;
/*
问题：当类的属性很多时  给成员变量 赋值 是一个体力活

解决： 构造器/构造方法解决

创建构造器：
  语法结构： [修饰符] 类名(参数列表){

           }

注意：
    1.每一个类中都会有一个隐藏的无参的构造器
      但是 当 此类如果声明了一个有参构造器 那么 隐藏的无参的构造器会自动消失
    2.当创建类时 尽量显示提供一个无参构造器

    3.如何调用构造器 使用new 关键字调用构造器

    4.构造器支持重载


 */
public class TestPerson {

    public static void main(String[] args) {
        //创建Person对象
        Person p1 = new Person();
        p1.name = "马尔扎哈";
        p1.age = 18;
        p1.sex = '男';
        p1.height = 1.80;
        p1.introduce();

        System.out.println("----------------------------------");

        Person p2 =
                new Person("李白", 20, '男', 1.81);

        p2.introduce();
        System.out.println("----------------------------------");

        Person p3 = new Person("王安石");

        p3.introduce();

        System.out.println("----------------------------------");


    }

}
