package com.zhangyihang.Test;

import java.io.File;

public class Test2 {
    //查找某一个文件夹下是否有某个文件，定义为一个方法
    static void main(String[] args) {
        File f1=new File("C:\\Users\\lenovo\\Desktop");
        System.out.println(haveAVI(f1));
    }
    public static  boolean haveAVI(File f){
       File[] files=f.listFiles();
        for (File file : files) {
            if(file.isFile()&&file.getName().endsWith("avi")){
                return true;
            }
        }return false;
    }
}
