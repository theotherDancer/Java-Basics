package com.contains_;

import java.util.Arrays;

public class TEST {
    static void main(String[] args) {
        //设计一个程序，判断一个字符串是否包含另一个字符串
        String str1="hello";
        String str2="world";
        boolean b=str1.contains(str2);
        System.out.println(b);//注意：contains方法返回的是一个boolean值，true表示包含，false表示不包含
        //并且这种判断是连续的，比如abdd包含bd，但是不包含bdh
        //一个判断正确的例子，返回true
        b=str1.contains("el");
        System.out.println(b);//true
        //一个判断错误的例子，返回false
        b=str1.contains(str2);
        System.out.println(b);//false
        //判断一个大串是否以一个小串开头
        //返回true
        boolean C=str1.startsWith("hello");//这里的startsWith方法返回的是一个boolean值，true表示以，false表示不以
        System.out.println(C);//true
        //判断一个大串是否以一个小串结尾
        //返回true
        boolean D=str1.endsWith("o");//这里的endsWith方法返回的是一个boolean值，true表示以，false表示不以
        System.out.println(D);//true
        //判断一个大串是否以一个小串开头或结尾
        //返回true
        boolean E=str1.startsWith("hello")||str1.endsWith("o");//这里的startsWith方法返回的是一个boolean值，true表示以，false表示不以
        System.out.println(E);//true
        //查找当前字符在字符串中 第一次出现 的位置
        //返回1
        int index=str1.indexOf("h");
        System.out.println(index);//注意这里返回的是一个int值，从0开始计数，但是截取是返回的是位置
        //查找当前字符在字符串中 最后一次出现 的位置
        int indexa=str1.lastIndexOf("h");
        System.out.println(indexa);//注意这里返回的是一个int值，从0开始计数，但是截取是返回的是位置
        //判断一个字符串是否为空
        //返回false
        boolean F=str1.isEmpty();
        System.out.println(F);//false
        //字符串转字符数组
        char[] chars=str1.toCharArray();
        System.out.println(Arrays.toString(chars));//[h, e, l, l, o]
        System.out.println(chars);
        //注意，如果想输出字符数组中的每个字符，需要使用for循环
        //大小写转换
        str1=str1.toUpperCase();
        System.out.println(str1);//HELLO
        str1=str1.toLowerCase();
        System.out.println(str1);//hello
    }
}
