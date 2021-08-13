package hahaha.lalala.polys.polyexer3;

public class Manager extends SalaryEmployee {

    double comm;

    public Manager(String name, MyDate date, double salary, int workDays, int offDays, double comm) {
        super(name, date, salary, workDays, offDays);
        this.comm = comm;
    }

    @Override
    public double earning() {
        return (salary-salary/workDays*offDays)*(1+comm);
    }

    @Override
    public String getInfo() {
        return super.getInfo()+",奖金比例："+comm;
    }
}
