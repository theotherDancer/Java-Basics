package com.zhangyihang.collections.list;

import java.util.ArrayList;
import java.util.List;

/** List 的增删改查。每个方法使用独立名单，互不影响。 */
public class ListTest {
    public static void main(String[] args) {
        demoAddAndSet();
        demoRemove();
        demoQuery();
        demoFindAndUpdate();
    }

    // 添加、插入与替换：add 增加元素，set 替换已有位置的元素。
    public static void demoAddAndSet() {
        System.out.println("\n=== 1. 添加、插入与替换 ===");
        List<String> names = new ArrayList<>();
        names.add("小林");
        names.add("小周");

        names.add(1, "小王");
        System.out.println("插入后：" + names);
        System.out.println("人数：" + names.size());

        names.set(1, "小李");
        System.out.println("替换后：" + names);
        System.out.println("人数：" + names.size());
    }

    // 两种删除的返回值不同：按下标返回元素，按内容返回是否删除成功。
    public static void demoRemove() {
        System.out.println("\n=== 2. 按下标、按内容删除 ===");
        List<String> names = new ArrayList<>();
        names.add("小林");
        names.add("小李");
        names.add("小周");

        String removed = names.remove(1);
        System.out.println("按下标删除的人：" + removed);
        System.out.println("当前名单：" + names);
        System.out.println("人数：" + names.size());

        boolean firstRemoved = names.remove("小周");
        System.out.println("第一次删除小周：" + firstRemoved);
        boolean secondRemoved = names.remove("小周");
        System.out.println("第二次删除小周：" + secondRemoved);
        System.out.println("最终名单：" + names);
    }

    // get 按下标获取；contains 判断存在；indexOf 查找第一次出现的位置。
    public static void demoQuery() {
        System.out.println("\n=== 3. 查询 ===");
        List<String> names = new ArrayList<>();
        names.add("小林");
        names.add("小周");
        names.add("小林");

        System.out.println("名单：" + names);
        System.out.println("下标 1 的元素：" + names.get(1)); // 下标越界会抛出异常。
        System.out.println("包含小王吗：" + names.contains("小王"));
        System.out.println("第一个小林的下标：" + names.indexOf("小林"));
        System.out.println("小王的下标：" + names.indexOf("小王")); // 没找到返回 -1。
    }

    // 查找后先判断 -1，再使用下标修改。
    public static void demoFindAndUpdate() {
        System.out.println("\n=== 4. 查找后修改 ===");
        List<String> names = new ArrayList<>();
        names.add("小林");
        names.add("小周");
        names.add("小林");

        int zhouIndex = names.indexOf("小周");
        if (zhouIndex == -1) {
            System.out.println("没有这个人");
        } else {
            names.set(zhouIndex, "小周（已签到）");
        }
        System.out.println("查找小周后：" + names);

        int wangIndex = names.indexOf("小王");
        if (wangIndex == -1) {
            System.out.println("没有这个人");
        } else {
            names.set(wangIndex, "小王（已签到）");
        }
        System.out.println("查找小王后：" + names);
    }
}
