package hahaha.lalala.comparable.c1;

public class Person implements Comparable {

    String name;
    int age;
    double score;

    public Person() {
    }

    public Person(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    /*
    compareTo(Object obj): 只有一个参数 需要用到 this 作为已知条件
    重写方法：
    返回值是一个int值：
         >0: 第一个对象大于第二个对象
        ==0： 两个对象相等
          <0: 第一个对象小于第二个对象
     例1： 按照年龄比较
             return this.age - p.age;
      例2：按照分数比较
                        小数1       小数2
        Double.compare(this.score, p.score);

     */

    @Override
    public int compareTo(Object o) {

        Person p = (Person) o;

       /* if(this.score > p.score){
            return 1;
        }else if(this.score<p.score){
            return -1;
        }else{
            return 0;
        }*/

       // return Double.compare(this.score, p.score);
        return this.age - p.age;
    }

    /*

  按照年龄比
  @Override
    public int compareTo(Object o) {// Object o = p2;

        //想要使用子类自己独有的资源 需要向下转型
        Person p = (Person)o;
      *//*  if(this.age - p.age>0){
            return 1;
        }else if(this.age== p.age){
            return 0;
        }else{
            return -1;
        }*//*
      return this.age - p.age;
      //  return 0;
    }*/

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}
