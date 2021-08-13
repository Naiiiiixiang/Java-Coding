package hahaha.lalala.polys.polyexer3;

public class SalaryEmployee extends Employee {

    double salary;
    int workDays;
    int offDays;

    public SalaryEmployee(String name, MyDate date, double salary, int workDays, int offDays) {
        super(name, date);
        this.salary = salary;
        this.workDays = workDays;
        this.offDays = offDays;
    }

    @Override
    public double earning() {
        return salary-salary/workDays*offDays;
    }

    @Override
    public String getInfo() {
        return super.getInfo()+"薪资："+salary+"，工作日天数："+workDays+"，请假天数："+offDays;
    }
}
