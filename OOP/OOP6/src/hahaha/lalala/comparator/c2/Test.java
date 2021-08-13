package hahaha.lalala.comparator.c2;

/*
新建一个类 Person name  age  score
创建四个Person对象 存储到数组内
使用外部比较器 完成 数组 按照 分数从小到大
 */
public class Test {
    public static void main(String[] args) {
        Person p1 = new Person("李白", 20, 99.6);
        Person p2 = new Person("杜甫", 22, 99.5);
        Person p3 = new Person("王安石", 21, 99.9);
        Person p4 = new Person("李商隐", 19, 99.1);
        //创建比较规则对象
        SortOfScore sortOfScore = new SortOfScore();
       /*
       比较两个对象的分数
       int compare = sortOfScore.compare(p1, p2);
        System.out.println("compare = " + compare);*/
       Person[] ps= {p1,p2,p3,p4};
        //排序前
        System.out.println("排序前");
        printArr(ps);
        sort1(ps,sortOfScore);
        //排序后
        System.out.println("排序后");
        printArr(ps);
    }

    //数组的遍历
    public static void printArr(Object[] ps) {
        for (Object p : ps) {
            System.out.println(p);
        }
    }

    /**
     * 给person[] 进行按照分数大小排序
     * @param ps
     * @param sortOfScore
     */
    private static void sort1(Person[] ps, SortOfScore sortOfScore) {

        for (int i = 0; i < ps.length-1; i++) {
            for (int j = 0; j < ps.length-1-i; j++) {

                //判断 前一个对象的分数是否大于后一个对象的分数
                int compare = sortOfScore.compare(ps[j], ps[j + 1]);
                if(compare>0){
                    Person temp = ps[j];
                    ps[j] = ps[j+1];
                    ps[j+1] = temp;
                }
            }
        }
    }
}
