package com.zhangyihang.review4;

import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class CharReadTest {
    public static void main(String[] args) {
        try (FileReader reader =
                     new FileReader("review-text.txt", StandardCharsets.UTF_8)) {

            char[] buffer = new char[3];
            int len;

            while ((len = reader.read(buffer)) != -1) {
                // 用普通 for 循环，打印本次读到的有效字符
                for (int i = 0; i < len; i++) {
                    System.out.print(buffer[i]);
                }
            }

        } catch (IOException e) {
            System.out.println("读取失败：" + e.getMessage());
        }
    }


}
