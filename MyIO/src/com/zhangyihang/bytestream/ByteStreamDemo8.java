package com.zhangyihang.bytestream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo8 {
    static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("C:\\Users\\lenovo\\Desktop\\be1a809f4fb8e504ee699d2bae97ef41.jpg");
        FileOutputStream fos=new FileOutputStream("q.jpg");
        byte[]b=new byte[1024*1024*5];
        int len;//注意：当参数是一个数组的时候，返回值是读取的长度
        //而当参数是空参是，返回值是读到的值
        while ((len=fis.read(b))!=-1){
            fos.write(b,0,len);
        }
        fos.close();
        fis.close();

    }
}
