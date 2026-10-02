package com.array.array;

import java.util.Scanner;

import static java.lang.IO.println;

public class Demo3 {
    static void main(String[] args) {
        //定义一个数组
        int array1[]={33,5,22,44,55,33};
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入一个整数");
        int count=0;
        int num=sc.nextInt();
        for (int i = 0; i < array1.length ; i++) {
            if (array1[i] == num) {
                println("您所输入的数字为数组的第" + (i + 1) + "个");
                count++;
                break;
            }
        }
            if(count==0)
                println("您所输入的数据不存在");




    }
}
