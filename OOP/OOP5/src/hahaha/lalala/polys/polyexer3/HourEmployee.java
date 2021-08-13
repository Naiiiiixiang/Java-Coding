package hahaha.lalala.polys.polyexer3;

public class HourEmployee extends Employee{
    int workHours;
    double hourSalary;

    public HourEmployee(String name, MyDate date, int workHours, double hourSalary) {
        super(name, date);
        this.workHours = workHours;
        this.hourSalary = hourSalary;
    }

    @Override
    public double earning() {
        return  hourSalary*workHours;
    }

    @Override
    public String getInfo() {
        return super.getInfo()+"，小时数："+workHours+"，时薪："+hourSalary;
    }
    public void leave(){
        System.out.println("离开 .......");

    }
}
