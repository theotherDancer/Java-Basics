package com.StringTest3;

public class Test4 {
    static void main(String[] args) {
        //设计一个程序，将一个int数组中的所有元素拼接成为一个字符串
        int[] arr={1,2,3,4,5};
       /* String str="[";
        int i=0;
        for ( i = 0; i < arr.length-1; i++) {
            str+=(arr[i]+",");

               }
        while(i==4){
            str+=(arr[i]+"]");
            break;
        }
        System.out.println(str);*/
        System.out.println(Arrayutil.arrayToString(arr));
    }
}
