package com.zhangyihang.search;

public class BinarySearch {
    static void main(String[] args) {
        int arr[]={2,2,3,4,8,67,89,98};
        int a=binarysearch(arr,3);
        System.out.println(a);
    }
    public static int binarysearch(int[]arr,int num){

        int min=0;
        int max=arr.length-1;
        while(true){
            int mid=(min+max)/2;
            if(min>max) {
                return -1;
            } else if(num>arr[mid]) {
                min = mid + 1;
            }else if(num<arr[mid]){
                max=mid-1;
            }else {
                return mid;//注意这里必须是mid，只有命中时只有一个元素的情形，min=mid=max
            }

        }

    }
}
