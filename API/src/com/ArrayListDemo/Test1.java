package com.ArrayListDemo;

import java.util.ArrayList;

public class Test1 {
    static void main(String[] args) {
        //1.创建一个ArrayList对象
        ArrayList<String> list=new ArrayList<>();
        //2.调用add方法添加元素
        list.add("hello");
        list.add("world");
        System.out.println(list);
      /*  boolean b=list.add("hello");
        System.out.println(b+"``````````````````");//判断是否添加成功
        //插入一个字符串
        list.add(0,"java");
        System.out.println(list);//可以发现，插入的字符串在索引为0的位置，其他字符串向后移动了

        boolean b1= list.remove("java");//删除索引为0的字符串，返回删除是否成功
        System.out.println(b1);
        System.out.println(list);
        String s=list.remove(2);//删除索引为0的字符串，返回删除的字符串
        System.out.println(s);
        System.out.println(list);
        */

        //把0索引的字符串替换为"java"字符串
        list.set(0,"java");
        System.out.println(list);
        //查询0索引的字符串
        String s1=list.get(0);
        System.out.println(s1);
        //查询list集合的大小
        int size=list.size();
        System.out.println(size);
        //注意集合的长度是size，而不是list.length
        //接下来进行遍历list集合中的元素
        for (int i = 0; i < size; i++) {
            System.out.println(list.get(i));
        }
    }
}
