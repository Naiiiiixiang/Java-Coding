package hahaha.lalala.oopexer2;

public class Test {
    public static void main(String[] args) {
    //创建员工对象1
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        //对象的属性赋值
        e1.name ="张三";
        //创建MyDate类型数据
        MyDate myDate = new MyDate();
        myDate.year = 1985;
        myDate.month = 6;
        myDate.day = 6;




    //引用数据类型传递的是地址值
        e1.date = myDate;
        e1.date.year=2020;

        System.out.println("1名字是："+e1.name+"，生日是："+myDate.year+" 年 "+myDate.month+" 月 "+ myDate.day+" 日");

        System.out.println("--------------------------------------------------------");
        //Exception in thread "main" java.lang.NullPointerException
        System.out.println("2名字是："+e1.name+"，生日是："+e1.date.year+" 年 "+e1.date.month+" 月 "+ e1.date.day+" 日");
    }
}
