package com.zhangyihang.collections.list;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
    static void main(String[] args) {
        Set<String> studentIds = new HashSet<>();
        if (studentIds.add("2026001")) {
            System.out.println("报名成功");
        } else {
            System.out.println("请勿重复报名");
        }
        System.out.println(studentIds);
        if (studentIds.add("2026001")) {
            System.out.println("报名成功");
        } else {
            System.out.println("请勿重复报名");
        }
        if (studentIds.add("2026002")) {
            System.out.println("报名成功");
        } else {
            System.out.println("请勿重复报名");
        }
        System.out.println(studentIds.size());
        System.out.println(studentIds);
    }
}
