package com.zhangyihang.bytestream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class ByteStreamDemo4 {
    static void main(String[] args) throws IOException {
        //创建对象
        FileOutputStream f1=new FileOutputStream("a.txt",true);
        //^可以发现，FileOutputStream的第二个参数是是否打开续写
        //写出数据
        String s1="这是一句神秘的代码";
        byte[] bytes = s1.getBytes(StandardCharsets.UTF_8);
        f1.write(bytes);
        //这里是做了一个换行的操作，注意在windows系统中，换行是\r\n
        //但是java会进行优化，事实上写一个就可以
        String s3="\r\n";
        byte[] bytes2 = s3.getBytes(StandardCharsets.UTF_8);
        f1.write(bytes2);
        String s2="balabala";
        byte[] bytes1 = s2.getBytes(StandardCharsets.UTF_8);
        f1.write(bytes1);
        //释放内存
        f1.close();
    }
}
