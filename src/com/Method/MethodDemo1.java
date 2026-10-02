package com.Method;

public class MethodDemo1 {
    public static void main(String[] args) {
        //定义一个方法，用来求两个数的和

        System.out.println(getsum(10,20));
    }
    public static int getsum(int a,int b){
        int sum=a+b;
        return sum;
    }
}
