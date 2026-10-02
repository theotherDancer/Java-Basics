package com.operator;

import java.util.Scanner;

public class OperatorDemo2
{
    static void main(String[] args) {
        //题目要求，键盘录入一个三位数，分别输出它的个位十位百位
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数");
        int num = sc.nextInt();
        int ge = num%10;
        int shi = num/10%10;
        int bai = num/100;
        System.out.println("个位是"+ge);
        System.out.println("十位是"+shi);
        System.out.println("百位是"+bai);

    }
}
