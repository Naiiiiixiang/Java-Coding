package hahaha.lalala.polys.polyexer2;

public class Test {
    public static void main(String[] args) {
        //创建数组
        Employee[] es = new Employee[3];
        es[0] = new SalaryEmployee("小明", 22000, 22, 1);
        Manager manager = new Manager("大明", 20000, 20, 2, 0.3);
        es[1] = manager;
        es[2] = new HourEmployee("中明", 12, 20);
        //遍历数组
        for (Employee e : es) {
            String info = e.getInfo();
            System.out.println("info = " + info);
        }
    }
}
