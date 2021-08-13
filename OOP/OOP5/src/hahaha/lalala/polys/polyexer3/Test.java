package hahaha.lalala.polys.polyexer3;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {

        Employee[] es = new Employee[3];

        SalaryEmployee s1 = new SalaryEmployee("张三", new MyDate(2000, 1, 1), 22000, 22, 1);
        HourEmployee h1 = new HourEmployee("李四", new MyDate(2001, 1, 2), 12, 30);
        Manager m = new Manager("王五", new MyDate(2002, 1, 1), 20000, 20, 2, 0.25);
        es[0] = s1;
        es[1] = h1;
        es[2] = m;
        Scanner in = new Scanner(System.in);
        System.out.println("请输入当前的月份");
        int month = in.nextInt();

        for (Employee e : es) {
                //判断是否为正式工
            if(e instanceof SalaryEmployee){// Mangger 属于 SalaryEmployee
                if(e.date.month==month){
                    System.out.println(e.name+" 祝你生日快乐");
                }
            }else{
                HourEmployee h = (HourEmployee)e;
                h.leave();
            }
            System.out.println("e.getInfo() = " + e.getInfo());
        }




    }
}
