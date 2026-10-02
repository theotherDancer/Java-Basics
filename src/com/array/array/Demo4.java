package com.array.array;

import java.util.Random;

public class Demo4 {
    static void main(String[] args) {
        int[]array={1,2,3,4,5,6,7,8,9,10};
        Random r=new Random();//随机数生成器
        for (int i = 0; i < array.length ; i++) {
            int temp=array[i];
            int randomIndex= r.nextInt(array.length);
            array[i]=array[randomIndex];
            array[randomIndex]=temp;
        }
        for (int i = 0; i < array.length ; i++) {
            System.out.println(array[i]);

        }
    }
}
