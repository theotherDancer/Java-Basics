package com.oop.toolclasstest;

public class Arrayutil {
    //这是一个数组的工具类
    private Arrayutil(){}
    //定义方法：静态
    public static void printarray(int arr[]){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if(i== arr.length-1) {
                System.out.println(arr[i] + "]");
             } else{
                    System.out.print(arr[i]+",");
                }


        }
    }
    public static double avg(int arr[]){
        double sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return (sum/ arr.length);


    }
}
