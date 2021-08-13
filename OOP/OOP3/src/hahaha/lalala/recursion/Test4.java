package hahaha.lalala.recursion;

//2、有n级台阶，一次只能上1步或2步，共有多少种走法？
// 4
public class Test4 {
    public static void main(String[] args) {

        int steps = steps(5);
        System.out.println("steps = " + steps);
    }

    public static int steps(int step){
       /* if(step==1){
            return 1;
        }
        if(step==2){
            return 2;
        }*/
       if(step<=2){
           return step;
       }
        return steps(step-1)+steps(step-2);

    }
}
