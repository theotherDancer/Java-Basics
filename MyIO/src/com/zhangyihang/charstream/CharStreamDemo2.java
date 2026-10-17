package com.zhangyihang.charstream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CharStreamDemo2 {
    //带参的read
    static void main(String[] args) throws IOException {
        FileReader f1 = new FileReader("C:\\Users\\lenovo\\Desktop\\abc.txt");
        char[] chars = new char[2];
        int len;
        while((len=f1.read(chars))!=-1){
            System.out.print( new String(chars,0,len));
        }f1.close();
    }
}
