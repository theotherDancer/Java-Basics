package com.variable;

import java.util.Scanner;

public class VariableDemo8
{
    static void main(String[] args) {
        Double height ;
        Double weight ;

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入身高：");
        height = sc.nextDouble();
        System.out.println("请输入体重：");
        weight = sc.nextDouble();
        Double bmi = weight/(height*height);
        System.out.println("BMI="+bmi);
    }
}
