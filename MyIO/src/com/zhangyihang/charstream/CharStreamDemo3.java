package com.zhangyihang.charstream;

import java.io.FileWriter;
import java.io.IOException;

public class CharStreamDemo3 {
    static void main(String[] args) throws IOException {
        FileWriter f1=new FileWriter("C:\\Users\\lenovo\\Desktop\\abc.txt",true);
        f1.write("压力！");
        char[]chars={'6','张'};
        f1.write(chars);
        f1.close();
    }
}
