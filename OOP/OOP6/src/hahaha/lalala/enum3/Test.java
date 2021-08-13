package hahaha.lalala.enum3;
/*
枚举中的常用方法：
  0.枚举中的构造器 默认被private修饰

  1.枚举类.values(); 获取当前枚举类中所有的枚举对象
  2.枚举类.valueOf("枚举的名字");获取指定的枚举对象
  3.枚举对象.ordinal(); 返回当前枚举对象 在 枚举列表中的序列值
     从0 开始
  4.自定义枚举类型 不能再继承其他类 因为它 默认继承自 Enum类

  5.枚举可以实现接口
      既可以总体发展 只重写一次抽象方法
      也可以每一个枚举对象进行自定义重写

6.switch（表达式）
        byte short int char
        String enum

 */
public class Test {
    public static void main(String[] args) {
        Season s1 = Season.SPRING;
        Season s2 = Season.SPRING;
        System.out.println(s1==s2);
        System.out.println("-------------------------------------");
       /* Season[] values = Season.values();
        for (Season value : values) {
            System.out.println("value = " + value);
        }*/

        Season autumn = Season.valueOf("AUTUMN");
        System.out.println("autumn = " + autumn);
        System.out.println("autumn.ordinal() = " + autumn.ordinal());

    }
}
