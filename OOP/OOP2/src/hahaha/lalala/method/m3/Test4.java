package hahaha.lalala.method.m3;

/*
    判断一个数是否为质数  是  true
                         否  false
 */
public class Test4 {

    public static void main(String[] args) {
/*
        boolean zhiShu = isZhiShu(19);
        System.out.println("zhiShu = " + zhiShu);*/

        for (int i = 2; i <= 100; i++) {

            boolean zhiShu = isZhiShu(i);
            if(zhiShu){
                System.out.println(i);
            }
        }

    }


    public static boolean isZhiShu(int num) {

        //num 可能出现约数的范围
        for (int i = 2; i < num; i++) {
            //出现了能被整除的数  证明 num 不是质数
            if (num % i == 0) {
                return false;
            }
        }
        // 没有任何一个约数可以被 num整除 所以 num 肯定是一个质数
        return true;
    }
}
