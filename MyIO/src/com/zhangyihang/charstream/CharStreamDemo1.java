package com.zhangyihang.charstream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
//空参的read
public class CharStreamDemo1 {
    static void main(String[] args) throws IOException {
        FileReader f1=new FileReader("C:\\Users\\lenovo\\Desktop\\abc.txt");
        int b;
        while ((b=f1.read())!=-1){
            System.out.print((char)b);//b只是表上对应的十进制数字，想要获得汉字。必须强制转换成字符
        }f1.close();
    }
}
