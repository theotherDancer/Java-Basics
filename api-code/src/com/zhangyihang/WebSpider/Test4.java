package com.zhangyihang.WebSpider;

import java.util.regex.Pattern;

public class Test4 {
    static void main(String[] args) {
        //正则表达式识别替换
        String s="张三jfo4vn15fd李四v5f16dvn王五";
        Pattern P = Pattern.compile("[A-Za-z0-9]+");
        System.out.println(s.replaceAll("[A-Za-z0-9]+", "VS"));
        //切割的逻辑：按照正则表达式的规则切割，切割后各个部分存放在字符数组
        String[]arr=s.split("[A-Za-z0-9]+");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            //如果一个方法的形参是regex，那么他一定可以识别正则表达式
        }
    }
}
