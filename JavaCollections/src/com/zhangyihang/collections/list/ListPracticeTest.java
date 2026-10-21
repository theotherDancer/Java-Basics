package com.zhangyihang.collections.list;

import java.util.List;

public class ListPracticeTest {
    // 已报名就返回 false；否则添加，返回 true
    public static boolean register(List<String> studentIds, String studentId) {
        if (studentIds.contains(studentId)) {
            return false;
        } else {
            studentIds.add(studentId);
            return true;
        }
    }

    // 找到旧学号就替换，返回 true；没找到返回 false
    public static boolean updateId(
            List<String> studentIds, String oldId, String newId) {
        for (int i = 0; i < studentIds.size(); i++) {
            if (studentIds.get(i).equals(oldId)) {
                int newIndex = studentIds.indexOf(newId);
                if (newIndex != -1 && newIndex != i) {
                    return false;
                }

                studentIds.set(i, newId);
                return true;
            }
        }
        return false;
    }

    // 删除成功返回 true；没找到返回 false
    public static boolean cancel(List<String> studentIds, String studentId) {
        for (int i = studentIds.size() - 1; i >= 0; i--) {
            if (studentIds.get(i).equals(studentId)) {
                studentIds.remove(i);
                return true;
            }
        }
        return false;
    }
}
