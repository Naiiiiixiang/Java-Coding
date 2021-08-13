package hahaha.lalala.polys.poly4;
/*
向下转型：
        前提： 先向上转型
       将变为父亲的孩子 再变回孩子
小的数据类型  变量名 = (小的数据类型)大的数据类型的值；

 */
public class Test {
    public static void main(String[] args) {

        Cat cat = new Cat();

        Dog dog = new Dog();

       showEat(dog);
        showEat(cat);

    }

    public static void showEat(Animal a){// Animal a = new Cat(); Animal a = new Dog();
    //小的数据类型  变量名 = (小的数据类型)大的数据类型的值
        a.eat();
        //判断对象是否为Cat类型
        if(a instanceof Cat){
            Cat c = (Cat)a;
            c.catchMouse();
        }
        if(a instanceof Dog){
            Dog d = (Dog)a;
            d.lookHome();
        }

    }
}
