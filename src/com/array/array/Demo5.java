package com.array.array;

import java.util.Random;

public class Demo5 {
    static void main(String[] args) {
    //动态定义一个数组
        //随机数生成，遍历，是否相等，如果相等，计数器运作，如果计数器运作，那么把随机数记录到数组中，
        //最后遍历数组进行输出
        int arr[]=new int [10];
        Random r=new Random();
        for (int i = 0; i < arr.length ; ) {
        int num= r.nextInt( 100)+1;
        int count=0;
            for (int j = 0; j< arr.length ; j++) {
                if(num==arr[j]){
                    count++;
                    break;
                }
            }
            if(count==0){
                arr[i]=num;
                i++;
            }
        }
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");

        }
    }
}
