package com.StringBuilderDemo;

public class Test1 {
    static void main(String[] args) {
       String str1="hello";
        String str2="world";
        for (int i = 0; i < 1000000000; i++) {
                str1+=str2;

        }
        System.out.print(str1);
//对于大量的字符串拼接显然这很慢，因为每次拼接都会创建一个新的字符串对象，导致内存泄漏
    }
}
