package hahaha.lalala.polys.polyexer3;

public class Employee {
    String name;
    MyDate date;


    public Employee() {
    }

    public Employee(String name, MyDate date) {
        this.name = name;
        this.date = date;
    }

    public double earning(){
        return 0;
    }
    public String getInfo(){
        return "名字："+name+"，工资："+earning();
    }
}
class MyDate{
    int year;
    int month;
    int day;
    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
}