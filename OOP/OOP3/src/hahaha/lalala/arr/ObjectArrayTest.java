package hahaha.lalala.arr;

public class ObjectArrayTest {
    public static void main(String[] args) {
        //创建数组
        Student ss [] = new Student[3];

        //给第一个元素赋值
        ss[0] = new Student();
        ss[0].name="李白";
        ss[0].score=89;
        //给第2个元素赋值
        Student s1 = new Student();
        s1.score = 92;
        s1.name = "王安石";
        ss[1] = s1;
        //给第3个元素赋值
        Student s2 = new Student();
        s2.name = "安琪拉";
        s2.score = 90;
        ss[2] = s2;
        //排序前输出
        printStudents(ss);
        //排序
        sort(ss);
        System.out.println("-------------------------------------------------");
        //排序后输出
        printStudents(ss);

    }

    public static void printStudents(Student[] ss) {
        for (Student s : ss) {
            String info = s.getInfo();
            System.out.println("info = " + info);
        }
    }

    /**
     * 按照分数排序
     * @param arr
     */
    public static void sort(Student[] arr){

        for(int i = 0;i<arr.length;i++){

            for(int j = 0;j<arr.length-1-i;j++){

                //当前一个对象的分数 大于后一个对象的分数时 两个对象进行位置交换
                if(arr[j].score>arr[j+1].score){

                    Student temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

            }
        }

    }
}
