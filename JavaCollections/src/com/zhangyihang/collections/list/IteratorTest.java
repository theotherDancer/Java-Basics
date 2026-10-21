package com.zhangyihang.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/** 迭代器：先检查有没有，再读取，需要时删除刚读取的元素。 */
public class IteratorTest {
    public static void main(String[] args) {
        // 使用独立名单，避免受到其他练习删除操作的影响。
        List<String> names = new ArrayList<>();
        names.add("小林");
        names.add("小林");
        names.add("小周");
        names.add("小王");
        System.out.println("删除前：" + names);

        // 接口类型的变量接收迭代器对象；这一步还没有读取元素。
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) { // 返回 boolean，只检查，不推进。
            String name = iterator.next(); // 返回下一个元素，并推进，不删除。
            if ("小林".equals(name)) {
                iterator.remove(); // 返回 void，删除最近一次 next 读取的元素。
            }
        }
        System.out.println("删除后：" + names);
        // 规则：先 next 再 remove；一次 next 后最多 remove 一次。
        // 使用迭代器遍历时，删除用 iterator.remove()，不要改用 names.remove()。
    }
}
