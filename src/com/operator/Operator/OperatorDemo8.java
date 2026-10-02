package com.operator.Operator;

import java.util.Scanner;

public class OperatorDemo8 {
    static void main(String[] args) {
        //输入一个四位数，并且判断它是不是回文数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个四位数");
        int num = sc.nextInt();
        int ge=num%10;
        int shi=num/10%10;
        int bai=num/100%10;
        int qian=num/1000%10;
        boolean isPalindrome = (ge==qian) && (shi==bai);
        System.out.println("这个数是不是回文数是"+isPalindrome);
    }
}
