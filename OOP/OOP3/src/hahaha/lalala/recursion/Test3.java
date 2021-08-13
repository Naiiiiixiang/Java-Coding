package hahaha.lalala.recursion;
/*

描述：猴子吃桃子问题，猴子第一天摘下若干个桃子，当即吃了所有桃子的一半，还不过瘾，又多吃了一个。
第二天又将仅剩下的桃子吃掉了一半，又多吃了一个。
以后每天都吃了前一天剩下的一半多一个。
到第十天，只剩下一个桃子。试求第一天共摘了多少桃子？
假设第九天有x个桃子

x/2 - 1  =1;
x = (1+1 )*2
x = 4;
假设第8天有y个桃子
y/2 - 1 = 4;
y = (4+1)*2;
 */
public class Test3 {
    public static void main(String[] args) {
        System.out.println("eat(9) = " + eat(1));
    }
    public static int eat(int day){
        if(day==10){
            return 1;
        }
        return (eat(day+1)+1)*2;
    }
}
