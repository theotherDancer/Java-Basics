package com.zhangyihang.review4;
import java.io.BufferedReader;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class StudyLogTest {

    static void main(String[] args) {
        String path = "study-log-buffered.txt";


        appendRecord(path, "复习了字节流复制");
        appendRecord(path, "复习了字符流读写");
        showRecords(path);
    }



    public static void appendRecord(String path, String text) {
        // 用 UTF-8、追加模式写入 text，再写一个换行
        // 自动关闭资源，捕获 IOException 并打印原因
        try(BufferedWriter FW=new BufferedWriter(new FileWriter(path, StandardCharsets.UTF_8,true))){
        FW.write(text);
        FW.newLine();
        } catch (IOException e) {
            System.out.println("写入失败：" + e.getMessage());
        }

    }

    public static void showRecords(String path) {
        // 用 UTF-8 读取文件
        // 使用 char[] 和实际读取数量 len，打印完整内容
        // 自动关闭资源，捕获 IOException 并打印原因
        try(BufferedReader FR=new BufferedReader(new FileReader(path, StandardCharsets.UTF_8))){
            char[]chars=new char[3];
            String str;
            while((str= FR.readLine())!=null){
                System.out.println(str);
            }
    } catch (IOException e) {
            System.out.println("读取失败：" + e.getMessage());
        }
    }
}
