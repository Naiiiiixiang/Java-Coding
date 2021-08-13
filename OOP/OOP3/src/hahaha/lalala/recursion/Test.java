package hahaha.lalala.recursion;

/*

递归：方法自己调用自己
    一个完好的递归：
         1.有出口
         2.不断的向出口靠近
 */
public class Test {
    public static void main(String[] args) {
        int sum = getSum(5);
        System.out.println("sum = " + sum);
    }
    /**
     * @param num 求到几的和
     * @return  和
     * num:100
     * 100 + 99 + 98 +97 ... + 1
     */
    public static int getSum(int num){
        if(num==1){
            return 1;
        }
        return num+getSum(num-1);
    }
}
