package hahaha.lalala.exer1;

import org.junit.After;
import org.junit.Before;

import java.util.Arrays;
import java.util.Comparator;

public class Test {
    Employee[] es = null;


    @After
    public void after() {
        System.out.println("排序后");
        //遍历数组
        printEmployee(es);
    }
    @Before
    public void before() {
        Employee e1 = new Employee("001", "李白", 9999.9);
        Employee e2 = new Employee("002", "杜甫", 9999.2);
        Employee e3 = new Employee("003", "白居易", 9999.1);
        Employee e4 = new Employee("004", "王安石", 9999.7);
        Employee e5 = new Employee("005", "杜牧", 9999.6);
        //将数据添加到数组内
        es = new Employee[]{
                e1, e2, e3, e4, e5
        };
        System.out.println("排序前");
        //遍历数组
        printEmployee(es);
    }
    @org.junit.Test
    public void test01() {
        //创建比较规则对象
        SortOfSalary sortOfSalary = new SortOfSalary();
        Arrays.sort(es, sortOfSalary);// Comparator c = new SortOfSalary();

    }

    @org.junit.Test
    public void test02() {
        Comparator c = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Employee e1 = (Employee)o1;
                Employee e2 = (Employee)o2;
                return Double.compare(e1.getSalary(), e2.getSalary());
            }
        };
        //排序
        Arrays.sort(es,c);
    }

    @org.junit.Test
    public void test03(){
        Arrays.sort(es, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Employee e1 = (Employee) o1;
                Employee e2 = (Employee) o2;
                return Double.compare(e1.getSalary(), e2.getSalary());
            }
        });
    }

    public static void printEmployee(Employee[] es) {
        for (Employee e : es) {
            System.out.println("e = " + e);
        }
    }
}

class SortOfSalary implements Comparator {


    @Override
    public int compare(Object o1, Object o2) {
        Employee e1 = (Employee) o1;
        Employee e2 = (Employee) o2;
        return Double.compare(e1.getSalary(), e2.getSalary());
    }
}
