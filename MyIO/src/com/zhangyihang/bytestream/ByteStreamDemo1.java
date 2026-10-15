package com.zhangyihang.bytestream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo1 {
    static void main(String[] args) throws IOException {
        //下面演示用字节输出流写出数据
        //1.创建对象
        File f1=new File("a.txt");
        //System.out.println(f1.createNewFile());
        FileOutputStream fos=new FileOutputStream(f1);
        //2.写出数据
        fos.write(98);
        //3.释放资源
        fos.close();
    }
}
