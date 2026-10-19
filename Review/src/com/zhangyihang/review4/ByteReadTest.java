package com.zhangyihang.review4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ByteReadTest {
    static void main(String[] args) throws FileNotFoundException {

        try(FileInputStream input = new FileInputStream("review-test.txt")){
            byte[] buffer = new byte[4];
            int len;
            while ((len = input.read(buffer)) != -1) {
                // 只处理下标 0 到 len - 1 的元素
                for (int i = 0; i < len; i++) {
                    System.out.print((char)buffer[i]);
                }
            }
        }

        catch(IOException e){
        System.out.println("出错了"+e.getMessage());
    }
    }
}
