package hahaha.lalala.fengzhu;

/*
对每一个属性使用private修饰  防止用户恶意对核心属性修改


使用私有修饰后  用户不能直接访问和修改属性
提供 getXxx setXxx 对属性进行访问 和修改

 */
public class Cat {

    private String name;
    private int age;

    Cat(String name,int age){
        this.name = name;
       // this.age = age;
      /*  if(age>=1 && age<=20){
            this.age = age;
        }else{
            System.out.println("请输入一个合适的猫的年龄");
        }*/
      setAge(age);
    }
    public Cat(){}

    //设置年龄
    public void setAge(int age){
        if(age>=1 && age<=20){
            this.age = age;
        }else{
            System.out.println("请输入一个合适的猫的年龄");
        }

    }
    //获取年龄
    public int getAge(){

        return age;
    }


    //设置名字  需要外接传入参数
    public void setName(String name) {
        this.name = name;
    }

    //获取名字
    public String getName(){
        return name;
    }

    public void show() {
        System.out.println("名字是：" + name + ",年龄是：" + age);
    }

}
