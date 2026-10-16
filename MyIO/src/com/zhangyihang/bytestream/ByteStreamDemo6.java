package com.zhangyihang.bytestream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ByteStreamDemo6 {
    static void main(String[] args) throws IOException {
        FileInputStream f1=new FileInputStream("a.txt");
        int b;
        while ((b=f1.read())!=-1){
            System.out.print((char) b);
        }
        f1.close();

    }
}
