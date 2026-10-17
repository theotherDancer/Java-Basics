package com.zhangyihang.bytestream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo7 {
    static void main(String[] args) throws IOException {
        long l1 = System.currentTimeMillis();
        FileInputStream fis=new FileInputStream("C:\\Users\\lenovo\\Desktop\\d.txt");
        FileOutputStream fos=new FileOutputStream("z.txt");
        int b;//边读边写
        while((b= fis.read())!=-1){
            fos.write(b);
        }//先开的流最后关
        fos.close();
        fis.close();
        long l2 = System.currentTimeMillis();
        System.out.println((l2-l1)/1000.0);
    }
}
