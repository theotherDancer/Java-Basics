package com.variable;

public class Variable5
{
    static void main(String[] args) {
        //BMI=体重/身高^2
        //1.定义一个变量记录体重
        double weight = 50.0;
        //2.定义一个变量记录身高
        double height = 1.7;
        //3.计算BMI
        double bmi = weight/(height*height);
        //4.输出BMI
        System.out.println("BMI="+bmi);
    }
}
