package com.zhangyihang.review4;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
public class CharWriteTest {
    static void main(String[] args) {
        try (FileWriter writer =
                     new FileWriter("review-output.txt", StandardCharsets.UTF_8)) {
            writer.write("第一条记录\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try (FileWriter writer =
                     new FileWriter("review-output.txt", StandardCharsets.UTF_8, true)) {
            writer.write("第二条记录\n");
        } catch (IOException e) {
            System.out.println("追加失败：" + e.getMessage());
        }
    }
}
