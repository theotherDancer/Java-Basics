package com.zhangyihang.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        // 在这里编写集合练习代码
        List<String> names = new ArrayList<>();
        names.add("小林");
        names.add("小周");

        names.add(1, "小王");
        System.out.println(names);
        System.out.println(names.size());

        names.set(1, "小李");
        System.out.println(names);
        System.out.println(names.size());
        /*在 main 最后自己完成：
            1. 按下标删除“小李”，用 String 变量接收返回值，打印它。
            2. 打印删除后的名单。
            3. 按内容删除“不存在的人”，用 boolean 变量接收返回值，打印它。
            4. 再次打印名单。*/
        String remove = names.remove(1);
        System.out.println(remove);
    }
}