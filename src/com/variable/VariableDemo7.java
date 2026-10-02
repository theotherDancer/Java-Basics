package com.variable;

import java.util.Scanner;

public class VariableDemo7
{
    static void main(String[] args) {
        //定义两个整数类型的变量，键盘输入两个整数，之后打印出这两个整数的和
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a + b;
        System.out.println(c);
    }
}
