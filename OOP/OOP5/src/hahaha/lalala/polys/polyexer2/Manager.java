package hahaha.lalala.polys.polyexer2;

public class Manager extends SalaryEmployee {
    double comm;

    @Override
    public double earning() {
        return (salary-salary/workDays*offDays)*(1+comm);
    }
    public Manager(String name, double salary, int workDays, int offDays, double comm) {
        super(name, salary, workDays, offDays);
        this.comm = comm;
    }

}
