package com.operator.Operator;

import java.util.Scanner;

public class OperatorDemo7
{
    static void main(String[] args) {
        //输入两个人的身高，判断谁更高一些
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个人的身高");
        double height1 = sc.nextDouble();
        System.out.println("请输入第二个人的身高");
        double height2 = sc.nextDouble();
        boolean isHigher = height1>height2;
        System.out.println("第一个人更高更高一些是"+isHigher);
    }
}
