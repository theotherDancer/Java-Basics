package com.zhangyihang.collections.list;

import java.util.ArrayList;
import java.util.List;

/** 普通 for、增强 for，以及倒序删除。 */
public class ListTraversalTest {
    public static void main(String[] args) {
        demoTraversal();
        demoReverseRemove();
    }

    public static void demoTraversal() {
        System.out.println("=== 1. 两种 for 遍历 ===");
        List<String> names = new ArrayList<>();
        names.add("小林");
        names.add("小周（已签到）");
        names.add("小林");

        // 需要下标时使用普通 for：显示编号从 1 开始，下标从 0 开始。
        for (int i = 0; i < names.size(); i++) {
            System.out.println((i + 1) + "号：" + names.get(i));
        }

        // 只读取每个元素时，可以使用增强 for。
        for (String name : names) {
            System.out.println("通知：" + name);
        }
    }

    public static void demoReverseRemove() {
        System.out.println("\n=== 2. 倒序删除 ===");
        List<String> names = new ArrayList<>();
        names.add("小林");
        names.add("小林");
        names.add("小周");
        names.add("小王");
        System.out.println("删除前：" + names);

        // 从后往前检查，避免正序删除后 i++ 跳过补位的元素。
        for (int i = names.size() - 1; i >= 0; i--) {
            if ("小林".equals(names.get(i))) {
                names.remove(i);
            }
        }
        System.out.println("删除后：" + names);
    }
}
