package com.StringBuilderDemo;

public class Test2StringBuilder {
    static void main(String[] args) {
        //1.创建一个StringBuilder对象，初始容量为16
        StringBuilder sb=new StringBuilder();
       //以上是空参构造
        //下面演示一下带参构造
        StringBuilder sb1=new StringBuilder("hello");
               System.out.println(sb1.length());
               //添加一个字符串
               sb1.append("world");
               System.out.println(sb1);
        for (int i = 0; i < 100000000; i++) {
            sb1.append(i);
        }
        System.out.println(sb1);
        //2.调用toString方法将StringBuilder对象转换为字符串
        String str=sb1.toString();
        System.out.println(str);
    }
}
