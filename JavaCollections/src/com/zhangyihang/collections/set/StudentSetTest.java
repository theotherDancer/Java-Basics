package com.zhangyihang.collections.set;

import java.util.HashSet;
import java.util.Set;

public class StudentSetTest {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();

        // 学号相同，但两次 new 创建了两个不同对象。
        Student a = new Student("2026001", "小林");
        Student b = new Student("2026001", "小林（已改名）");

        System.out.println(a == b);
        System.out.println(students.add(a));
        System.out.println(students.add(b));
        System.out.println(students.size());

        // 你的预测：false、true、true、2。
        // 下一轮再为 Student 定义按学号判重的规则，对比运行结果。

        Student query = new Student("2026001", "查询用的名字");

        System.out.println(students.contains(query));
        System.out.println(students.remove(query));
        System.out.println(students.size());

    }
}
