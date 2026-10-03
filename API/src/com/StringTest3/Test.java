package com.StringTest3;

import java.util.Scanner;

public class Test {
    static void main(String[] args) {
        //字符串比较的两个方法
        //第一种方法，使用equals方法比较
     /*   String username="zhangsan";
        String rightUsername="zhangsan";
        boolean b=username.equals(rightUsername);
        System.out.println(b);*/
        //第二种方法，使用equalsignore方法比较，忽略大小写


        //题目：已知正确的用户名和密码。设计一个程序模拟用户登录。有三次机会
        //1.已知用户名和密码，先定义
        String rightUsername="zhangsan";
        String rightPassword="123456";
        //2.让用户键盘录入登录的用户名和密码
        Scanner sc=new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            System.out.println("请输入用户名：");
            String username=sc.next();
            System.out.println("请输入密码：");
            String password=sc.next();
            //3.比较用户名和密码是否正确
            boolean b=username.equals(rightUsername)&&password.equals(rightPassword);
            //以上采用交集，只有用户名和密码都正确，才能登录成功
            if(b){
                System.out.println("登录成功");
                break;
            }else{
                if(i<=2){
                    System.out.println("登录失败,您还剩下"+(3-i)+"次机会");
                }else{
                    System.out.println("登录失败,您没有机会了");
                }
            }
        }
    }
}
