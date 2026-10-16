package com.zhangyihang.bytestream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*1.一次写一个字节的数据
2.一次写一个数组的数据
3.一次写一个数组的部分数据
*/
public class ByteStreamDemo3 {
    static void main(String[] args) throws IOException {
      //创建对象
         FileOutputStream f1=new FileOutputStream("a.txt");
        //写出数据
        byte[]bytes={96,97,98};
        f1.write(bytes,0,2);//注意：第三个参数是长度（或者说写的个数）
        /*f1.write(97);
        f1.write(55);*/
        //释放资源
        f1.close();
    }
}
