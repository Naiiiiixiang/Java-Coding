package hahaha.lalala.inheri3;

public class Animal {
    private String name;
    int age = 20;
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void eat(){
        System.out.println("动物吃饭...");
    }
}
