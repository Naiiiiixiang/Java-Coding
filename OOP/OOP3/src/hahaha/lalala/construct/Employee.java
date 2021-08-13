package hahaha.lalala.construct;

public class Employee {

    private String no;
    private String name;
    private double salary;
    private char sex;

    public Employee() {
    }

    public Employee(String no, String name, double salary, char sex) {
        this.name = name;
        this.no = no;
      //  this.salary = salary;
       // this.sex = sex;
        setSex(sex);
        setSalary(salary);
    }

    //设置薪资
    public void setSalary(double salary){
        if(salary>=10000 && salary<=20000){
            this.salary = salary;
        }else{
            System.out.println("薪水输入有误 请重新输入 默认薪资 为 1万元");
            this.salary = 10000;
        }
    }
    //获取薪资
    public double getSalary(){
        return salary;
    }
    //设置性别
    public void setSex(char sex){
        if(sex=='男'|| sex=='女'){
            this.sex = sex;
        }else{
            System.out.println("请您输入正确的性别，默认性别是男");
            this.sex = '男';
        }
    }
    //获取性别
    public char getSex(){
        return sex;
    }
    //设置编号
    public void setNo(String no) {
        this.no = no;
    }
    //获取编号
    public String getNo(){
        return no;
    }
    //设置名字
    public void setName(String name){
        this.name = name;
    }
    //获取名字
    public String getName(){
        return name;
    }


    public String getInfo(){

        return "编号是："+getNo()+"，名字是："+name+"，性别是："+getSex()+"，薪资是："+getSalary();



    }


}
