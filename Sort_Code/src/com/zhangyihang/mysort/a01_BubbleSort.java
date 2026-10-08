package com.zhangyihang.mysort;
//以下演示冒泡排序
public class a01_BubbleSort {
    static void main(String[] args) {
        //所谓冒泡排序，就是从起点开始，两个逐个比较，当左大于右，就交换位置，直到比到终点，
        // 容易发现，第一轮循环过后，最后一个元素一定是最大的，那我们需要再循环几轮
        int arr[]={2,4,5,3,1};
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {

            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                 }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println("\n"+"这就是冒泡排序！");

    }
}
