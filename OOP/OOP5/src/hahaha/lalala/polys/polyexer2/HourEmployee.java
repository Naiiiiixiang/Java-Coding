package hahaha.lalala.polys.polyexer2;

public class HourEmployee  extends Employee{

    int workHours;
    double hourSalary;

    public HourEmployee(String name, int workHours, double hourSalary) {
        super(name);
        this.workHours = workHours;
        this.hourSalary = hourSalary;
    }

    @Override
    public double earning() {
        return  hourSalary*workHours;
    }
}
