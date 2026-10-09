package com.zhangyihang.mysort;

public class a05_quicklySort {
    static void main(String[] args) {
        //下面演示快速排序
        int arr[]={20,6,1,5,7,48,12,64,99,21};
        quicklySort(arr,0, arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }
    public static void quicklySort(int arr[],int i,int j){
        //递归出口
        if(i>=j)
            return;
        //确定基准数
        int basicNumber=arr[i];
        int start=i;
        int end=j;

        //大循环：
        while(start!=end){
            while (end>start&&arr[end]>=basicNumber){
                end--;
            }
            while (start<  end&&arr[start]<=basicNumber){
                start++;
            }
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
        }int temp=arr[i];
        arr[i]=arr[start];
        arr[start]=temp;
        //确定基准数左边的范围，再次调用
        quicklySort(arr,i,start-1);
        //确定基准数右边的范围，再次调用
        quicklySort(arr,start+1,j);
    }

}
