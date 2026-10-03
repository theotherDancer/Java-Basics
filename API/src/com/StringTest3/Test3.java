package com.StringTest3;

import java.util.Scanner;

public class Test3 {
    //设计一个程序，首先键盘录入一个字符串，统计这个字符串中大写，小写，数字的个数
    static void main(String[] args) {
        System.out.println("请输入一个字符串：");
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int countUpper=0;
        int countLower=0;
        int countDigit=0;
           for (int i = 0; i < str.length(); i++) {
                char c=str.charAt(i);
                if(c>='A'&&c<='Z'){
                    countUpper++;
                }else if(c>='a'&&c<='z'){
                    countLower++;
                }else if(c>='0'&&c<='9'){
                    countDigit++;
                }else {
                    System.out.println("您输入的字符串中包含非字母和数字的字符");
                }
        }
        System.out.println("大写字母的个数为："+countUpper);
        System.out.println("小写字母的个数为："+countLower);
        System.out.println("数字的个数为："+countDigit);
    }
}
