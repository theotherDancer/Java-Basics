package com.zhangyihang.bytestream;

import java.io.FileInputStream;
import java.io.IOException;

public class ByteStreamDemo5 {
    static void main(String[] args) throws IOException {
        //创建对象
        FileInputStream f1=new FileInputStream("a.txt");
        //读取内容
        int read = f1.read();//读到文件的末尾，会返回-1
        System.out.println(read);
        f1.close();
    }
}
