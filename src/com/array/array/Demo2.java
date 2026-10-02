package com.array.array;

import java.util.Scanner;

public class Demo2 {
    static void main(String[] args) {
        //键盘录入五个整数，把它们存储在数组中，并进行遍历
        int array[]=new int [5];
        for (int i = 0; i < array.length; i++) {
            System.out.println("请输入一个整数：");
            Scanner sc=new Scanner(System.in);
            int num= sc.nextInt();
            array[i]=num;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println("第"+(i+1)+"个元素是"+array[i]);
        }



    }
}
