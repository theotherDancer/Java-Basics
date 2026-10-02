package com.operator.Operator;

import java.util.Scanner;

public class OperatorDemo3
{
    static void main(String[] args) {
        //键盘录入一个秒数，分别输出它对应的小时数分钟数和秒数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个秒数");
        int seconds = sc.nextInt();
        int hour=seconds/3600;
        int minute=seconds/60%60;
        int second=seconds%60;
        System.out.println("小时数是"+hour);
        System.out.println("分钟数是"+minute);
        System.out.println("秒数是"+second);
    }
}
