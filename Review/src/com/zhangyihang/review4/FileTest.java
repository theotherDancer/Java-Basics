package com.zhangyihang.review4;

import java.io.File;
import java.io.IOException;

public class FileTest {
    public static void createFile(String path) throws IOException {
        File file = new File(path);
        boolean created = file.createNewFile();
        System.out.println("是否新建：" + created);
    }

    public static void main(String[] args) {
        try {
            createFile("missing-parent-12345/review-test.txt");
        } catch (IOException e) {
            System.out.println("创建失败：" + e.getMessage());
        }

        System.out.println("操作结束");
        System.out.println("~~~~~~~~~~~~~~~~~~~");

        String[] paths = {
                "review-test.txt",
                "review-test.txt",
                "missing-parent-12345/review-test.txt"
        };
        for (int i = 0; i < paths.length; i++) {
            System.out.println("正在处理"+ paths[i]);
            try{
                createFile(paths[i]);
            } catch (IOException e) {
                System.out.println("创建失败");
            }
        }
        System.out.println("全部处理结束");

    }
}