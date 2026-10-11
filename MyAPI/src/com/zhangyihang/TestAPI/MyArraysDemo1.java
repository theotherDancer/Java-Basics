package com.zhangyihang.TestAPI;

import java.util.Arrays;

//Arrays:
public class MyArraysDemo1 {
    static void main(String[] args) {
        //1.toString:可以讲将数组拼接成字符串
        int arr[]={1,2,4,5,6};
        System.out.println(Arrays.toString(arr));
        //2.binarySearch:返回元素的索引
        //如果查找的元素不存在，那么返回负的插入点的索引值减一
        System.out.println(Arrays.binarySearch(arr, 6));
        //3.copyOf
        int []arr1=Arrays.copyOf(arr,5);
        int []arr2=Arrays.copyOf(arr,6);
        int []arr3=Arrays.copyOf(arr,7);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
        //4.copyOfRange:(区间左闭右开）
        int []arr4=Arrays.copyOfRange(arr,1,2);
        System.out.println(Arrays.toString(arr4));
        //5.fill：将数组中的元素全部填充成这个数
        Arrays.fill(arr,114514);
        System.out.println(Arrays.toString(arr));
        //6.sort：排序，默认升序
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
        //降序排序:通过将原数列每一个元素乘-1，再进行升序排序，
        // 对于排序以后的结果再乘-1进行还原
        //毫无疑问，这是天才的想法！
        MyArraysDemo1.sort1(arr1);
        System.out.println(Arrays.toString(arr1));

    }
    public static int[] sort1(int[]arr){
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            arr[i]=arr[i]*(-1);
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            arr[i]=arr[i]*(-1);
        }
        return arr;
    }
}
