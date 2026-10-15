package com.zhangyihang.Test;

import java.io.File;
import java.io.IOException;

public class Test1 {
    static void main(String[] args) throws IOException {
        //在当前模块(项目根目录)下的 aaa 文件夹里创建 b.txt
        File f1 = new File("aaa");
        f1.mkdirs();//创建文件夹（多层也能一起建）
        File src = new File(f1, "b.txt");
        boolean b = src.createNewFile();//创建文件
        if (b) {
            System.out.println("创建成功");
        } else {
            System.out.println("创建失败");
        }
    }
}
