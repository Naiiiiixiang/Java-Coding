package hahaha.lalala.value;

/*
普通成员变量 vs  静态成员变量
成员变量  vs 局部变量
 1.代码位置不同
        成员变量：类中方法外
        局部变量: 方法内
    内存位置：
          成员变量：堆中
          局部变量：栈中

 2.初始化时间不同
      成员变量： 创建对象分配空间
      局部变量： 方法调用用时分配空间

 3.销毁时间不同：
       成员变量： 等待垃圾回收器回收
       局部变量： 方法执行后 弹栈后消失
 4.是否含有默认值
      成员变量： 有默认值
      局部变量： 必须完成初始化后才能使用  没有默认值
5.作用域问题
      成员变量： 在整个类的范围内有效
      局部变量：  仅仅在当前方法内有效

6.修饰符问题：
    成员变量： 可以被多个修饰符修饰
    局部变量： 能被修饰的很少 final
 */
public class Person {
    public String name;//成员变量

    public void sum() {
        //局部变量
        int a = 20;
        int b = 20;
        System.out.println(a + b);
        System.out.println(name);
    }

    public void introduce() {
        System.out.println(name);
    }
    public static void main(String[] args) {
        Person p1 = new Person();
        System.out.println(p1.name);
        //    p1.name = "李白";
        p1.sum();
    }
}
