package com.operator.Operator;

import java.util.Scanner;

public class OperatorDemo11 {
    static void main(String[] args) {
        //寻找一个7的有缘数，它是一个二位整数，只要它包含7或者是7的倍数就可以称它为7的有缘数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个二位整数");
        int num = sc.nextInt();
      //下面进行数值拆分
        int ge=num%10;
        int shi=num/10%10;
        boolean is7 = (ge==7) || (shi==7) || (num%7==0);
        System.out.println("这个数是不是7的有缘数是"+is7);
    }
}
