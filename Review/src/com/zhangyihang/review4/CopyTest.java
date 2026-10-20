package com.zhangyihang.review4;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.*;

public class CopyTest {
    /// @param args
    public static void main(String[] args) {
        try (
                BufferedInputStream input=new BufferedInputStream(new FileInputStream("review-test.txt"));
                BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream("review-copy.txt"));
        ) {
            byte[] buffer = new byte[4];
            int len;

            while ((len = input.read(buffer)) != -1) {
                // 在这里写入本次读取的有效字节
                output.write(buffer,0,len);
            }

        } catch (IOException e) {
            System.out.println("复制失败：" + e.getMessage());
        }
    }




}
