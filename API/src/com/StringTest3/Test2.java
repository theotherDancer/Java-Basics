package com.StringTest3;

import java.util.Scanner;

public class Test2 {
    static void main(String[] args) {
        //键盘录入一个字符串，使用程序去遍历这个字符串
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str=sc.next();
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
            //用到charAt方法，获取字符串中的每个字符
            char c=str.charAt(i);
            System.out.println(c);
        }
    }
}
