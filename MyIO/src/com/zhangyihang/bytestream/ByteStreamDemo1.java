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
        /*流的对象里面可以是字符串，也可以是File类的对象，如果是字符串，会自动转换成File对象
        如果没有这个文件，则会创建一个文件，（前提是父级路径存在）
        如果这个文件本来就存在，那么会先清空这个文件的内容
         */
        FileOutputStream fos=new FileOutputStream(f1);
        //2.写出数据
        //write方法的参数是整数，对应的是ASCII的字符，想要输出数字，要输入数字对应的ASCLL
        fos.write(98);
        //3.释放资源：如果不手动释放资源，则会一直占用内存
        fos.close();
    }
}
