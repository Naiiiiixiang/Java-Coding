package hahaha.lalala.argment;
/*
1、声明一个方法，可以找出任意个整数的最大公约数

  数据校验
 */
public class Test2 {
    public static void main(String[] args) {
        getGongYueShu();
        int gongYueShu = getGongYueShu(6, 3, 9);
        System.out.println("gongYueShu = " + gongYueShu);
        gongYueShu = getGongYueShu(4,6,10);
        System.out.println("gongYueShu = " + gongYueShu);
    }
    public static int getGongYueShu(int... nums){

        if(nums.length==0){
            return 0;
        }

        //获取最小值
        int minNum = nums[0];
        for (int num : nums) {
            if(num<minNum){
                minNum = num;
            }
        }
        //最小值依次递减 与每一个数字进行取模运算 所有的数都能整除 此数是最大公约数
        //一旦出现不能整除的  继续递减

     l:   for(int i = minNum;i>=1;i--){

            for (int num : nums) {
                if(num%i!=0){
                    continue l;
                }
            }
            return i;
        }
        return 1;
    }






   /* public static int getGongYueShu(int... nums){

        if(nums.length==0){
            return 0;
        }

        //获取最小值
        int minNum = nums[0];
        for (int num : nums) {
            if(num<minNum){
                minNum = num;
            }
        }
    //4 6 8
        for(int i = minNum;i>=1;i--){
            //假设此值就是最大公约数
            boolean flag = true;
            //对数组遍历拿到每一个值
            for (int num : nums) {
                if(num%i!=0){
                    flag = false;
                    break;
                }
            }

            if(flag){
                return i;
            }
        }
        //最小值依次递减 与每一个数字进行取模运算 所有的数都能整除 此数是最大公约数
        //一旦出现不能整除的  继续递减
        return 1;
    }*/
}
