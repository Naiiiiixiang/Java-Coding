package hahaha.lalala.file;

import java.io.File;

/*
展示所有目录下的文件或者文件夹
递归调用进行展示
 */
public class FileExer {

    public static void main(String[] args) {

        File file = new File("D:\\0224bigdata\\day00");
        list(file);
    }

    private static void list(File file) {
        //展示DIR命令
        File[] files = file.listFiles();
        for (File f : files) {
            if(f.isDirectory()){//如果是文件夹
                //如果是文件夹  进入文件夹 继续 遍历展示
                System.out.println("<DIR>\t\t"+ f.getName());
                list(f);
            }else{//如果是文件
                //文件的长度  + 文件的名字
                System.out.println(f.length()+"\t\t"+f.getName());

            }
        }
    }
}
