package com.zhangyihang.Test;

import java.io.File;
        //又一次递归！
public class Test3 {
    static void main(String[] args) {
        //需求：找出电脑中所有以avi结尾的文件（需要考需子文件夹）
        /*一个套路：
        1.进入文件夹
        2.遍历数组
        3.判断
        4.判断*/
        File f1=new File("C:\\");
        findAVI(f1);
    }
    public static  void findAVI(File f){
    //1.进入文件夹
        File[] files = f.listFiles();
        if(!(files==null)){
        //2.遍历数组
        for (File file : files) {
           //如果是文件：则执行规则
            if(file.isFile()){
                if(file.getName().endsWith("avi")){
                    System.out.println(file);
                }
            //如果不是文件，递归~~~~~~~
            }else{
                findAVI(file);
            }
        }
    }
    }
}
