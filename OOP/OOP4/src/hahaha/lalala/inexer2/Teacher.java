package hahaha.lalala.inexer2;

public class Teacher extends Person {
    private double salary;



    public Teacher(double salary,String name, int age, char sex){
        super(name,age,sex);
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Override
    public String getInfo() {
        return super.getInfo()+",薪资："+salary;
    }
}
