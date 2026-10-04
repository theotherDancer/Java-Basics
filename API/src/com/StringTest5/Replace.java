package com.StringTest5;

import java.util.Scanner;

public class Replace {
   static void main(String[] args) {
       //设计一个敏感词自动替换的方法
       //1.首先创建一个敏感词库，用数组来实现
       String[] sensitiveWords={"TMD","SB","LJ"};
       //2.键盘录入一个字符串
       Scanner sc=new Scanner(System.in);
       System.out.println("请输入一个字符串：");
       String str=sc.next();

           for (int i = 0; i < sensitiveWords.length; i++) {
               str=str.replaceAll(sensitiveWords[i],"***");//将敏感词替换为***
           }
       System.out.println("已自动完成敏感词替换：");
           System.out.println(str);

       }
   }

