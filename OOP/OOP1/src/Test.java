/*
快捷键：
    建立在 修改为eclipse的基础上

 快速生成main()
    psvm + tab
    main + tab
  运行程序：
    ctrl + shift+ f10
    sout: 快速生成   System.out.println(999);

   alt + 上/下键 快速移动

   ctrl + alt + 下  快速复制   屏幕 会反转
               与显卡的快捷键冲突  禁止显卡快捷键

    ctrl + D 快速删除

    shift + 回车  快速开启一行

    ctrl + shift + f 代码格式化
         简繁切换快捷键冲突  禁掉
    alt+ 回车 万能提示键

    数组名.fori 含有下标的遍历方式
    数组名.for  增强for的遍历方式

调试：
 */


public class Test {

    public static void main(String[] args) {
     /*   System.out.println(999);
        System.out.println(100);
        System.out.println(666);*/

        System.out.println();


        int num = 10;

        System.out.println(num);

        System.out.println("num = " + num);


        System.out.print("6666");




        int [] arr = {70,60,50,40,30};

        System.out.println("排序前："+java.util.Arrays.toString(arr));

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("排序后："+java.util.Arrays.toString(arr));

    }
}
