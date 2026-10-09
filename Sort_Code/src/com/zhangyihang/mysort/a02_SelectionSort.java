package com.zhangyihang.mysort;

public class a02_SelectionSort {
    static void main(String[] args) {
        //1.从0索引开始，跟后面的元素一一比较
        //2.小的放前面，大的放后面
        //3.第一次循环结束后，最小的数值已经确定
        //4.开始下一次循环，从1索引开始
        int arr[]={2,4,5,1,3};
        //外循环：这里的指标是初始的索引对象
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

}
