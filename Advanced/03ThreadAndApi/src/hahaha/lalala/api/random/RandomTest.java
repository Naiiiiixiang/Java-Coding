package hahaha.lalala.api.random;

import org.junit.Test;

import java.util.Random;

public class RandomTest {
    @Test
    public void test01() {

        Random random = new Random();

        for (int i = 0; i < 30; i++) {
            //随机生成boolean值
            boolean b = random.nextBoolean();
            System.out.println("b = " + b);
        }
    }

    @Test
    public void test02() {
        Random random = new Random();
        for (int i = 0; i < 30; i++) {
            //随机返回在int范围内的数
            /* int i1 = random.nextInt();*/
            //[0,值) 范围随机数
            int i1 = random.nextInt(10);
            System.out.println(i1);
        }
    }

    @Test
    public void test03() {
        Random random = new Random(1);
        for (int i = 0; i < 10; i++) {
            int i1 = random.nextInt(10);
            System.out.print(i1 + "\t");//5	8	7	3	4	4	4	6	8	8
        }
    }

    @Test
    public void test04() {
        //当种子数固定时 可以获取 固定的随机数
        Random random = new Random(1);
        for (int i = 0; i < 10; i++) {
            int i1 = random.nextInt(10);
            System.out.print(i1 + "\t");//5	8	7	3	4	4	4	6	8	8

        }

    }
}
