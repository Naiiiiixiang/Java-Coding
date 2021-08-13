package hahaha.lalala.polys.polyexer1;

public class Traffic {

    public void drive(){
        System.out.println("跑");
    }
}
class  Car extends Traffic{
    @Override
    public void drive() {
        System.out.println("小汽车 跑跑跑");
    }
}
class  Bicyle extends Traffic{
    @Override
    public void drive() {
        System.out.println("自行车跑跑跑.....");
    }
}
