package hahaha.lalala.generic.g7;
/*
求分数最高的人
分数最高  要求分数可以比较
只要能比较 必须是 Comparable接口的孩子
? extends Comparable
 传入的泛型 必须是  Comparable 接口的孩子

 */
public class Test2 {
    public static void main(String[] args) {
        //新建一个Person类型的数组
        Person<Double> []ps = new Person[4];
        ps[0] = new Person<>("李白", 99.8);
        ps[1] = new Person<>("李白1", 99.7);
        ps[2] = new Person<>("李白2", 99.6);
        ps[3] = new Person<>("李白3", 99.5);
        //找到数组内分数最高的人
        Person<? extends Comparable> max = getMax(ps);
        System.out.println("max = " + max);
    }
    public static Person<? extends Comparable> getMax(Person<? extends Comparable>[] ps){
        //假设最大值是
        Person<? extends Comparable> max = ps[0];
        for (Person<? extends Comparable> p : ps) {
            if(p.score.compareTo(max.score)>0){
                max = p;
            }
        }
        return max;
    }
}
