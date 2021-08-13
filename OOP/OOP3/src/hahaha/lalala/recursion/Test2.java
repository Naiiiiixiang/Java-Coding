package hahaha.lalala.recursion;

/*
菲波那切数列
 1 2 3 4 5 6 7  8
 1 1 2 3 5 8 13 21
 第一个和第二个数 是 1
 从第三个数开始    后一个数 =  前一个数 + 前两个数
 使用递归求 任意位置的斐波那锲数
 */
public class Test2 {
    public static void main(String[] args) {
        int num = feibB(7);
        System.out.println("num = " + num);
    }

    private static int feibB(int pos) {
        //第一个位置和第二个位置永远是1
        if(pos==1 || pos==2){
            return 1;
        }
        return feibB(pos-1)+feibB(pos-2);
    }
}
