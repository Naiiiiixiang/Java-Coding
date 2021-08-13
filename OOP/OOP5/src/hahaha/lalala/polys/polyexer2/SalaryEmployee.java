package hahaha.lalala.polys.polyexer2;
//正式工
public class SalaryEmployee extends Employee {
    double salary;//工资
    int workDays;//工作日天数
    int offDays;//请假天数

    public SalaryEmployee(String name, double salary, int workDays, int offDays) {
        super(name);
        this.salary = salary;
        this.workDays = workDays;
        this.offDays = offDays;
    }

    //重写赚钱的方法
    @Override
    public double earning() {
        return salary-salary/workDays*offDays;
    }
}
